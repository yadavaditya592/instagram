package com.example.instagram

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val names = findViewById<EditText>(R.id.name)
        val password= findViewById<EditText>(R.id.password)
        val logout =findViewById<Button>(R.id.logout)

        val button = findViewById<Button>(R.id.btn)

        button.setOnClickListener {
            if (names.text.isEmpty() || password.text.isEmpty()) {
                Toast.makeText(this, "Name empty", Toast.LENGTH_SHORT).show()
            } else {
                var intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("name", "${names.text}")
                intent.putExtra("password", "${password.text}")
                startActivity(intent)

            }
        }
            logout.setOnClickListener {
                showDialogBox()
            }

        }

            fun showDialogBox() {
                var alertDialog = AlertDialog.Builder(this)
                alertDialog.setPositiveButton("yes",DialogInterface.OnClickListener{dialogInterface, i ->
                    onBackPressed()
                })
                alertDialog.setNegativeButton("No",DialogInterface.OnClickListener{dialogInterface, i ->

                })



                val dialog = alertDialog.create()

                dialog.setTitle("Logout")
                dialog.setMessage("Are you want to logout")
                dialog.setCanceledOnTouchOutside(false)
                dialog.show()



            }

            }

    private fun showDialogBox() {
        TODO("Not yet implemented")
    }





