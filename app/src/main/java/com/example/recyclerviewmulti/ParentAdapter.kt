package com.example.recyclerviewmulti
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * Creator: Javohir Oromov
 * Date: 17/02/25
 * Project: RecyclerViewMulti
 * Javohir's MacBook Air
 */
class ParentAdapter(private val list: List<SelectionData>): RecyclerView.Adapter<ParentAdapter.ParentViewHolder>() {

    abstract inner class ParentViewHolder(view: View): RecyclerView.ViewHolder(view){
        abstract fun bind(items: List<DataRv>)
    }
    inner class AdvertViewHolder(itemView: View) : ParentViewHolder(itemView){
        override fun bind(items: List<DataRv>) {
            val adapter = AdvertAdapter(items as List<AdvertData>)
            val recyclerView = itemView.findViewById<RecyclerView>(R.id.reklamaRv)
            recyclerView.adapter = adapter
            recyclerView.layoutManager = LinearLayoutManager(itemView.context,LinearLayoutManager.HORIZONTAL,false)
        }
    }
    inner class CategoryViewHolder(itemView: View) : ParentViewHolder(itemView) {
        override fun bind(items: List<DataRv>) {
            val adapter = CategoryAdapter(items as List<CategoryData>)
            val recyclerView = itemView.findViewById<RecyclerView>(R.id.categoryRv)
            recyclerView.adapter = adapter
        }
    }

    inner class ProductViewHolder(itemView: View) : ParentViewHolder(itemView) {
        override fun bind(items: List<DataRv>) {
            val adapter = ProductAdapter(items as List<ProductData>)
            val recyclerView = itemView.findViewById<RecyclerView>(R.id.productRv)
            recyclerView.adapter = adapter
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParentViewHolder {
        return when(viewType){
            1 -> AdvertViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.reklama_rv,parent,false))
            2 -> CategoryViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.category_rv,parent,false))
            else -> ProductViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.product_rv,parent,false))
        }
    }

    override fun getItemViewType(position: Int): Int {
        return list[position].type
    }

    override fun getItemCount(): Int {
      return  list.size
    }

    override fun onBindViewHolder(holder: ParentViewHolder, position: Int) {
        holder.bind(list[position].items)
    }
}