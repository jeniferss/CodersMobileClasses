package com.example.myapplication.aula08_viewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class MeuFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString("TEXTO")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val minhaView = inflater.inflate(R.layout.fragment_meu, container, false)
        minhaView.findViewById<TextView>(R.id.txtMeuTexto).text = param1
        return minhaView
    }

    companion object {
        // Não vai ser instanciado é estático

        fun newInstance(texto: String) =
            MeuFragment().apply {
                arguments = Bundle().apply {
                    putString("TEXTO", texto)
                }
            }
    }
}