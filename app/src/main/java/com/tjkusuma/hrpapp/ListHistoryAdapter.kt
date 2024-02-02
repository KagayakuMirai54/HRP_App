package com.tjkusuma.hrpapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListHistoryAdapter : RecyclerView.Adapter<ListHistoryAdapter.ViewHolder>() {
    private val itemJenis = arrayOf("Wifi", "Listrik & Air", "Kas", "Kebersihan")
    private val itemHarga = arrayOf("Rp20.000", "Rp20.000", "Rp5.000", "Rp2.000")
    private val itemJam = arrayOf("20:15", "19:30", "13:12", "16:220")
    private val itemTanggal = arrayOf("01/07/2023", "01/07/2023", "01/07/2023", "01/07/2023")


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvJenis: TextView
        var tvHarga: TextView
        var tvJam: TextView
        var tvTanggal: TextView

        init {
            tvJenis = itemView.findViewById(R.id.tv_jenis_pembayaran)
            tvHarga = itemView.findViewById(R.id.tv_harga_pembayaran)
            tvJam = itemView.findViewById(R.id.tv_jam_pembayaran)
            tvTanggal = itemView.findViewById(R.id.tv_tanggal_pembayaran)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_history, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return itemJenis.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvJenis.text = itemJenis[position]
        holder.tvHarga.text = itemHarga[position]
        holder.tvJam.text = itemJam[position]
        holder.tvTanggal.text = itemTanggal[position]
    }
}
