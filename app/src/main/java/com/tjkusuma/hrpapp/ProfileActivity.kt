package com.tjkusuma.hrpapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.tjkusuma.hrpapp.databinding.ActivityProfileBinding
import kotlinx.android.synthetic.main.activity_profile.ivBack_from_Profile

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onClickListener()
    }

    private fun onClickListener() {
        binding.pgLoading.visibility = View.INVISIBLE
        ivBack_from_Profile.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}