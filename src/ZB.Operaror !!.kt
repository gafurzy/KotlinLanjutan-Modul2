fun main(args: Array<String>) {
    //Null safety
    //The !! operator
    var maybeNumber: Int? = 15
    println(maybeNumber!! * 2)

    if(null.also { maybeNumber = it } == true)
    println(maybeNumber!! * 2)
    else
    println("The entered value isn't a number")

//Conditions
    if (maybeNumber != null)
        println(maybeNumber!! * 2)
    else
        println("The entered value isn't a number")
}