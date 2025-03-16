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
class CategoryAdapter(private val categoryList: List<CategoryData>) : RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val imageView: ImageView = view.findViewById(R.id.image)
        private val textView: TextView = view.findViewById(R.id.category_name)

        fun bind(category: CategoryData) {
            imageView.setImageResource(category.image)
            textView.text = category.name
            imageView.setBackgroundColor(category.background)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(categoryList[position])
    }

    override fun getItemCount(): Int = categoryList.size
}