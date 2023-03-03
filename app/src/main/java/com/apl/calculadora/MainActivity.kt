package com.apl.calculadora

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // botones
        val unoBoton: Button = findViewById(R.id.unoBoton)
        val dosBoton: Button = findViewById(R.id.dosBoton)
        val tresBoton: Button = findViewById(R.id.tresBoton)
        val cuatroBoton: Button = findViewById(R.id.cuatroBoton)
        val cincoBoton: Button = findViewById(R.id.cincoBoton)
        val seisBoton: Button = findViewById(R.id.seisBoton)
        val sieteBoton: Button = findViewById(R.id.sieteBoton)
        val ochoBoton: Button = findViewById(R.id.ochoBoton)
        val nueveBoton: Button = findViewById(R.id.nueveBoton)
        val ceroBoton: Button = findViewById(R.id.ceroBoton)
        val sumarBoton: Button = findViewById(R.id.sumaBoton)
        val restarBoton: Button = findViewById(R.id.restaBoton)
        val multiplicarBoton: Button = findViewById(R.id.multiplicaBoton)
        val dividirBoton: Button = findViewById(R.id.dividirBoton)
        val borrarBoton: Button = findViewById(R.id.borrarBoton)
        val mostrarResultadoBoton: Button = findViewById(R.id.igualBoton)
        val puntoBoton: Button = findViewById(R.id.puntoBoton)

        // función para mostrar los números presionados
        fun numeroPresionado(view: View) {
            val resultadoTextView: TextView = findViewById(R.id.textView)
            val numeroPresionado = (view as Button).text.toString()
            val resultadoViejo = resultadoTextView.text.toString()
            val resultadoNuevo = if (resultadoViejo == "0") numeroPresionado else resultadoViejo + numeroPresionado
            resultadoTextView.text = resultadoNuevo
        }

        // función para mostrar el resultado
        fun mostrarResultado() {
            val resultadoTextView: TextView = findViewById(R.id.textView)
            val resultadoViejo = resultadoTextView.text.toString()

            // Si hay una suma
            if (resultadoViejo.contains("+")) {
                val numeros = resultadoViejo.split("+")
                val num1 = numeros[0].toDouble()
                val num2 = numeros[1].toDouble()
                val resultado = num1 + num2
                resultadoTextView.text = resultado.toString()
            }
            // Si hay una resta
            else if (resultadoViejo.contains("-")) {
                val numeros = resultadoViejo.split("-")
                val num1 = numeros[0].toDouble()
                val num2 = numeros[1].toDouble()
                val resultado = num1 - num2
                resultadoTextView.text = resultado.toString()
            }
            // Si hay una multiplicación
            else if (resultadoViejo.contains("x")) {   // x es el símbolo de multiplicación
                val numeros = resultadoViejo.split("x")
                val num1 = numeros[0].toDouble()
                val num2 = numeros[1].toDouble()
                val resultado = num1 * num2
                resultadoTextView.text = resultado.toString()
            }
            // Si hay una división
            else if (resultadoViejo.contains("/")) {
                val numeros = resultadoViejo.split("/")
                val num1 = numeros[0].toDouble()
                val num2 = numeros[1].toDouble()
                val resultado = num1 / num2
                resultadoTextView.text = resultado.toString()
            }
}

        // función para mostrar el operador
        fun operadorPresionado(view: View) {
            val resultadoTextView: TextView = findViewById(R.id.textView)
            val operadorPresionado = (view as Button).text.toString()
            val resultadoViejo = resultadoTextView.text.toString()
            val resultadoNuevo = if (resultadoViejo == "0") operadorPresionado else resultadoViejo + operadorPresionado
            resultadoTextView.text = resultadoNuevo
        }

        // función para borrar el resultado
        fun borrarResultado() {
            val resultadoTextView: TextView = findViewById(R.id.textView)
            resultadoTextView.text = "0"
        }

        // función para mostrar el punto
        fun puntoPresionado(view: View) {
            val resultadoTextView: TextView = findViewById(R.id.textView)
            val puntoPresionado = (view as Button).text.toString()
            val resultadoViejo = resultadoTextView.text.toString()
            val resultadoNuevo = if (resultadoViejo == "0") puntoPresionado else resultadoViejo + puntoPresionado
            resultadoTextView.text = resultadoNuevo
        }

        // asignar funciones a los botones
        unoBoton.setOnClickListener { numeroPresionado(it) }
        dosBoton.setOnClickListener { numeroPresionado(it) }
        tresBoton.setOnClickListener { numeroPresionado(it) }
        cuatroBoton.setOnClickListener { numeroPresionado(it) }
        cincoBoton.setOnClickListener { numeroPresionado(it) }
        seisBoton.setOnClickListener { numeroPresionado(it) }
        sieteBoton.setOnClickListener { numeroPresionado(it) }
        ochoBoton.setOnClickListener { numeroPresionado(it) }
        nueveBoton.setOnClickListener { numeroPresionado(it) }
        ceroBoton.setOnClickListener { numeroPresionado(it) }
        sumarBoton.setOnClickListener { operadorPresionado(it) }
        restarBoton.setOnClickListener { operadorPresionado(it) }
        multiplicarBoton.setOnClickListener { operadorPresionado(it) }
        dividirBoton.setOnClickListener { operadorPresionado(it) }
        borrarBoton.setOnClickListener { borrarResultado() }
        mostrarResultadoBoton.setOnClickListener { mostrarResultado() }
        puntoBoton.setOnClickListener { puntoPresionado(it) }
    }
}
