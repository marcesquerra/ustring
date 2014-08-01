# UString

```scala

    val str = u"Hello World"

    println(str)
```

<br/>
<br/>


*UString* is an experimental replacement to the standard String class, that aims to:

1. Keep the internal storage of strings as UTF-16
2. Use it as a chain of UTF-32 codepoints

<br/>
<br/>

This means the appearance of two new types:

*UCharacter*: The UTF-32 of the Char type

*UString*: A `Traversable[UCharacter]` (internally represented with UTF-16 characters)

<br/>
<br/>

Consequences:
* The size() and the access per index have a linear cost (i.e. the bigger the String, bigger the time to execute this two methods)
* The iteration time has the same cost than in standard strings

Given that, why not internally store a `Vector[String]` inside each UString? With that, there is no change in the performance characteristics I've mentioned before *and* suddenly the concatenation of string is (nearly) constant time.

<br/>
<br/>


## Features

* Use the UString as a chain of UTF-32 UCharacters
* A UString uses up, roughly the same memory than a regular String
* Constant concatenation time!
* Using the Show typeclass to convert things into UStrings (including Arrays)
* Anything that have a Show typeclass can be concatenated with a UString
* Generate constant UStrings with the 'u' interpolator



## Examples

UString creation:
```scala

    import com.bryghts.ustring._

    val str1 = u"Hello"
    val str2 = UString("World")

```

UString concatenation:
```scala

    import com.bryghts.ustring._

    val str3 = u"Three: " + 3
    val str4 = u"Values: " + List(1, 2, 3)

```

Creating a typeclass to encode how to convert something into a UString:
```scala

    import com.bryghts.ustring._
    import com.bryghts.ustring.show._

    case class Person(name: UString, age: Int)

    object Converters
    {
        implicit def showPerson = Show[Person]{
            case Person(name, age) => u"Person(" + name + u", " + age +  u")"
        }
    }

```

That can be used to append the resulting UString with another UString:
```scala

    import Converters._

    val str5 = u"Person: " + Person(u"Arthur", 42)

    println(str5)

```

Or to convert the object directly to a UString
```scala

    import Converters._

    val str6 = Person(u"Luck", 62).toUString

    println(str6)

```
