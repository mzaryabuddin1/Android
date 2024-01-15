package com.example.hiringv1

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton: Button = findViewById(R.id.login);

        loginButton.setOnClickListener {
            showLoginPopup();
        }
    }

    private fun showLoginPopup() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Login").setMessage("Login Successfull!").setPositiveButton("OK", null)

        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

}