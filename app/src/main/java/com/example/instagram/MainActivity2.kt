package com.example.instagram

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var nameGet = intent.extras?.getString("name")
        val passwordget = intent.extras?.getString("password")
        val file = findViewById<TextView>(R.id.name)
        val line = findViewById<TextView>(R.id.password)

        val btn = findViewById<TextView>(R.id.button)
        file.text = nameGet
        line.text=passwordget
        btn.setOnClickListener {
           showDialogBox()
        }

    }

        @SuppressLint("MissingInflatedId")
        private fun showDialogBox() {
            var alertDialog = AlertDialog.Builder(this)
            val dialogLayout =
                LayoutInflater.from(this).inflate(R.layout.dialog_custom, null, false)
            var yesButton = dialogLayout.findViewById<Button>(R.id.yesButton)
            val noButton = dialogLayout.findViewById<Button>(R.id.noButton)



            val dialog = alertDialog.create()
            dialog.setCanceledOnTouchOutside(false)
            dialog.setView(dialogLayout)
            dialog.show()
            yesButton.setOnClickListener {
                onBackPressed()
            }
            noButton.setOnClickListener{
                dialog.dismiss()
                Toast.makeText(this, "dismiss", Toast.LENGTH_SHORT).show()
            }
        }


        }


