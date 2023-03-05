package com.example.calculator

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.calculator.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBinding

    private var user_field_a: EditText? = null
    private var user_field_b: EditText? = null
    private var main_btn: Button? = null
    private var result_field: TextView? = null


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bottomNavigationView.setOnItemSelectedListener {

            when (it.itemId) {
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

        user_field_a = findViewById(R.id.rectangle_a_side_input)
        user_field_b = findViewById(R.id.rectangle_b_side_input)
        main_btn = findViewById(R.id.rectangle_button_calc)
        result_field = findViewById(R.id.rectangle_result)

        main_btn?.setOnClickListener {
            if (user_field_a?.text?.toString()?.trim()?.equals("")!!)
                Toast.makeText(this, "Введіть сторону a", Toast.LENGTH_SHORT).show()
            else {



                if (user_field_b?.text?.toString()?.trim()?.equals("")!!)
                    Toast.makeText(this, "Введіть сторону b", Toast.LENGTH_SHORT).show()
                else {
                    val a0 = user_field_a?.text.toString()
                    val a = a0.toDouble()
                    val b0 = user_field_b?.text.toString()
                    val b = b0.toDouble()

                    val s = a * b
                    result_field?.text = "S = $s"

                }
            }


        }
    }
}