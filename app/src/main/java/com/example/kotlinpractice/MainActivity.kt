package com.example.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // id 를 이용해 버튼 가져오기
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                TODO("Not yet implemented")
            }
        })

        // 1. Kotlin interface가 아닌 자바 인터페이스여야 함
        // 2. 그 인터페이스는 딱 하나의 메소드만 가져야 함
        button.setOnClickListener {
            // to do..
        }
    }
}