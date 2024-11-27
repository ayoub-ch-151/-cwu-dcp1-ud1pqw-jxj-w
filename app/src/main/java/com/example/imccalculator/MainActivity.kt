package com.example.imccalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.calbutton)
        val poids  = findViewById<EditText>(R.id.poids)
        val taille = findViewById<EditText>(R.id.taille)

        button.setOnClickListener {

            val intent = Intent(this, IMCresult::class.java)
            intent.putExtra("poids", poids.getText().toString())
            intent.putExtra("taille", taille.getText().toString())
            startActivity(intent)

        }

    }
}