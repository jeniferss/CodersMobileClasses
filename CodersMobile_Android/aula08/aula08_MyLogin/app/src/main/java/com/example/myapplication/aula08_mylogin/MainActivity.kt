package com.example.myapplication.aula08_mylogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import androidx.viewpager.widget.ViewPager
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_login.*

class MainActivity : AppCompatActivity(), IClick {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pager = findViewById<ViewPager>(R.id.viewPagerMain)
        val tab = findViewById<TabLayout>(R.id.tabLayoutMain)

        tab.setupWithViewPager(pager)

        val fragmentos = listOf(LoginFragment(), RegistroFragmento())

        val titulos = listOf("Sign In", "Sign Up")

        pager.adapter = ViewPagerAdapter(fragmentos, titulos, supportFragmentManager)

    }

    override fun clickSetToast(valor: Int, mensagem: String) {
        when (valor) {
            1 -> {
                Snackbar.make(viewShowSnackBar, mensagem, Snackbar.LENGTH_SHORT).show()
            }
            2 -> {
                Snackbar.make(viewShowSnackBar, mensagem, Snackbar.LENGTH_SHORT).show()
            }
            3 -> {
                Snackbar.make(viewShowSnackBar, mensagem, Snackbar.LENGTH_SHORT).show()
            }
        }
    }

    override fun clickSetToastLogin(valorLogin: Int, mensagemLogin: String) {
        when (valorLogin) {
            1 -> {
                Snackbar.make(viewShowSnackBar, mensagemLogin, Snackbar.LENGTH_SHORT).show()
            }
            2 -> {
                Snackbar.make(viewShowSnackBar, mensagemLogin, Snackbar.LENGTH_SHORT).show()
            }
        }
    }
}