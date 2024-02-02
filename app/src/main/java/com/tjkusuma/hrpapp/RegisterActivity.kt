package com.tjkusuma.hrpapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.tjkusuma.hrpapp.databinding.ActivityRegisterBinding
import kotlinx.android.synthetic.main.activity_register.register_button
import kotlinx.android.synthetic.main.activity_register.tv_login_from_register

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView (binding.root)
        onClickListener()
    }

    private fun onClickListener() {
        register_button.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            binding.pgLoading.visibility = View.VISIBLE
        }
        tv_login_from_register.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            binding.pgLoading.visibility = View.INVISIBLE
        }
    }
}

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_register)
//        val buttonClickReg = findViewById<Button>(R.id.register_button)
//        buttonClickReg.setOnClickListener {
//            val intent = Intent(this, LoginActivity::class.java)
//            startActivity(intent)
//        }
//        val textviewonClickReg = findViewById<TextView>(R.id.tv_login_from_register)
//        textviewonClickReg.setOnClickListener {
//            val intent = Intent(this, LoginActivity::class.java)
//            startActivity(intent)
//        }
//    }

//        binding = ActivityRegisterBinding.inflate(layoutInflater)
//        val view = binding.root
//        setContentView(view)
//
//        binding.registerButton.setOnClickListener {
//            binding.pgLoading.visibility = View.VISIBLE
//            val loginIntent = Intent(this, LoginActivity::class.java)
//            startActivity(loginIntent)
//        }
//        binding.tvLoginFromRegister.setOnClickListener {
//            binding.pgLoading.visibility = View.VISIBLE
//            val loginIntent = Intent(this, LoginActivity::class.java)
//            startActivity(loginIntent)
//        }
//    }
//}
