package com.example.myapplication.aula08_viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MeuAdapter(private val fragmentos: List<Fragment>,
                 private val titulos: List<String>,
                 manager: FragmentManager): FragmentPagerAdapter(manager,
                BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    // Qunatidade de tabs
    override fun getCount() = fragmentos.size

    // Retorna o fragment correspondente a posição
    override fun getItem(position: Int) =  fragmentos[position]

    // Retorna o nome da tab
    override fun getPageTitle(position: Int) = titulos[position]

}