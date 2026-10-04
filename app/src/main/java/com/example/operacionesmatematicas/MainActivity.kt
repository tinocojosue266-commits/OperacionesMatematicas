package com.example.operacionesmatematicas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            var numero1 by remember { mutableStateOf("") }
            var numero2 by remember { mutableStateOf("") }
            var resultado by remember { mutableStateOf("") }

            // Colores del diseño del maestro
            val amarillo = Color(0xFFFFDA57)
            val azulClaro = Color(0xFFCAE4FB)
            val azulBorde = Color(0xFF42A5F5)

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
                    .padding(24.dp),
                verticalArrangement = Arrangement.Top
            ) {

                Text(
                    text = "Número 1",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

                Spacer(modifier = Modifier.height(4.dp))

                OutlinedTextField(
                    value = numero1,
                    onValueChange = { numero1 = it },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = azulClaro,
                        unfocusedContainerColor = azulClaro,
                        focusedIndicatorColor = azulBorde,
                        unfocusedIndicatorColor = azulBorde,
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black
                    ),
                    shape = RoundedCornerShape(5.dp)
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = "Número 2",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

                Spacer(modifier = Modifier.height(4.dp))

                OutlinedTextField(
                    value = numero2,
                    onValueChange = { numero2 = it },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = azulClaro,
                        unfocusedContainerColor = azulClaro,
                        focusedIndicatorColor = azulBorde,
                        unfocusedIndicatorColor = azulBorde,
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black
                    ),
                    shape = RoundedCornerShape(5.dp)
                )

                Spacer(modifier = Modifier.height(12.dp))

                Button(
                    onClick = {
                        val n1 = numero1.toDoubleOrNull()
                        val n2 = numero2.toDoubleOrNull()

                        if (n1 != null && n2 != null) {
                            resultado = (n1 + n2).toString()
                        }
                    },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(5.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = amarillo,
                        contentColor = Color.Black
                    )
                ) {
                    Text(
                        text = "Suma",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    onClick = {
                        val n1 = numero1.toDoubleOrNull()
                        val n2 = numero2.toDoubleOrNull()

                        if (n1 != null && n2 != null) {
                            resultado = (n1 - n2).toString()
                        }
                    },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(5.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = amarillo,
                        contentColor = Color.Black
                    )
                ) {
                    Text(
                        text = "Resta",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    onClick = {
                        val n1 = numero1.toDoubleOrNull()
                        val n2 = numero2.toDoubleOrNull()

                        if (n1 != null && n2 != null && n2 != 0.0) {
                            resultado = (n1 / n2).toString()
                        }
                    },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(5.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = amarillo,
                        contentColor = Color.Black
                    )
                ) {
                    Text(
                        text = "División",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    onClick = {
                        val n1 = numero1.toDoubleOrNull()
                        val n2 = numero2.toDoubleOrNull()

                        if (n1 != null && n2 != null) {
                            resultado = (n1 * n2).toString()
                        }
                    },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(5.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = amarillo,
                        contentColor = Color.Black
                    )
                ) {
                    Text(
                        text = "Multiplicación",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Resultado: $resultado",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            }
        }
    }
}