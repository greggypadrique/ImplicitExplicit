package com.example.implicitexplicit

import android.app.SearchManager
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.MediaStore
import android.provider.Settings
import android.widget.Button
import android.widget.Toast


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        intent.getStringExtra("user")
        intent.getStringExtra("password")

        findViewById<Button>(R.id.button1).setOnClickListener{ b1() }
        findViewById<Button>(R.id.button2).setOnClickListener{ b2() }
        findViewById<Button>(R.id.button3).setOnClickListener{ b3() }
        findViewById<Button>(R.id.button4).setOnClickListener{ b4() }
        findViewById<Button>(R.id.button5).setOnClickListener{ b5() }
    }
    private fun b1(){
        val intent = Intent(Settings.ACTION_WIFI_SETTINGS)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
    private fun b2(){
        val webIntent: Intent = Uri.parse("https://www.google.com").let { webpage ->
            Intent(Intent.ACTION_VIEW, webpage)
        }
        startActivity(webIntent)
    }
    private fun b3(){
        val mapIntent: Intent = Uri.parse(
            "geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California"
        ).let { location ->
            // Or map point based on latitude/longitude
            // Uri location = Uri.parse("geo:37.422219,-122.08364?z=14"); // z param is zoom level
            Intent(Intent.ACTION_VIEW, location)
        }
        startActivity(mapIntent)
    }
    private fun b4(){
        Toast.makeText( this, "Failed to open the Camera: Your Device Is Not Compatible For This Task.", Toast.LENGTH_LONG).show()
    }
    private fun b5(){
        Toast.makeText( this, "Access Denied: Change The Permissions To Allow The App The Access Your Gallery. ", Toast.LENGTH_LONG).show()
    }
}