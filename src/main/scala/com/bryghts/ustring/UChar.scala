package com.bryghts.ustring

import scala.runtime.{IntegralProxy}

/**
 * Created by Marc Esquerrà on 30/07/2014.
 */
class UChar(val codePoint: Int) extends IntegralProxy[Int]
{
    import UChar._

    if (!Character.isValidCodePoint(codePoint))
        throw new RuntimeException("A UChar is a valid unicode character")

    override protected implicit def num: Integral[Int] = scala.math.Numeric.IntIsIntegral
    override protected def ord: Ordering[Int] = scala.math.Ordering.Int
    override def self: Int = codePoint

    override def toString():String = new String(Character.toChars(codePoint))
    override def hashCode():Int = codePoint

    def toLowerCase       = new UChar(Character.toLowerCase(codePoint))
    def toUpperCase       = new UChar(Character.toUpperCase(codePoint))
    def toTitleCase       = Character.toTitleCase(codePoint)

    override def equals(that: Any):Boolean =
        that match {
            case UChar(c) => c == codePoint
            case _ => false
        }

    def === (that: UChar):Boolean                   = codePoint == that.codePoint
    def !== (that: UChar):Boolean                   = codePoint != that.codePoint
    def <   (that: UChar):Boolean                   = codePoint <  that.codePoint
    def >   (that: UChar):Boolean                   = codePoint >  that.codePoint
    def <=  (that: UChar):Boolean                   = codePoint <= that.codePoint
    def >=  (that: UChar):Boolean                   = codePoint >= that.codePoint


    def asDigit(radix: Int): Option[Int]            = Some(Character.digit(codePoint, radix)).filter(_ >= 0)
    def asDigit: Option[Int]                        = asDigit(Character.MAX_RADIX)

    def isControl: Boolean                          = Character.isISOControl(codePoint)
    def isDigit: Boolean                            = Character.isDigit(codePoint)
    def isLetter: Boolean                           = Character.isLetter(codePoint)
    def isLetterOrDigit: Boolean                    = Character.isLetterOrDigit(codePoint)
    def isWhitespace: Boolean                       = Character.isWhitespace(codePoint)
    def isSpaceChar: Boolean                        = Character.isSpaceChar(codePoint)
    def isUnicodeIdentifierStart: Boolean           = Character.isUnicodeIdentifierStart(codePoint)
    def isUnicodeIdentifierPart: Boolean            = Character.isUnicodeIdentifierPart(codePoint)
    def isIdentifierIgnorable: Boolean              = Character.isIdentifierIgnorable(codePoint)
    def isMirrored: Boolean                         = Character.isMirrored(codePoint)

    def isLower: Boolean                            = Character.isLowerCase(codePoint)
    def isUpper: Boolean                            = Character.isUpperCase(codePoint)
    def isTitleCase: Boolean                        = Character.isTitleCase(codePoint)
    def isDefined: Boolean                          = Character.isDefined(codePoint)


    def getType: Int                                = Character.getType(codePoint)
    def getNumericValue: Int                        = Character.getNumericValue(codePoint)
    def getDirectionality: Option[Directionality]   = Directionality(Character.getDirectionality(codePoint))
}

object UChar {

    def apply(codePoint: Int) = new UChar(codePoint)

    def unapply(in: Any): Option[Int] = in match {
        case u: UChar => Some(u.codePoint)
        case _ => None
    }

    def forDigit(digit: Int, radix: Int): Option[UChar] =
        Some(Character.forDigit(digit, radix).toInt)
            .filter(_ > '\u0000')
            .map(apply)

    import com.bryghts.enumeration.Enum

