package com.tjkusuma.hrpapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tjkusuma.hrpapp.databinding.ActivitySupportBinding
import kotlinx.android.synthetic.main.activity_support.ivBack_from_support
import kotlinx.android.synthetic.main.activity_support.rv_Support

class SupportActivity : AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<ListSupportAdapter.ViewHolder>? = null
    private lateinit var binding: ActivitySupportBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySupportBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        searchViewBar()
        supportAdapter()
        onClickListener()
    }

    private fun searchViewBar() {
        with(binding) {
            searchView.setupWithSearchBar(searchBar)
            searchView.editText.setOnEditorActionListener { textView, actionId, event ->
                    searchBar.text = searchView.text
                    searchView.hide()
                    Toast.makeText(this@SupportActivity, searchView.text, Toast.LENGTH_SHORT).show()
                    false
                }
        }
    }

    private fun supportAdapter() {
        layoutManager = LinearLayoutManager(this)
        rv_Support.layoutManager = layoutManager

        adapter = ListSupportAdapter()
        rv_Support.adapter = adapter
    }

    private fun onClickListener() {
        ivBack_from_support.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}