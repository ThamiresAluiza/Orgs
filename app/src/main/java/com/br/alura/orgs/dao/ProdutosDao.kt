package com.br.alura.orgs.dao

import com.br.alura.orgs.model.Produto

class ProdutosDao {

    private val produtos = mutableListOf<Produto>()

    fun add(produto: Produto){
        produtos.add(produto)

    }

    fun buscaTodos() : List<Produto> {
        return produtos.toList()

    }
}