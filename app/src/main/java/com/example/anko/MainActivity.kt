package com.example.anko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        linearLayout {

            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER

            button("Go to ListView") {}.lparams(width = matchParent, height = wrapContent).onClick {

                startActivity<ListViewActivity>()

            }

        }
    }
}