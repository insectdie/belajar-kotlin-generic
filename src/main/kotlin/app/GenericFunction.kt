package app

import data.Function

fun main() {
    val function = Function("Andry")

    function.sayHello("Budi")
    function.sayHello<String>("Budi")

    function.sayHello(10)
    function.sayHello<Int>(10)
}