package com.digitalhouse.rickapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.rickapp.api.IRespostaDaApi
import com.digitalhouse.rickapp.api.Personagem
import com.digitalhouse.rickapp.api.RickApi
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.persona_view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val viewManager = GridLayoutManager(this, 2)

        RickApi.getData(this, object: IRespostaDaApi {
            override fun obtevePersonagens(personagens: List<Personagem>) {

                val viewAdapter = PersonagemAdapter(personagens){

                        Toast.makeText(this@MainActivity, it.nome, Toast.LENGTH_LONG).show()

                    val intent = Intent(this@MainActivity, PersonagemApareceActivity::class.java)
                    intent.putExtra("NOME", it.nome)
                    intent.putExtra("GENERO", it.genero)
                    intent.putExtra("PAIS", it.localizacao.nome)
                    intent.putExtra("IMAGEM", it.imagemUrl)
                    startActivity(intent)
                }

                val recyclerView = findViewById<RecyclerView>(R.id.list_view_persona)

                recyclerView.apply {

                    setHasFixedSize(true)

                    layoutManager = viewManager
                    adapter = viewAdapter
                }

            }
        })

    }

}