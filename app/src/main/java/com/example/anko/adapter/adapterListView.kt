package com.example.anko.adapter

import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.LinearLayout
import com.example.anko.dataClass.myDataClass
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class adapterListView(private val data: List<myDataClass>):BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view : View

        if (convertView == null){

            view = with(parent!!.context){
                linearLayout {

                    orientation = LinearLayout.HORIZONTAL
                    gravity = Gravity.CENTER

                    textView(data[position].name){}.lparams(width = wrapContent , height = wrapContent){

                        margin = dip(10)
                        padding = dip(10)

                    }.onClick {

                        toast(data[position].name)

                    }

                    textView(data[position].family){}.lparams(width = wrapContent , height = wrapContent){

                        margin = dip(10)
                        padding = dip(10)

                    }.onClick {

                        toast(data[position].family)

                    }

                }
            }

        }else{

            view = convertView

        }


        return view
    }

    override fun getItem(position: Int): Any = data[position]

    override fun getItemId(position: Int): Long = 0

    override fun getCount(): Int = data.size
}