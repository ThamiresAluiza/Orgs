package com.br.alura.orgs.ui.recycleview.adpter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.br.alura.orgs.R
import com.br.alura.orgs.model.Produto

class ListaProdutosAdpter (
        private val context: Context,
        produtos: List<Produto>
        ): RecyclerView.Adapter<ListaProdutosAdpter.ViewHolder>() {

    private val produtos = produtos.toMutableList()

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun vincula(produto: Produto) {
            val nome = itemView.findViewById<TextView>(R.id.nome)
            nome.text = produto.nome
            val descricao = itemView.findViewById<TextView>(R.id.descricao)
            descricao.text = produto.descricao
            val valor = itemView.findViewById<TextView>(R.id.valor)
            valor.text = produto.valor.toPlainString()
        }
    }

    //Criar a referencia de view holder, fazer o processode biding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.produto_item, parent, false)
        return ViewHolder(view)
    }

    //Indica qual que é o item que o adpter ta colocando os itens dentro do recycle e vai indicar qual
    //é a posiçaāo e o viewHolder que está com essa view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produto = produtos[position]
        holder.vincula(produto)
    }

    //size do item
    override fun getItemCount(): Int = produtos.size

    fun atualiza(produtos: List<Produto>) {
        this.produtos.clear()
        this.produtos.addAll(produtos)
        notifyDataSetChanged()

    }

}
