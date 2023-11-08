package com.example.fkn_assignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {



    private var titles = arrayOf(
        "Smooglite Runner",
        "Michael",
        "Nano Doctor",
        "Fascist Morty",
        "Storylord",
        "Mousetrap Nipples"
    )
    private var details = arrayOf(
        "Unknown - Alien",
        "Alive - Human",
        "Alive - Alien",
        "Dead - Human",
        "Alive - Human",
        "Unknown - Mythological Creature"
    )
    private val images = intArrayOf(
        R.drawable.shmooglite,
        R.drawable.michael,
        R.drawable.nano,
        R.drawable.fascist,
        R.drawable.storylord,
        R.drawable.mousetrap
    )

    private var more_details = arrayOf(
        "Resort Planet",
        "Earth (Replacement Dimension)",
        "St. Gloopy Noops Hospital",
        "Earth (Fascist Dimension)",
        "Ricks’s Story",
        "Hell"
    )


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])
        holder.itemMoreDetail.text = more_details[position]
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView
        var itemMoreDetail: TextView

        init{
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
            itemMoreDetail = itemView.findViewById(R.id.item_more_detail)

//            itemView.setOnClickListener {
//                val position: Int = absoluteAdapterPosition
//
//                Toast.makeText(itemView.context, moreDetail[position], Toast.LENGTH_LONG).show()
//            }
        }
    }

}