package com.bryghts.ustring
package show

import scala.language.higherKinds

/**
 * Created by Marc Esquerrà on 01/08/2014.
 */
trait ShowCollections
{

    implicit def showUString: Show[UString] = Show(identity)
    implicit def showArray[T](implicit show: Show[T]): Show[Array[T]]           = Show(a => renderCollection(a, u"Array"))
    implicit def showTraversable[C[X] <: Traversable[X], T: Show]: Show[C[T]]   = Show(a => renderCollection(a, a.stringPrefix.toUString))
    implicit def showMap[M[X, Y] <: Map[X, Y], A: Show, B: Show]: Show[M[A, B]] = Show(a => renderCollection(a, a.stringPrefix.toUString))

    implicit def showOption[O[X] <: Option[X], T : Show]: Show[O[T]] = Show[O[T]]{
        case Some(a) => u"Some(" + a.toUString + u")"
        case _       => u"None"
    }


    private def renderCollection[C[X] <: Traversable[X], T: Show](a: C[T], prefix: UString): UString =
        addString(a, prefix + u"(", u", ", u")")

    private def renderCollection[T: Show](a: Array[T], prefix: UString): UString =
        addString(a.toTraversable, prefix + u"(", u", ", u")")

    private def addString[C[X] <: Traversable[X], T: Show](a: C[T], start: UString, sep: UString, end: UString): UString = {
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
