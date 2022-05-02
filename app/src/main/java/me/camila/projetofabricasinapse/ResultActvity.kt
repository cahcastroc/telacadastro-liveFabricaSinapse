package me.camila.projetofabricasinapse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActvity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_actvity)

        val nomeDigitado = intent.getStringExtra("NOME_DIGITADO")
        val tvResultadoActvity = findViewById<TextView>(R.id.tvResultadoActvity)
        tvResultadoActvity.text = getString(R.string.Olá_nome, nomeDigitado)
    }
}