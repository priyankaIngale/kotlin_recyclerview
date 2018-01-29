package com.vndroids.android.kotlin_recyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val users = ArrayList<String>()

        users.add("Vikas")
        users.add("Aakash")
        users.add("Neha")
        users.add("Vivek")
        rv_namelist.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val adapter = DataListAdapter(users)
        rv_namelist.adapter = adapter







    }
}
