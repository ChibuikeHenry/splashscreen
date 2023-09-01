package com.example.splashscreen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.Toast
import com.example.splashscreen.R.id.second_act_btn
import com.example.splashscreen.databinding.ActivityMainBinding
import com.google.android.material.animation.AnimationUtils

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // val secondActButton = findViewById<Button>(second_act_btn)
//        secondActButton.setOnClickListener {
//            Toast.makeText(this, "go away", Toast.LENGTH_SHORT).show()

        }
    }
//}
//
//
//    }
//
//    fun navigate(){
//        val Intent = Intent(this, MainActivity2::class.java)
//        startActivity(Intent)
 //  }
//}
