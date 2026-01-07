fun main()
{
    var a=45
    var b=35
    if(a>b) println("true")
    else println("false")

    //There is no ternary operator in kotlin, but we can use if inline in
    // statements as an expressions
    println(if(a>b) a else b)

}