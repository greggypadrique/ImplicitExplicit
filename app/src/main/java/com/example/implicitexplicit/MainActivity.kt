package com.example.implicitexplicit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener{
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            if(TextUtils.isEmpty(username)) {
                usernameInput.setError("Please enter username")
            }else if(TextUtils.isEmpty(password)){
                passwordInput.setError("Please enter password")
            }else{
                
            }
        }
    }
}