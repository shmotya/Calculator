package com.example.calculator

import android.annotation.SuppressLint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    private var user_field: EditText? = null
    private var main_btn: Button? = null

    private var result_field: TextView? = null


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        user_field = findViewById(R.id.square_side_input)
        main_btn = findViewById(R.id.square_button_calc)

        result_field = findViewById(R.id.square_result)

        main_btn?.setOnClickListener {
            if(user_field?.text?.toString()?.trim()?.equals("")!!)
                Toast.makeText(this, "Введіть дані", Toast.LENGTH_SHORT).show()
            else{

                val a0 = user_field?.text.toString()
                val a = a0.toDouble()
                val S = a * a
                result_field?.text = "S = $S"

            }
        }




    }
}