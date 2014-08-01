package com.bryghts.ustring


import com.bryghts.ustring.show.Show

import scala.collection.mutable.Builder
import scala.collection.{TraversableOnce, GenTraversable, TraversableLike}

/**
 * Created by Marc Esquerrà on 30/07/2014.
 */
class UString private(private val data: Vector[String]) extends Traversable[UCharacter]
                                                           with TraversableLike[UCharacter, UString]
                                                           with GenTraversable[UCharacter]
                                                           with TraversableOnce[UCharacter]
{

    override def foreach[U](f: (UCharacter) => U) = {
        for(s <- data) {
            var i = 0

            while(i < s.length) {
                val cp = s.codePointAt(i)
                f(new UCharacter(cp))
                i += Character.charCount(cp)
            }
        }
    }

    override def toString() = mkString

    def +[T] (other: T)(implicit show: Show[T]) = new UString(data ++ show.toUString(other).data)


    override protected[this] def newBuilder: Builder[UCharacter, UString] = new UStringBuilder

    override def seq = toList
}

object UString// extends GenericCompanion[UString]
{

    def apply(in: CharSequence): UString = new UString(Vector(in.toString))

}

