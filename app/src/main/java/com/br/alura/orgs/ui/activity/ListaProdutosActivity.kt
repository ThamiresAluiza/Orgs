package com.br.alura.orgs.ui.activity


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.br.alura.orgs.R
import com.br.alura.orgs.dao.ProdutosDao
import com.br.alura.orgs.ui.recycleview.adpter.ListaProdutosAdpter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaProdutosActivity : AppCompatActivity(R.layout.activity_lista_produtos) {

    private val dao = ProdutosDao()
    private val adpter = ListaProdutosAdpter(context = this, produtos = dao.buscaTodos())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        configuraRecycleView()
        configuraFab()

    }

    override fun onResume() {
        super.onResume()
        adpter.atualiza(dao.buscaTodos())
    }

    private fun configuraFab() {
        val fab = findViewById<FloatingActionButton>(R.id.activity_lista_produtos_fab)
        fab.setOnClickListener {
            vaiParaFormularioProduto()
        }
    }

    private fun vaiParaFormularioProduto() {
        val intent = Intent(this, FormularioProdutoActivity::class.java)
        startActivity(intent)
    }

    private fun configuraRecycleView() {
        val recyclerView = findViewById<RecyclerView>(R.id.activity_lista_produtos_recyclerView)
        recyclerView.adapter = adpter
    }

}