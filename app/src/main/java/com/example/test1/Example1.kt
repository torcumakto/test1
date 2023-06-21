package com.example.test1

fun main() {
    max(10,3)

}

fun max(a:Int, b:Int) {
    val result = if(a>b){
        println(a)
    } else {
        println(b)
    }
    println(result)
}

fun max(a:Int, b:Int) {
    val result = if(a>b) a else b
    println(result)
}

fun isHoliday (dayOfWeek: String) {
    when(val day = dayOfWeek)
}