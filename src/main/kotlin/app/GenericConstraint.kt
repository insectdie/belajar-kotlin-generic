package app

interface CanSayHello {
    fun sayHello(name: String)
}

open class Employee

class Manager : Employee()

class VicePrecident: Employee(), CanSayHello {
    override fun sayHello(name: String) {
        println("Hello $name, I'm vice president")
    }
}

class Company<T>(val employee: T) where T : Employee, T : CanSayHello

fun main() {
//    val data1 = Company(Employee())
//    val data2 = Company(Manager())
    val data3 = Company(VicePrecident())
//    val data4 = Company( "String") // error

}