    sealed trait Directionality{val value: Byte}
    object Directionality extends Enum[Directionality] {
        /**
         * Strong bidirectional character type "L" in the Unicode specification.
         */
        case object LeftToRight extends Directionality {
            val value: Byte = Character.DIRECTIONALITY_LEFT_TO_RIGHT
        }
        /**
         * Strong bidirectional character type "R" in the Unicode specification.
         */
        case object RightToLeft extends Directionality {
            val value: Byte = Character.DIRECTIONALITY_RIGHT_TO_LEFT
        }
        /**
         * Strong bidirectional character type "AL" in the Unicode specification.
         */
        case object RightToLeftArabic extends Directionality {
            val value: Byte = Character.DIRECTIONALITY_RIGHT_TO_LEFT_ARABIC
        }
        /**
         * Weak bidirectional character type "EN" in the Unicode specification.
         */
        case object EuropeanNumber extends Directionality {
            val value: Byte = Character.DIRECTIONALITY_EUROPEAN_NUMBER
        }
        /**
         * Weak bidirectional character type "ES" in the Unicode specification.
         */
        case object EuropeanNumberSeparator extends Directionality {
            val value: Byte = Character.DIRECTIONALITY_EUROPEAN_NUMBER_SEPARATOR
        }
        /**
         * Weak bidirectional character type "ET" in the Unicode specification.
         */
        case object EuropeanNumberTerminator extends Directionality {
            val value: Byte = Character.DIRECTIONALITY_EUROPEAN_NUMBER_TERMINATOR
        }
        /**
         * Weak bidirectional character type "AN" in the Unicode specification.
         */
        case object ArabicNumber extends Directionality {
            val value: Byte = Character.DIRECTIONALITY_ARABIC_NUMBER
        }
        /**
         * Weak bidirectional character type "CS" in the Unicode specification.
         */
        case object CommonNumberSeparator extends Directionality {
            val value: Byte = Character.DIRECTIONALITY_COMMON_NUMBER_SEPARATOR
        }
        /**
         * Weak bidirectional character type "NSM" in the Unicode specification.
         */
        case object NonspacingMark extends Directionality {
            val value: Byte = Character.DIRECTIONALITY_NONSPACING_MARK
        }
        /**
         * Weak bidirectional character type "BN" in the Unicode specification.
         */
        case object BoundaryNeutral extends Directionality {
            val value: Byte = Character.DIRECTIONALITY_BOUNDARY_NEUTRAL
        }
        /**
         * Neutral bidirectional character type "B" in the Unicode specification.
         */
        case object ParagraphSeparator extends Directionality {
            val value: Byte = Character.DIRECTIONALITY_PARAGRAPH_SEPARATOR
        }
        /**
         * Neutral bidirectional character type "S" in the Unicode specification.
         */
        case object SegmentSeparator extends Directionality {
            val value: Byte = Character.DIRECTIONALITY_SEGMENT_SEPARATOR
        }
        /**
         * Neutral bidirectional character type "WS" in the Unicode specification.
         */
        case object Whitespace extends Directionality {
            val value: Byte = Character.DIRECTIONALITY_WHITESPACE
        }
        /**
         * Neutral bidirectional character type "ON" in the Unicode specification.
         */
        case object OtherNeutrals extends Directionality {
            val value: Byte = Character.DIRECTIONALITY_OTHER_NEUTRALS
        }
        /**
         * Strong bidirectional character type "LRE" in the Unicode specification.
         */
        case object LeftToRightEmbedding extends Directionality {
            val value: Byte = Character.DIRECTIONALITY_LEFT_TO_RIGHT_EMBEDDING
        }
        /**
         * Strong bidirectional character type "LRO" in the Unicode specification.
         */
        case object LeftToRightOverride extends Directionality {
            val value: Byte = Character.DIRECTIONALITY_LEFT_TO_RIGHT_OVERRIDE
        }
        /**
         * Strong bidirectional character type "RLE" in the Unicode specification.
         */
        case object RightToLeftEmbedding extends Directionality {
            val value: Byte = Character.DIRECTIONALITY_RIGHT_TO_LEFT_EMBEDDING
        }
        /**
         * Strong bidirectional character type "RLO" in the Unicode specification.
         */
        case object RightToLeftOverride extends Directionality {
            val value: Byte = Character.DIRECTIONALITY_RIGHT_TO_LEFT_OVERRIDE
        }
        /**
         * Weak bidirectional character type "PDF" in the Unicode specification.
         */
        case object PopDirectionalFormat extends Directionality {
            val value: Byte = Character.DIRECTIONALITY_POP_DIRECTIONAL_FORMAT
        }

        private val reverseLookup =
            values
                .map{v => (v.value, v)}
                .toMap

        def apply(in: Byte):Option[Directionality] =
            reverseLookup
                .get(in)
    }
}


