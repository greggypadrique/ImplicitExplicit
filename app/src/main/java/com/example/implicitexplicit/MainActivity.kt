package com.example.implicitexplicit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            if (TextUtils.isEmpty(username)) {
                usernameInput.setError("Please enter username")
            } else if (TextUtils.isEmpty(password)) {
                passwordInput.setError("Please enter password")
            } else if (username != "admin") {
                usernameInput.setError("Invalid Username")
            } else if (password != "admin") {
                passwordInput.setError("Invalid Password")
            } else if (username != "admin" && password != "admin") {
                usernameInput.setError("Invalid Username")
                passwordInput.setError("Invalid Password")
            } else if (username == "admin" && password == "admin"){
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("user", username)
                intent.putExtra("password", password)

                startActivity(intent)
                finish()
            } else {
                "Invalid Credentials"
            }
        }
    }
}