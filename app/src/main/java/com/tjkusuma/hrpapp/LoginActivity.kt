package com.tjkusuma.hrpapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.tjkusuma.hrpapp.databinding.ActivityLoginBinding
import kotlinx.android.synthetic.main.activity_login.login_button
import kotlinx.android.synthetic.main.activity_login.tv_register_from_login

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        onClickListener()
    }

    private fun onClickListener() {
        login_button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            binding.pgLoading.visibility = View.VISIBLE
        }
        tv_register_from_login.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
            binding.pgLoading.visibility = View.INVISIBLE
        }
    }
}


//class LoginActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_login)
//        val buttonClick = findViewById<Button>(R.id.login_button)
//        buttonClick.setOnClickListener {
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//        }
//        val textviewonClick = findViewById<TextView>(R.id.tv_register_from_login)
//        textviewonClick.setOnClickListener {
//            val intent = Intent(this, RegisterActivity::class.java)
//            startActivity(intent)
//        }
//    }
//}

//
//        binding.loginButton.setOnClickListener {
//            val Intent = Intent(this, MainActivity::class.java)
//            startActivity(Intent)
//        }
//        binding.tvRegisterFromLogin.setOnClickListener {
//            binding.pgLoading.visibility = View.VISIBLE
//            val Intent = Intent(this, RegisterActivity::class.java)
//            startActivity(Intent)