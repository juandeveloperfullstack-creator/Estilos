package com.example.estilos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(private val colors: List<Int>, private val titles: List<String>) :
    RecyclerView.Adapter<ViewPagerAdapter.PagerViewHolder>() {

    class PagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val container: View = itemView.findViewById(R.id.pageContainer)
        val titleText: TextView = itemView.findViewById(R.id.pageTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_page, parent, false)
        return PagerViewHolder(view)
    }

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        holder.container.setBackgroundColor(colors[position])
        holder.titleText.text = titles[position]
    }

    override fun getItemCount(): Int = colors.size
}