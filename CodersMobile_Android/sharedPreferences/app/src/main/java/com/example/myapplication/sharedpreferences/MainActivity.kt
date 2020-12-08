package com.example.myapplication.sharedpreferences

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switch = findViewById<Switch>(R.id.savePrefence)
        val prefs = getSharedPreferences(APP_NAME, MODE_PRIVATE)
        val prefsChecked = prefs.getBoolean(NOTIFICATION_PREFS, false)

        switch.isChecked = prefsChecked

        switch.setOnCheckedChangeListener { _, isChecked ->
            prefs.edit().putBoolean(NOTIFICATION_PREFS, isChecked).apply()
        }
    }

    companion object{
        const val APP_NAME = "Shared_Preferences"
        const val NOTIFICATION_PREFS = "NOTIFICATION_PREFS"
    }
}