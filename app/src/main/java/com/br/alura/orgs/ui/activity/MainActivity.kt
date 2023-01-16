package com.br.alura.orgs.ui.activity


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.br.alura.orgs.R
import com.br.alura.orgs.model.Produto
import com.br.alura.orgs.ui.recycleview.adpter.ListaProdutosAdpter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.math.BigDecimal
    //DATA ACESS OBJECT - DAO

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdpter(context = this, produtos = listOf(
            Produto(
                nome = "teste",
                descricao = "teste descricao",
                valor = BigDecimal("19.99")
            ),
            Produto(
                nome = "teste 1 ",
                descricao = "teste desc 1",
                valor = BigDecimal("29.99")
            ),
            Produto(
                nome = "teste 2 ",
            descricao = "teste desc 2",
            valor = BigDecimal("449.99")
        )
        ))
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton2)
        fab.setOnClickListener{
            val intent = Intent(this, FormularioProdutoActivity::class.java)
            startActivity(intent)
        }

    }

}