package com.example.recyclerviewmulti

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * Creator: Javohir Oromov
 * Date: 17/02/25
 * Project: RecyclerViewMulti
 * Javohir's MacBook Air
 */
class ProductAdapter(private val productList: List<ProductData>) :
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val imageView: ImageView = view.findViewById(R.id.image)
        private val nameView: TextView = view.findViewById(R.id.name)
        private val priceView: TextView = view.findViewById(R.id.price)

        fun bind(product: ProductData) {
            imageView.setImageResource(product.image)
            nameView.text = product.name
            priceView.text = product.price.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(productList[position])
    }

    override fun getItemCount(): Int = productList.size
}