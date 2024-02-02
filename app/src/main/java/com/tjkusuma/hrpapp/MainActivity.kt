package com.tjkusuma.hrpapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tjkusuma.hrpapp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.cvAboutus
import kotlinx.android.synthetic.main.activity_main.cvHistory
import kotlinx.android.synthetic.main.activity_main.cvPayment
import kotlinx.android.synthetic.main.activity_main.cvSupport
import kotlinx.android.synthetic.main.activity_main.iv_icon_profile

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        onClickListener()
    }

    private fun onClickListener() {
        iv_icon_profile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        cvPayment.setOnClickListener {
            startActivity(Intent(this, PaymentActivity::class.java))
        }
        cvHistory.setOnClickListener {
            startActivity(Intent(this, HistoryActivity::class.java))
        }
        cvSupport.setOnClickListener {
            startActivity(Intent(this, SupportActivity::class.java))
        }
        cvAboutus.setOnClickListener {
            startActivity(Intent(this, AboutUsActivity::class.java))
        }

    }
}