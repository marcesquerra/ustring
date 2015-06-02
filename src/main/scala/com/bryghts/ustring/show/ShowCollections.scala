package com.bryghts.ustring
package show

import scala.language.higherKinds

/**
 * Created by Marc Esquerrà on 01/08/2014.
 */
trait ShowCollections extends ShowStrings
                         with ShowTuples
{

    implicit def showArray[T](implicit show: Show[T]): Show[Array[T]]            = Show(a => RenderHelpers.renderArray(a, u"Array"))
    implicit def showTraversable[C[X] <: Traversable[X], T: Show]: Show[C[T]]    = Show(a => RenderHelpers.renderCollection(a.toTraversable, a.stringPrefix.toUString))
    implicit def showMap[M[X, Y] <: Map[X, Y], A: Show, B: Show]: Show[M[A, B]]  = Show(a => RenderHelpers.renderCollection(a.toTraversable, a.stringPrefix.toUString))
    implicit def showOption[O[X] <: Option[X], T : Show]: Show[O[T]]             = Show[O[T]]{a => RenderHelpers.renderOption(a)}
}

object RenderHelpers extends ShowStrings {

    def renderOption[T](o: Option[T])(implicit s: Show[T]): UString = o match {
        case Some(a) => u"Some(" + a + u")" // (UStringShow)
        case _       => u"None"
    }

    def renderCollection[T](a: Traversable[T], prefix: UString)(implicit s: Show[T]): UString =
        addString(a, prefix + u"(", u", ", u")")(s)

    def renderArray[T](a: Array[T], prefix: UString)(implicit s: Show[T]): UString =
        addString(a, prefix + u"(", u", ", u")")(s)

    def addString[T](a: Array[T], start: UString, sep: UString, end: UString)(implicit s: Show[T]): UString = {
        var first = true
        var r = u""

        r += start
        var i = 0
        while (i < a.length) {
            val x = a(i)
            if (first) {
                r += x
                first = false
            }
            else {
                r += sep
                r += x
            }
            i+=1
        }
        r += end

        r
    }

    def addString[T](a: Traversable[T], start: UString, sep: UString, end: UString)(implicit s: Show[T]): UString = {
        var first = true
        var r = u""

        r += start
        for (x <- a) {
            if (first) {
                r += x
                first = false
            }
            else {
                r += sep
                r += x
            }
        }
        r += end

        r
    }
}
