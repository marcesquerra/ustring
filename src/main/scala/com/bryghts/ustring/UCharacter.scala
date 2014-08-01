package com.bryghts.ustring

/**
 * Created by Marc Esquerrà on 30/07/2014.
 */
class UCharacter(val codePoint: Int) extends AnyVal
{

    override def toString():String = new String(Character.toChars(codePoint))

    def toLower = new UCharacter(Character.toLowerCase(codePoint))
    def toUpper = new UCharacter(Character.toUpperCase(codePoint))
}
