package me.camila.projetofabricasinapse


import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val etNome = findViewById<EditText>(R.id.etNome)


        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val btEnviar2 = findViewById<Button>(R.id.btEnviar2)




        btEnviar.setOnClickListener {

            if(etNome.text.isNotBlank()) {

//----------------------Com Template String
//                tvResultado.text = "Olá ${etNome.text}!"
//                etNome.setText("")


//------------------Com getString

                tvResultado.text = getString(R.string.Olá_nome, etNome.text.toString())
                etNome.setText("")


            } else {

//------------------Formas de tratar caso seja submetido em branco
//                tvResultado.text = "Olá! Digite o seu nome "
//                etNome.error = "Digite um nome"

//--------------------Com getString

                etNome.error = getString(R.string.insira_o_seu_nome)

            }
        }

        //---------------- Envia para a ResultActvity
        btEnviar2.setOnClickListener {

            if(etNome.text.isNotBlank()) {
                val nomeDigitado = etNome.text.toString()

                //"cria" a intent da outra tela
                val intent = Intent(this, ResultActvity::class.java)

                //Informação extra

                intent.putExtra("NOME_DIGITADO",nomeDigitado) //Necessário ter duas informações: o nome e o valor

                //Inicia a Activity
                startActivity(intent)

            } else {

                etNome.error = getString(R.string.insira_o_seu_nome)

            }
        }

    }
}