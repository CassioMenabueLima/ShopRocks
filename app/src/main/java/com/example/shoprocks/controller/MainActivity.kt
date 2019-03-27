package com.example.shoprocks.controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.shoprocks.R
import com.example.shoprocks.Utilites.EXTRA_CATEGORY
import com.example.shoprocks.adapter.CategoryRecyclerAdapter
import com.example.shoprocks.services.DataService
import com.example.shoprocks.services.DataService.category
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    lateinit var adapter : CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerAdapter(this, DataService.category) {
            category ->
            val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
        }
        category_listview.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        category_listview.layoutManager = layoutManager
        category_listview.setHasFixedSize(true)

    }
}
