package com.example.ismael_salvador_uf1_act7

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val editTextUsername = findViewById<EditText>(R.id.editTextUsername)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)

        // Configuració del clic al botó de login
        buttonLogin.setOnClickListener {
            // Obtenir el text dels EditText
            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()

            // Mostrar un Toast amb la informació introduïda
            Toast.makeText(this, "Usuari: $username, Contrasenya: $password", Toast.LENGTH_SHORT).show()

            // Mostrar la informació al Logcat
            Log.d("LoginActivity", "Usuari: $username, Contrasenya: $password")
        }
    }
}