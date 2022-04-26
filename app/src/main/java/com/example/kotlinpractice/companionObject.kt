package com.example.kotlinpractice

// java static을 대신해 사용함 정적메소드

// 다른 곳에서 객체 생성 못하게끔
class Book private constructor(val id: Int, val name: String) {

    // 이게 없으면 main에서 book 객체 생성 불가
    companion object BookFactory : IdProvider{

        override fun getId(): Int {
            return 777
        }

        val myBook = "animal farm";
        fun create() = Book(getId(), myBook)

    }

}

interface IdProvider {
    fun getId() : Int
}
fun main() {
    val book = Book.create()

    val bookId = Book.BookFactory.getId()
    println("${book.id} ${ book.name}")
    println("${bookId}")


}