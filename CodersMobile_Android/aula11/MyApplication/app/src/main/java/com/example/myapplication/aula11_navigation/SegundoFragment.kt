package com.example.myapplication.aula11_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController

class SegundoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_segundo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()
        
        view.findViewById<TextView>(R.id.txtSegundoFragment).text = arguments?.getString(PrimeiroFragment.KEY_TEXT_01)
        
        val icon_01 = arguments?.getInt(PrimeiroFragment.KEY_ICON_01)

        if(icon_01 != null){
            val icDrawable_01 = ContextCompat.getDrawable(view.context, icon_01)
            view.findViewById<ImageView>(R.id.imgSegundoFragment)
                .setImageDrawable(icDrawable_01)
        }

        view.findViewById<Button>(R.id.btnSegundoFragment).setOnClickListener {
            val bundle = bundleOf(
                KEY_ICON_02 to R.drawable.ic_baseline_mood_bad_24,
                KEY_TEXT_02 to "BAD MOOD" )
            navController.navigate(R.id.terceiroFragment2, bundle)
        }
    }

    companion object{
        const val KEY_ICON_02 = "ICON_02"
        const val KEY_TEXT_02 = "TEXT_02"
    }

}