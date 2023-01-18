package com.br.alura.orgs.dao

import com.br.alura.orgs.model.Produto

class ProdutosDao {

    fun add(produto: Produto){
        produtos.add(produto)

    }

    fun buscaTodos() : List<Produto> {
        return Companion.produtos.toList()

    }

    companion object {
        private val produtos = mutableListOf<Produto>()
    }
}