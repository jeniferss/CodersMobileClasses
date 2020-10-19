package com.example.myapplication.aula05_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*

lateinit var manager: FragmentManager
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        manager = supportFragmentManager

        val aFragment = AFragment()
        val bFragment = BFragment()

        btnFragmentA.setOnClickListener{
            addFragment(aFragment)
        }

        btnFragmentB.setOnClickListener{
            addFragment(bFragment)
        }
    }

    fun addFragment(fragment: Fragment){
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.fragmentContainer, fragment)
        transaction.commit()
    }

}