package app

import data.MyData

fun main() {
    val myData: MyData<String, Int> = MyData<String, Int>("Andry", 100)
    myData.printlnData()

//    val myIntData: MyData<Int> = MyData<Int>(100)
//    myIntData.printlnData()
}