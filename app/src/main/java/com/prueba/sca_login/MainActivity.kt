package com.prueba.sca_login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.btn_ingresar)

        button1.setOnClickListener{
            val intent = Intent(this, inicio::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.btn_claveolv)

        button2.setOnClickListener{
            val intent = Intent(this, Recup_Clave::class.java)
            startActivity(intent)
        }
    }

}