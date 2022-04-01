package com.example.kotlinpractice

fun main() {

    var name : String = "hihi"
    println("hello ${name} \$룰루루")

    println(compare(1, 2))
    println(maxBy(2, 3))
    checkNum(80)

}

fun compare(a : Int, b : Int) : Int {

    if(a > b) {
        return a
    } else {
        return b
    }
}

fun maxBy(a : Int, b : Int) = if(a>b) a else b

fun checkNum(score : Int) {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("IDK")
    }

    var b = when(score) {
        1->1
        2->2
        else->3
    }

    println("b의 값은 ???? ${b}")

    when(score) {
        in 90..100 -> println("great")
        in 10..80 -> println("soso")
        else -> println("good")
    }
}

fun array() {
    val array: Array<Int> = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "ddd", 2.4f)
    val list2 = listOf(1, "d", 1L)

    // array는 값 바꾸기가 가능하지만 List는 읽기 전용임 , MutableList는 읽기쓰기 가능

}