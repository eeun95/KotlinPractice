package com.example.kotlinpractice

// 1. Lamda
// 람다식은 우리가 마치 value처럼 다룰 수 있는 익명함수이다.
// 1) 메소드의 파라미터로 넘겨줄 수가 있다. fun maxBy(a : Int)
// 2) return 값으로 사용할 수가 있다.

// 람다의 기본정의
// val lamdaName : Type = {argumentList -> codeBody}

val square : (Int) -> (Int) = {number : Int -> number*number}

val nameAge = {name : String, age:Int ->
    "my name is ${name} I'm ${age}"

}

fun main() {
    println(square(12))
    println(nameAge("eun", 28))

    val a = "potato"
    val b = "eun said "
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("eun", 28))

    println(calculateGrade(90))
    println(calculateGrade(900))

    val lamda = {number : Double ->
        number == 4.3213
    }
    println(invokeLamda(lamda))
    println(invokeLamda({ it > 3.27}))

    // funtion의 마지막 파라미터가 람다식일 경우 소괄호 생략 가능
    invokeLamda { it > 3.27 }


}

// 확장함수

val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"
}

// this : 시작함수를 콜하는 오브젝트를 가리킴
// it : 하나 들어가는 파라미터의 경우 생략가능하여 it으로 사용
fun extendString(name : String, age : Int) : String {
    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)

}

// 람다의 Return (마지막 한줄이 리턴값을 의미)
// 파라미터에 소괄호는 필수
val calculateGrade : (Int) -> String = {
    when (it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

// 람다를 표현하는 여러가지 방법
fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}

