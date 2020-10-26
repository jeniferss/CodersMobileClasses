package com.example.myapplication.aula08_viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import kotlin.math.max

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val pager = findViewById<ViewPager>(R.id.viewPager)
        val tab = findViewById<TabLayout>(R.id.tabLayout)

        // Faz com que o tabLayout use o viewPager
        tab.setupWithViewPager(pager)

        // Cria a lista de Fragmentos
        val fragmnet = listOf(
            MeuFragment(), MeuFragment(), MeuFragment()
        )

        // Cria a lista de Títulos
        val titulos = listOf(
            getString(R.string.home), getString(R.string.biblioteca), getString(R.string.favoritos)
        )


        pager.adapter = MeuAdapter(fragmnet, titulos, supportFragmentManager)

        // Adicionar icones
        tab.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_home_24)
        tab.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_library_books_24)
        tab.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_star_24)

        // Adicionar Contador
        tab.getTabAt(1)!!.orCreateBadge.apply{
            number = 10
            maxCharacterCount = 2
            isVisible = true
        }


        tab.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener {

            override fun onTabSelected(selected: TabLayout.Tab?) {
                if (selected!!.position == 1) {
                    tab.getTabAt(1)!!.badge?.isVisible = false
                }
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }
        })

    }
}