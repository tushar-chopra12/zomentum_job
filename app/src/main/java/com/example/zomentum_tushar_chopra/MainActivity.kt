package com.example.zomentum_tushar_chopra

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.inflate
import android.widget.Adapter
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.zomentum_tushar_chopra.Models.Contacts
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Context as Context1

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    private lateinit var viewManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapterClass: chatAdapterClass
    val contactList:ArrayList<Contacts> = arrayListOf<Contacts>(
        Contacts("1", "Naina", "My name is Naina", "4:20 pm", R.drawable.circle),
        Contacts("2", "Tushar", "Wassuppp", "4:25 pm", R.drawable.circle),
        Contacts("3", "Karan", "kya kar rha hai", "7:20 pm", R.drawable.circle),
        Contacts("4", "Anuj", "Up for a party?", "2:20 pm", R.drawable.circle),
        Contacts("5", "Rishabh", "Long time no see", "5:20 pm", R.drawable.circle),
        Contacts("6", "Parth", "College chalega?", "8:20 pm", R.drawable.circle),
        Contacts("7", "Sethi", "Suppp", "1:20 pm", R.drawable.circle)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewManager = LinearLayoutManager(this)


        recyclerView = findViewById<RecyclerView>(R.id.recycler_view).apply {

            setHasFixedSize(true)
            layoutManager = viewManager

        }

        recycler_view.adapter = recyclerAdapterClass
        recyclerAdapterClass = chatAdapterClass(MainActivity(),contactList)


        recycler_view.addItemDecoration(
            DividerItemDecoration(
                recycler_view.context,
                (viewManager as LinearLayoutManager).orientation
            )
        )


    }
}
