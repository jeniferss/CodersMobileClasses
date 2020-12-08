package com.example.myapplication.exerciciosharedpreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val prefs = getSharedPreferences(APP_NAME, MODE_PRIVATE)
        val prefsCheked = prefs.getBoolean(NOTIFICATION_PREFS, false)

        Handler(Looper.getMainLooper()).postDelayed({
            if(prefsCheked) {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }

        }, 3000)
    }

    companion object{
        const val APP_NAME = "Shared_Preferences_Exercicio"
        const val NOTIFICATION_PREFS = "NOTIFICATION_PREFS"
    }
}