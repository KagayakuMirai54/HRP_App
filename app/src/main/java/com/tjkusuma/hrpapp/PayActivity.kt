package com.tjkusuma.hrpapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tjkusuma.hrpapp.databinding.ActivityPayBinding
import kotlinx.android.synthetic.main.activity_pay.ivBack_from_Pay
import kotlinx.android.synthetic.main.activity_pay.qr_pay

class PayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPayBinding
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPayBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onClickListener()
    }

    private fun onClickListener() {
        ivBack_from_Pay.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        qr_pay.setOnClickListener {
            val qrIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/uc?export=download&id=1wu3gZa-Iqhdx8lYuSb8rDFkIIuIhQAkw")
            )
            startActivity(qrIntent)
        }
    }
}