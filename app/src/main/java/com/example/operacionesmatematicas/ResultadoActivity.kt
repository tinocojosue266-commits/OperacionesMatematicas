package com.example.operacionesmatematicas

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class ResultadoActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_resultado)

        val resultado = intent.getDoubleExtra("resultado", 0.0)

        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        val btnRegresar = findViewById<Button>(R.id.btnRegresar)

        txtResultado.text = "Resultado: $resultado"

        btnRegresar.setOnClickListener {
            finish()
        }
    }
}