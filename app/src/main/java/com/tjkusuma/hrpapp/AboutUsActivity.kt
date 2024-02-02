package com.tjkusuma.hrpapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tjkusuma.hrpapp.databinding.ActivityAboutUsBinding
import kotlinx.android.synthetic.main.activity_about_us.ivBack_from_aboutUs

class AboutUsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutUsBinding
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutUsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onClickListener()
    }

    private fun onClickListener() {
        ivBack_from_aboutUs.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}