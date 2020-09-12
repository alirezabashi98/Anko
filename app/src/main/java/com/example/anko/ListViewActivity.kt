package com.example.anko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.anko.adapter.adapterListView
import com.example.anko.dataClass.myDataClass
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {

    val data = listOf(
        myDataClass("Alireza" , "Bashi"),
        myDataClass("Alireza" , "Bashi"),
        myDataClass("Alireza" , "Bashi"),
        myDataClass("Alireza" , "Bashi"),
        myDataClass("Alireza" , "Bashi"),
        myDataClass("Alireza" , "Bashi"),
        myDataClass("Alireza" , "Bashi"),
        myDataClass("Alireza" , "Bashi"),
        myDataClass("Alireza" , "Bashi"),
        myDataClass("Alireza" , "Bashi98")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        listView.adapter = adapterListView(data)

    }
}