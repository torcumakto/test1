package com.example.test1

fun main() {
    val result = test(1 )
    test2(id = "하하", name = "히히", nickname = "헝헝")
    println("Hello world!!")
}

//todo 2.함수


fun test(a: Int, b: Int = 3) :Int {
    val b=3
    println(a+b)
    return a+b
}

fun test2(name : String,nickname:String, id: String){

}