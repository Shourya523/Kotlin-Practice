fun main(args:Array<String>)
{
    var a :Int = 14
    println(a)
    a=34
    a+=3
    println(a)
    var c: Int=36
    println(c)
    val b: Boolean =true
    println(b)

    // String interpolation
    println("value of a is: $a")
    println("value of c is: $c")

    //Operators:arithmetic
    println("Value of a+c =${a+c}")
    println("Value of a-c =${a-c}")
    println("Value of a*c=${a*c}")
    println("Value of a/c = ${a/c.toFloat()}")
    println("Value of a%c =${a%c}")



}
