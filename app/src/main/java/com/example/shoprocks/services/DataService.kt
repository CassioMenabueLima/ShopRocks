package com.example.shoprocks.services

import com.example.shoprocks.model.Category
import com.example.shoprocks.model.Product

object DataService {

    val category = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Graphic Beanie", "$18", "hat1"),
        Product("Hat Black", "$20", "hat2"),
        Product("Hat White", "$18", "hat3"),
        Product("Hat Snapback", "$22", "hat4")
    )
    val hoodies = listOf(
        Product("Hoodie Gray", "$28", "hoodie1"),
        Product("Hoodie Red", "$32", "hoodie2"),
        Product("Gray Hoodie", "$25", "hoodie3"),
        Product("Black Hoodie", "$29", "hoodie4")
    )
    val shirts = listOf(
        Product("Shirt Black", "$28", "shirt1"),
        Product("Shirt Bagde Light Gray", "$28", "shirt2"),
        Product("Shirt Red", "$28", "shirt3"),
        Product("Hustle", "$28", "shirt4"),
        Product("KickFlip Studios", "$28", "shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product> {

        return when (category) {
            "SHIRTS" -> shirts
            "HOODIES" -> hoodies
            "HATS" -> hats
            else -> digitalGood
        }
    }
}