package com.example.kotlinpractice

fun main() {

    var name : String = "hihi"
    println("hello ${name} \$룰루루")

    println(compare(1, 2))
    println(maxBy(2, 3))
    checkNum(80)
    forAndWhile()

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

    var result = list.get(0)

    var arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 20
    // val로 바꿔도 무관한 이유는 list에는 이미 참조값이 있기 때문, 주소값이 바뀌지 않으므로 상관없다

    /*
    오류가 나는 경우는 이렇게 변수에 새로운 참조값을 넣어주는 경우
    arrayList = arrayListof()
     */

}

fun forAndWhile() {
    val students = arrayListOf("eun", "eun2", "eun3")

    for (name in students) {
        println(name)

    }

    var sum = 0;
    for (i in 1..10 step 2) {
        sum += i
        // 스텝2는 i+=2 같은
    }
    for(i in 10 downTo 1) {
        // 10에서부터 차례로 밑으로
    }
    for(i in 1 until 100) {
        // 1부터 99까지 돌림 1..100 은 1부터 100까지
    }
    println(sum)
}