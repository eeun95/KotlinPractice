package com.example.kotlinpractice

// class Human constructor ()
open class Human (val name: String = "anonymous") {

    // 주생성자
    init {
        println("생성자 느낌 ...")
    }

    // 부생성자 (this를 사용해서 주생성자를 상속받아야함)
    constructor(name:String, age:Int) : this(name) {
        println("안녕 내이름은 ${name}이고 ${age}살이야")
    }

    fun eatingCake () {
        println("마시쩌")
    }

    open fun hihi() {
        println("hello")
    }
}

class Korean : Human() {
    // 코틀린은 같은 파일 내에 있어도 접근이 불가하기 때문에 open으로 상속받을 클래스에 접근가능하도록 함

    override fun hihi() {
        super.hihi()
        println("안녕하세요")
    }

}
fun main() {
    val human = Human("eun")
    val human2 = Human()

    val me = Human("eunkyung", 28)

    human.eatingCake()

    println("내 이름은 ${human.name}")
    println("내 이름은 ${human2.name}")

    val korean = Korean()
    korean.hihi()

}