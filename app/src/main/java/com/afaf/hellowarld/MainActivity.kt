package com.afaf.hellowarld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "${addNum(5,5)}")


    }
    fun addNum(num1:Int , num2: Int){
        val add = num1 + num2
        if(num1 == num2){
            println("the sum is $add ")
        }else {
            println("error")
        }
    }
}