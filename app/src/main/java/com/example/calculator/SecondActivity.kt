package com.example.calculator

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build.VERSION_CODES.S

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.calculator.databinding.ActivityMainBinding
import com.example.calculator.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding

    private var user_field: EditText? = null
    private var main_btn: Button? = null
    private var result_field: TextView? = null


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){
                R.id.circle_menu -> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
                R.id.square_menu -> {
                    val intent = Intent(this, SecondActivity::class.java)
                    startActivity(intent)
                }
                R.id.rectangle_menu -> {
                    val intent = Intent(this, ThirdActivity::class.java)
                    startActivity(intent)
                }
                R.id.triangle_menu -> {
                    val intent = Intent(this, FourthActivity::class.java)
                    startActivity(intent)
                }

            }
            true
        }

        user_field = findViewById(R.id.square_side_input)
        main_btn = findViewById(R.id.square_button_calc)
        result_field = findViewById(R.id.square_result)

        main_btn?.setOnClickListener {
            if(user_field?.text?.toString()?.trim()?.equals("")!!)
                Toast.makeText(this, "?????????????? ????????", Toast.LENGTH_SHORT).show()
            else{

                val a0 = user_field?.text.toString()
                val a = a0.toDouble()
                val s = a * a
                result_field?.text = "S = $s"

            }
        }

    }
}