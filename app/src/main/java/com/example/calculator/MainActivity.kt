package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etText:TextView
    lateinit var etText1:TextView
    lateinit var btnAdd:Button
    lateinit var btnMultiply:Button
    lateinit var btnMinus:Button
    lateinit var btnMod:Button
    lateinit var tvResult:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etText=findViewById(R.id.etText)
        etText1=findViewById(R.id.etText1)
        btnAdd=findViewById(R.id.btnAdd)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnMinus=findViewById(R.id.btnMinus)
        btnMod=findViewById(R.id.btnMod)
        tvResult=findViewById(R.id.tvResult)

        btnMultiply.setOnClickListener {
            var Num=etText.text.toString().toInt()
            var number=etText1.text.toString().toInt()
            getResult1(Num,number)
        }
        btnAdd.setOnClickListener {
            var Num=etText.text.toString().toInt()
            var number=etText1.text.toString().toInt()
            getResult(Num,number)
        }
        btnMinus.setOnClickListener {
            var Num=etText.text.toString().toInt()
            var number=etText1.text.toString().toInt()
            getResult3(Num,number)
        }
        btnMod.setOnClickListener {
            var Num=etText.text.toString().toInt()
            var number=etText1.text.toString().toInt()
            getResult2(Num,number)
        }
    }
    fun getResult(Num: Int,number:Int) {
var result=Num + number
        tvResult.text=result.toString()
    }
    fun getResult1(Num: Int,number:Int) {
        var result=Num * number
        tvResult.text=result.toString()
    }
    fun getResult2(Num: Int,number:Int) {
        var result=Num % number
        tvResult.text=result.toString()
    }
    fun getResult3(Num: Int,number:Int) {
        var result=Num - number
        tvResult.text=result.toString()
    }
}