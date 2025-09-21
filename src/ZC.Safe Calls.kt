fun main(args: Array<String>) {
//Safe calling
//?.let
    var maybeNumber: Int? = 16
    maybeNumber?.let { println(it) }
//The ?. chaining
//student?.teacher?.supervisor?.name = "Seymour Skinner"
}