package com.bryghts.ustring
package show

import scala.language.implicitConversions

/**
 * Created by Marc Esquerrà on 01/08/2014.
 */
trait ShowStrings
{

    implicit def showUString = Show[UString] (identity)
    implicit def shosString  = Show[String]  (UString.apply)

}

