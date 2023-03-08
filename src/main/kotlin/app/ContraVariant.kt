package app

class ContraVariant<in T> {
    fun sayHello(param: T) {
        println("Hello $param")
    }
}

fun main() {
    val contraVariantAny = ContraVariant<Any>()
    val contraVariantString: ContraVariant<String> = contraVariantAny

    contraVariantString.sayHello("Andry")
}