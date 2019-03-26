package com.example.shoprocks

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import com.example.shoprocks.adapter.CategoryAdapter
import com.example.shoprocks.adapter.CategoryRecyclerAdapter
import com.example.shoprocks.model.Category
import com.example.shoprocks.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var adapter : CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerAdapter(this, DataService.category)
        category_listview.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        category_listview.layoutManager = layoutManager
        category_listview.setHasFixedSize(true)
        
    }
}
