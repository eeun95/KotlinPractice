package com.example.kotlinpractice

fun main() {

    var name : String = "hihi"
    println("hello ${name} \$룰루루")

    println(compare(1, 2))
    println(maxBy(2, 3))
    checkNum(80)
    forAndWhile()
    nullcheck()
    ignoreNulls("hihi")


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

    for((index, name) in students.withIndex()) {
        println("${index+1}번째 학생 : ${name}")
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

    var index = 0;
    while(index < 10) {
        println("current index : ${index}")
        index++;

    }
}

// Nullable NonNull
fun nullcheck() {
    // 컴파일 시점이 아닌 runtime에서만 잡히는 nullpointer exception을 보완하기 위함
    var name : String = "eun"

    // ? 넣으면 널값이 들어갈 수 있음 (타입 명시 필요)
    var nullName : String? = null;

    var nameInUpperCase = name.toUpperCase()

    // null이면 대문자로 만들고 아니면 널 반환
    var nullNameInUpperCase = nullName?.toUpperCase()

    println("$nameInUpperCase $nullNameInUpperCase")

    // ?: 엘비스 프레슬리 연산자 호호홍 (약간 삼항연산자 느낌)
    var lastName : String? = null;
    var fullName = name +" "+ (lastName?: "No lastName")
    println(fullName)

}

fun ignoreNulls(str : String?) {
    // !! 타입이 nullable 이지만 null이 아닐 때 느낌표 두개 씀
    // 절대 str엔 널이 들어올리 없다고 미리 알림 (null 들어오면 널포인트익셉션 뜸)
    val mNotNull : String = str!!
    val upper = mNotNull.toUpperCase()

    val email : String? = "eeun95@gmail.com"
    email?.let {
        // email이 null이 아니면 실행
        // let 함수는 자신의 리시버 객체를 람다식 내부로 옮겨서 실행하는 구문
        println("my email is ${it}")

    }


}