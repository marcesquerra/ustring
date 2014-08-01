package com.bryghts.ustring

import scala.collection.mutable.Builder

/**
 * Created by Marc Esquerrà on 31/07/2014.
 */

class UStringBuilder extends Builder[UCharacter, UString]
{
    val internal = StringBuilder.newBuilder

    override def +=(elem: UCharacter) = {
        Character.toChars(elem.codePoint).foreach(c => internal += c)
        this
    }

    override def result() = UString(internal.result())

    override def clear() = internal.clear()

    override def sizeHint(size: Int) = internal.sizeHint(size)
}

