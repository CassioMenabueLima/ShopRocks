package com.example.shoprocks.services

import com.example.shoprocks.model.Category
import com.example.shoprocks.model.Product

object DataService {

    val category = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoddieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Graphic Beanie", "$18", "hat01"),
        Product("Hat Black", "$20", "hat02"),
        Product("Hat White", "$18", "hat03"),
        Product("Hat Snapback", "$22", "hat04")
    )
    val hoodies = listOf(
        Product("Hoodie Gray", "$28", "hoodie01"),
        Product("Hoodie Red", "$32", "hoodie02"),
        Product("Gray Hoodie", "$25", "hoodie03"),
        Product("Black Hoodie", "$29", "hoodie04")
    )
    val shirts = listOf(
        Product("Shirt Black", "$28", "shirt01"),
        Product("Shirt Bagde Light Gray", "$28", "shirt02"),
        Product("Shirt Red", "$28", "shirt03"),
        Product("Hustle", "$28", "shirt04"),
        Product("KickFlip Studios", "$28", "shirt05")

    )
}