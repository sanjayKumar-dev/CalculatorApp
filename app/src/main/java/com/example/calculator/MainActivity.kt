package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addBtn = findViewById<Button>(R.id.add)
        val subBtn = findViewById<Button>(R.id.sub)
        val mulBtn = findViewById<Button>(R.id.mul)
        val divBtn = findViewById<Button>(R.id.div)

        val num1 = findViewById<EditText>(R.id.numOne)
        val num2 = findViewById<EditText>(R.id.numTwo)
        val tv = findViewById<TextView>(R.id.ans)

        addBtn.setOnClickListener{
            val n1 = Integer.parseInt(num1.text.toString())
            val n2 = Integer.parseInt(num2.text.toString())
            tv.text = "Addition: ${n1 + n2}"
        }

        subBtn.setOnClickListener{
            val n1 = Integer.parseInt(num1.text.toString())
            val n2 = Integer.parseInt(num2.text.toString())
            tv.text = "Substraction: ${n1 - n2}"
        }

        mulBtn.setOnClickListener{
            val n1 = Integer.parseInt(num1.text.toString())
            val n2 = Integer.parseInt(num2.text.toString())
            tv.text = "Multiplication: ${n1 * n2}"
        }

        divBtn.setOnClickListener {
            val n1 = Integer.parseInt(num1.text.toString())
            val n2 = Integer.parseInt(num2.text.toString())
            tv.text = if(n2!=0) "Division: ${n1 / n2}" else "Invalid Input"
        }

    }


}