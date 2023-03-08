package app

import java.time.Year
import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

class LogObservableProperty<T>(param: T) : ObservableProperty<T>(param) {
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("Before change ${property.name} from $oldValue to $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("After change ${property.name} from $oldValue to $newValue")
    }
}

class Car(brand: String, year: Int) {
    var brand: String by LogObservableProperty(brand)
    var year: Int by LogObservableProperty(year)
    var owner: String by Delegates.notNull<String>()
}

fun main() {
    var car = Car("Toyota", 2020)

    car.brand = "Wuling"
    println(car.brand)

    car.year = 2023
    println(car.year)

    car.owner = "Andry"
    println(car.owner)
}