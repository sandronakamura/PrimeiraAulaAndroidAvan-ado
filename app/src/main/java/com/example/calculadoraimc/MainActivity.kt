package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculadoraimc.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Variável binding recebe o layout aberto e em seguida adiciona como View pricipal
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnMakeCalc.setOnClickListener()
        {
            // Variáveis que recebem os dados dos campos de texto
            val pesoTxt = binding.edtPeso.text.toString()
            val alturaTxt = binding.edtAltura.text.toString()

            // Chamando a função getImcResult passando as variáveis como parâmetro
            val imcResult = getImcResult(pesoTxt, alturaTxt)

            // Exibe o resultado retornado no campo de texto
            binding.txtResultImc.text = imcResult.result.label
        }
    }
}