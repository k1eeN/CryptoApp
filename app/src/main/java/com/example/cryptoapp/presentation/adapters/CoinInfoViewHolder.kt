package com.example.cryptoapp.presentation.adapters

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cryptoapp.R

class CoinInfoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val ivLogoCoin = itemView.findViewById<ImageView>(R.id.ivLogoCoin)
    val tvSymbols = itemView.findViewById<TextView>(R.id.tvSymbols)
    val tvPrice = itemView.findViewById<TextView>(R.id.tvPrice)
    val tvLastUpdate = itemView.findViewById<TextView>(R.id.tvLastUpdate)
}