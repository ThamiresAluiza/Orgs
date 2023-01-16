package com.br.alura.orgs.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.br.alura.orgs.R
import com.br.alura.orgs.model.Produto
import java.math.BigDecimal

class FormularioProdutoActivity : AppCompatActivity
    (R.layout.activity_formulario_produto) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val botaoSalvar = findViewById<Button>(R.id.button_salvar)
        botaoSalvar.setOnClickListener {
            val campoNome = findViewById<EditText>(R.id.nome)
            val nome = campoNome.text.toString()
            val campoDescricao = findViewById<EditText>(R.id.descricao)
            val descricao = campoDescricao.text.toString()
            val campoValor = findViewById<EditText>(R.id.valor)
            val valor = campoValor.text.toString()
            val valorBigDecimal = if (valor.isBlank()) {
                BigDecimal.ZERO
            }else {
                BigDecimal(valor)
            }

            val produtoNovo = Produto(
                nome = nome,
                descricao = descricao,
                valor = BigDecimal(valor)
            )

            Log.i("FormularioProduto", "onCreate: $produtoNovo")
        }
    }
    }