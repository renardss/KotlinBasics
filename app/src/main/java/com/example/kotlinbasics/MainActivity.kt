package com.example.kotlinbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var occupation = "Developer"

        open class player(val name: String, val gender: String, val power: Int) {
            open fun attack() {
                button_attack.setOnClickListener {
                    textView.text = "Attack"
                }
                fun run() {
                    button_run.setOnClickListener {
                        textView.text = "Run!"
                    }
                }
            }
            inner class warrior(name: String, gender: String, power: Int) : player(name, gender, power)
            {
                override fun attack() {
                    button_defend.setOnClickListener {
                        textView.text = "Stop attack"
                    }
                }
            }
        }
    }
}

