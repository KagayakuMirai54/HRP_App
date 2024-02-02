package com.tjkusuma.hrpapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tjkusuma.hrpapp.databinding.ActivityPaymentBinding
import kotlinx.android.synthetic.main.activity_payment.ivBack_from_Payment
import kotlinx.android.synthetic.main.activity_payment.tv_waitPay_Kebersihan
import kotlinx.android.synthetic.main.activity_payment.tv_waitPay_ListrikAir
import kotlinx.android.synthetic.main.activity_payment.tv_waitPay_wifi

class PaymentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPaymentBinding
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onClickListener()
    }

    private fun onClickListener() {
        ivBack_from_Payment.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        tv_waitPay_wifi.setOnClickListener {
            startActivity(Intent(this, PayActivity::class.java))
        }
        tv_waitPay_ListrikAir.setOnClickListener {
            startActivity(Intent(this, PayActivity::class.java))
        }
        tv_waitPay_Kebersihan.setOnClickListener {
            startActivity(Intent(this, PayActivity::class.java))
        }
    }
}