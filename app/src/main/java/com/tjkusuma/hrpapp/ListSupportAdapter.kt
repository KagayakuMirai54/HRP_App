package com.tjkusuma.hrpapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListSupportAdapter : RecyclerView.Adapter<ListSupportAdapter.ViewHolder>() {
    private val itemTopikPalingDicari = arrayOf(
        "Transaksi berhasil, penerima menginfokan bahwa uangnya belum masuk",
        "Mengapa catatan pembayaran belum tercantum, padahal pembayarannya sudah berhasil dilakukan?",
        "Berapa lama waktu yang dibutuhkan untuk transaksi e-wallet diproses?",
        "Kesalahan jumlah uang yang ditransfer"
    )

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTopikPalingDicari: TextView

        init {
            tvTopikPalingDicari = itemView.findViewById(R.id.tv_itemSupport)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): ListSupportAdapter.ViewHolder {
        val v: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_support, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return itemTopikPalingDicari.size
    }

    override fun onBindViewHolder(holder: ListSupportAdapter.ViewHolder, position: Int) {
        holder.tvTopikPalingDicari.text = itemTopikPalingDicari[position]
    }

}