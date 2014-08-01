package com.bryghts.ustring.show

import com.bryghts.ustring.UString

/**
 * Typeclass that allows the implementation of a method to convert an instance of type T into a UString
 *
 * @tparam T The type that this Show will be able to convert into a UString
 *
 *
 * Created by Marc Esquerrà on 30/07/2014.
 */
trait Show[T] {

    /**
     * A method capable of converting an instance of type T into a UString
     */
    def toUString(in: T): UString

}

/**
 * The Show companion object holds a couple of factory methods that helps to create a Show
 */
object Show {

    /**
     * Generates a Show instance that uses the provided method to the the actual conversion
     *
     * @param  f A method capable of converting an instance of T into a UString
     * @tparam T The type the generated show will be capable of converting
     *
     * @return The generated Show
     */
    def apply[T](f: T => UString): Show[T] = new GenShow(f)

    /**
     * Generates a Show that gets an instance of type T and converts it into a UString, using the instance's `toString`
     * method.
     *
     * @tparam T The type the generated show will be capable of converting
     *
     * @return The generated Show
     */
    def forType[T]: Show[T] = new GenShow(a => UString(a.toString))

}

private class GenShow[T](f: T => UString) extends Show[T] {
    override def toUString(in: T): UString = f(in)
}