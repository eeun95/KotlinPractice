package com.example.kotlinpractice

// Singleton Pattern
// CarFactory의 새로운 객체를 만드는 것이 아닌 이 클래스 파일을 읽을 때 딱 한번 객체를 생성함
// 불필요한 메모리 사용 방지
object CarFactory {
    val cars = mutableListOf<Car>()
    fun makeCar(horsePower : Int) : Car {
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val horsePower : Int)

fun main() {
    val car = CarFactory.makeCar(10)
    var car2 = CarFactory.makeCar(200)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}