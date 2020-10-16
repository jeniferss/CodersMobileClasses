package com.example.myapplication.addcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        floating_action_button.setOnClickListener {
            Snackbar.make(mostrar, "Falai!", Snackbar.LENGTH_SHORT).show()
        }
    }
}