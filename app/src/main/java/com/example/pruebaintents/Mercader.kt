package com.example.pruebaintents

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Mercader : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mercader)
        val btnComerciar=findViewById<Button>(R.id.comerciar)
        val btnContinuar=findViewById<Button>(R.id.continuar)
        btnComerciar.setOnClickListener {
            val intent= Intent(this,ComerciarMercader::class.java)
            startActivity(intent)
        }
        btnContinuar.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}