package com.example.kotlinpractice

// pojo 클래스 (모델이 되는 클래스) - 딱히 그 안에서 메소드가 작동을 하는 것이 아니라 비어있는 틀 역할을 하는 클래스
// Data Class 말 그대로 data를 담는 그릇이 되는 클래스
// pojo 클래스를 만들기 위해 자바에선 일일이 써줬지만 불필요한 코드를 코틀린에서 제거함

data class Ticket(val airName : String, val name : String, var date : String, var seatNo : Int)
// 이 데이터 클래스 이용 시 컴파일하면 자동으로 만들어짐 (코드 바디 없이 만들어짐)
// toString(), hashCode(), equals(), copy()

class TicketNormal(val airName : String, val name : String, var date : String, var seatNo : Int)

fun main() {
    val ticketA = Ticket("koreanAir", "eun", "2022-04-26", 1)
    val ticketB = TicketNormal("koreanAir", "eun", "2022-04-26", 1)

    println(ticketA)
    println(ticketB)
}