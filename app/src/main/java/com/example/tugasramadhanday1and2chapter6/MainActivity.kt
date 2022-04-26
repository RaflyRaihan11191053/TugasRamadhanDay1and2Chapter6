package com.example.tugasramadhanday1and2chapter6

import android.app.AlertDialog
import android.content.Intent
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import com.example.tugasramadhanday1and2chapter6.databinding.ActivityMainBinding
import java.net.URL

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnHandler.setOnClickListener {
                val intent = Intent(this@MainActivity, HandlerActivity::class.java)
                startActivity(intent)
            }

            btnAsynctask.setOnClickListener {
                val intent = Intent(this@MainActivity, AsynctaskActivity::class.java)
                startActivity(intent)
            }

            btnCoroutines.setOnClickListener {
                val intent = Intent(this@MainActivity, CoroutinesActivity::class.java)
                startActivity(intent)
            }
        }

    }

}