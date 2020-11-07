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

class TerceiroFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_terceiro, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.txtTerceiroFragment).text =
            arguments?.getString(SegundoFragment.KEY_TEXT_02)

        val icon_02 = arguments?.getInt(SegundoFragment.KEY_ICON_02)

        if(icon_02 != null){
            val icDrawable_02 = ContextCompat.getDrawable(view.context, icon_02)
            view.findViewById<ImageView>(R.id.imgTerceiroFragment)
                .setImageDrawable(icDrawable_02)
        }

    }
}