package com.bryghts

import com.bryghts.ustring.show._

import scala.collection.generic.CanBuildFrom
import scala.collection.mutable.Builder

/**
 * Created by Marc Esquerrà on 30/07/2014.
 */
package object ustring extends ShowStrings
                          with ShowCollections
                          with ShowTuples
                          with ShowPrimitives
{

    implicit class ShowHelper[A](val a: A) extends AnyVal {
        def toUString(implicit show: Show[A]):UString = show.toUString(a)
    }

    implicit class UStringHelper(val sc: StringContext) extends AnyVal {
        def u(): UString = UString(sc.parts.head)
    }

    implicit val CanBuildObject: CanBuildFrom[UString, UChar, UString] = new CanBuildFrom[UString, UChar, UString]()
    {
        override def apply(from: UString): Builder[UChar, UString] = new UStringBuilder()

        override def apply(): Builder[UChar, UString] = new UStringBuilder()
    }

}


import ustring._

object Sample extends App {

    val tmp:UString = u"ABC" + u"DEF" + Seq(Array(Set(u"ABC", u"DCF")), Array(Set(u"A"))) + (u"ABC", u"CDE", u"CDE", u"CDE", u"CDE", u"CDE", u"CDE", u"CDE") + Map(3 -> u"Abc") + false
//
//    List()
//
    println(tmp.map(_.toUpperCase))


//    def generate(count: Int) {
//
//        val tail:Char = ('A' + (count - 1)).toChar
//        val elements = 'B' until tail
//        val head = 'A'
//        val lowHead = head.toLower
//        val lowTail = tail.toLower
//
//        println(s"    implicit def showTuple$count[$head : Show,")
//        for(elem <- elements)
//        println(s"                            $elem : Show,")
//        println(s"                            $tail : Show]: Show[($head,")
//        for(elem <- elements)
//        println(s"                                             $elem,")
//        println(s"                                             $tail)] = GenShow{case ($lowHead,")
//        for(lowElem <- elements.map(_.toLower))
//        println(s"                                                                 $lowElem,")
//
//        println(s"""                                                                 ${lowTail}) =>  u"(" + $lowHead.show + u", " +""")
//
//        for(lowElem <- elements.map(_.toLower))
//        println(s"""                                                                               $lowElem.show + u", " +""")
//        println(s"""                                                                               $lowTail.show + u")"}""")
//        println()
//
//    }
//
//    for(c <- 3 to 22) generate(c)
}




/*

 */
