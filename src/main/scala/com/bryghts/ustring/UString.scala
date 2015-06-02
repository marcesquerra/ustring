package com.bryghts.ustring


import com.bryghts.ustring.show.Show

import scala.collection.immutable.rrbvector.RRBVector
import scala.collection.mutable.Builder
import scala.collection.{TraversableOnce, GenTraversable, TraversableLike}

/**
 * Created by Marc Esquerrà on 30/07/2014.
 */
class UString private(private val data: RRBVector[String]) extends Traversable[UChar]
                                                              with TraversableLike[UChar, UString]
                                                              with GenTraversable[UChar]
                                                              with TraversableOnce[UChar]
{

    override def foreach[U](f: (UChar) => U) = {
        for(s <- data) {
            var i = 0

            while(i < s.length) {
                val cp = s.codePointAt(i)
                f(new UChar(cp))
                i += Character.charCount(cp)
            }
        }
    }

    override def toString(): String = mkString

    def +[T] (other: T)(implicit show: Show[T]) =
        new UString(data ++ show.toUString(other).data)

    override protected[this] def newBuilder: Builder[UChar, UString] = new UStringBuilder

    override def seq = toList

    override lazy val size = super.size
}

object UString
{

    def apply(in: CharSequence) =
        new UString(RRBVector(in.toString))

}

