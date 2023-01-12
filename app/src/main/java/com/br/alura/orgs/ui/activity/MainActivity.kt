package com.br.alura.orgs.ui.activity


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.br.alura.orgs.R
import com.br.alura.orgs.model.Produto
import com.br.alura.orgs.ui.recycleview.adpter.ListaProdutosAdpter
import java.math.BigDecimal


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //

//        val nome = findViewById<TextView>(R.id.nome)
//        nome.text = "Cesta de frutas"
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "Laranja, manga e maçã"
//        val valor = findViewById<TextView>(R.id.valor)
//        valor.text = "19.99"
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
        //recyclerView.layoutManager = LinearLayoutManager(this)
    }

}