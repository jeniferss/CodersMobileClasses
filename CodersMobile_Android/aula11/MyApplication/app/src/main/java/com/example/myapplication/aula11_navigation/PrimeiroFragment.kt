package com.example.myapplication.aula11_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController

class PrimeiroFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_primeiro, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = Navigation.findNavController(view)

        view.findViewById<Button>(R.id.btnPrimeiroFragment).setOnClickListener {
            val bundle= bundleOf(
                KEY_ICON_01 to R.drawable.ic_baseline_mood_24,
                KEY_TEXT_01 to "GOOD MOOD")
            navController.navigate(R.id.segundoFragment2, bundle)
        }

    }

    companion object{
        val KEY_ICON_01 = "ICON_01"
        val KEY_TEXT_01 = "TEXT_01"
    }

}