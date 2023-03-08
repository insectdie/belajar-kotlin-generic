package app

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class LogOnlyReadProperty(val data: String): ReadOnlyProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Access property ${property.name} with value $data")
        return data.toUpperCase()
    }
}

class NameWithLog(param: String) {
    val name : String by LogOnlyReadProperty(param)
}

fun main() {
    val nameWithLog = NameWithLog("Andry Ompusunggu")
    println(nameWithLog.name)
    println(nameWithLog.name)
}