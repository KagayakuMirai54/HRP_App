package com.tjkusuma.hrpapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tjkusuma.hrpapp.databinding.ActivityHistoryBinding
import kotlinx.android.synthetic.main.activity_history.ivBack_from_History
import kotlinx.android.synthetic.main.activity_history.rv_History

class HistoryActivity : AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<ListHistoryAdapter.ViewHolder>? = null
    private lateinit var binding: ActivityHistoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHistoryBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        onClickListener()
        adapterLmHistory()
    }

    private fun adapterLmHistory() {
        layoutManager = LinearLayoutManager(this)
        rv_History.layoutManager = layoutManager

        adapter = ListHistoryAdapter()
        rv_History.adapter = adapter
    }

    private fun onClickListener() {
        ivBack_from_History.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}