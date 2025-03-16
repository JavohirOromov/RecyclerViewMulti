package com.example.recyclerviewmulti

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

/**
 * Creator: Javohir Oromov
 * Date: 17/02/25
 * Project: RecyclerViewMulti
 * Javohir's MacBook Air
 */
class AdvertAdapter(private val advertList: List<AdvertData>) :
    RecyclerView.Adapter<AdvertAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val imageView: ImageView = view.findViewById(R.id.image)

        fun bind(advert: AdvertData) {
          //  Log.d("ttt", "bind: ${advert.image}")
            imageView.setImageResource(advert.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_reklama, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(advertList[position])
    }

    override fun getItemCount(): Int = advertList.size
}