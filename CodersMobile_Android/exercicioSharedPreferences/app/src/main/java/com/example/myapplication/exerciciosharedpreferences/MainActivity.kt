package com.example.myapplication.exerciciosharedpreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switch = findViewById<CheckBox>(R.id.checkBox)
        val prefs = getSharedPreferences(SplashScreenActivity.APP_NAME, MODE_PRIVATE)

        switch.setOnCheckedChangeListener { _, isChecked ->
            prefs.edit().putBoolean(SplashScreenActivity.NOTIFICATION_PREFS, isChecked).apply()
        }

        findViewById<Button>(R.id.btnLogar).setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}