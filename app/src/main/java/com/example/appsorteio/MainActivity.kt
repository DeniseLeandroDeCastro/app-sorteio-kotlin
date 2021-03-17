package com.example.appsorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Método (onClick) utilizado
     * para sortear o número
     * quando o usuário clicar
     * no botão Jogar
     */
    fun sortearNumero(view: View) {
        var texto = findViewById<TextView>(R.id.textoSorteio)
        var numeroSorteado = Random().nextInt(11)
        texto.text = " Número sorteado é: " + numeroSorteado//Pode ser feito desta forma
        //texto.setText(" Número sorteado é: "  + numeroSorteado)//Pode ser feito desta forma
    }
}