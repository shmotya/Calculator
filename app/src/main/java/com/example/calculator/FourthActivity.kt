package com.example.calculator

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.calculator.databinding.ActivityFourthBinding



class FourthActivity : AppCompatActivity() {
    lateinit var binding: ActivityFourthBinding

    private var user_field_a: EditText? = null
    private var user_field_h: EditText? = null
    private var main_btn: Button? = null
    private var result_field: TextView? = null


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBinding.inflate(layoutInflater)
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



                }
            }


        }
    }
}