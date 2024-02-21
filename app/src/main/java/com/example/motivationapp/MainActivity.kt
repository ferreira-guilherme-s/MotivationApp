package com.example.motivationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.motivationapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Aqui ele aumenta/cria o meu layout
        binding = ActivityMainBinding.inflate(layoutInflater)
        //Aqui eu atribuo ele para a minha view
        setContentView(binding.root)

        //Esconder a barra com o nome do app na parte de cima
        supportActionBar?.hide()

        handleUserName()

        binding.buttonNewPhrase.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_new_phrase){
            var s = ""
        }
    }

    //Responsável por recuperar o nome do usuário
    private fun handleUserName(){
        val name = SecurityPreferences(this).getString("USER_NAME")
        binding.textUserName.text = "Olá, $name!"
    }
}