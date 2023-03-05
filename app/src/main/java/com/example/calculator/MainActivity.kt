package com.example.calculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    private var user_field: EditText? = null
    private var main_btn: Button? = null
    private var result_field: TextView? = null
    private val pi = 3.14


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        user_field = findViewById(R.id.circle_radius_input)
        main_btn = findViewById(R.id.circle_button_calc)
        result_field = findViewById(R.id.circle_result)

        main_btn?.setOnClickListener {
            if(user_field?.text?.toString()?.trim()?.equals("")!!)
                Toast.makeText(this, "Введіть дані", Toast.LENGTH_SHORT).show()
            else{

                val r0 = user_field?.text.toString()
                val r = r0.toDouble()
                val S = pi * r * r
                result_field?.text = "S = $S"

            }
        }
    }


}
