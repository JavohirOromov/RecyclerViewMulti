package com.example.recyclerviewmulti

import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val advertList = listOf(
            AdvertData(R.drawable.banner1),
            AdvertData(R.drawable.banner2),
            AdvertData(R.drawable.banner3),
            AdvertData(R.drawable.banner1),
            AdvertData(R.drawable.banner2),
            AdvertData(R.drawable.banner3),
            AdvertData(R.drawable.banner1),
            AdvertData(R.drawable.banner2),
            AdvertData(R.drawable.banner3),
            AdvertData(R.drawable.banner1),
            AdvertData(R.drawable.banner2),
            AdvertData(R.drawable.banner3),
        )
        val categoryList = listOf(
            CategoryData(R.drawable.fashion_1, "Fruits", Color.parseColor("#E8FCFF")),
            CategoryData(R.drawable.fashion2, "Vegetables", Color.parseColor("#FFE8D5")),
            CategoryData(R.drawable.fashion_3, "Meat", Color.parseColor("#E9F5FF")),
            CategoryData(R.drawable.fashion_4, "Dairy", Color.parseColor("#FEEAE8")),
            CategoryData(R.drawable.category, "Bakery", Color.parseColor("#E4FFF6")),
            CategoryData(R.drawable.fashion_1, "Fruits", Color.parseColor("#E8FCFF")),
            CategoryData(R.drawable.fashion2, "Vegetables", Color.parseColor("#FFE8D5")),
            CategoryData(R.drawable.fashion_3, "Meat", Color.parseColor("#E9F5FF")),
            CategoryData(R.drawable.fashion_4, "Dairy", Color.parseColor("#FEEAE8")),
            CategoryData(R.drawable.category, "Bakery", Color.parseColor("#E4FFF6")),
            CategoryData(R.drawable.fashion_1, "Fruits", Color.parseColor("#E8FCFF")),
            CategoryData(R.drawable.fashion2, "Vegetables", Color.parseColor("#FFE8D5")),
            CategoryData(R.drawable.fashion_3, "Meat", Color.parseColor("#E9F5FF")),
            CategoryData(R.drawable.fashion_4, "Dairy", Color.parseColor("#FEEAE8")),
            CategoryData(R.drawable.category, "Bakery", Color.parseColor("#E4FFF6")),
        )
        val productList = listOf(
            ProductData(R.drawable.product1, "Monitor LG 22”inc 4K 120Fps", 12),
            ProductData(R.drawable.product2, "Aestechic Mug - white variant", 13),
            ProductData(R.drawable.product3, "Airpods pro", 14),
            ProductData(R.drawable.product4, "PS5 Console", 13),
            ProductData(R.drawable.product5, "MacBook Pro m2 chip", 15),
            ProductData(R.drawable.product1, "Monitor LG 22”inc 4K 120Fps", 56),
            ProductData(R.drawable.product2, "Aestechic Mug - white variant", 14),
            ProductData(R.drawable.product3, "Airpods pro", 15),
            ProductData(R.drawable.product4, "PS5 Console", 16),
            ProductData(R.drawable.product5, "MacBook Pro m2 chip", 17),
            ProductData(R.drawable.product1, "Monitor LG 22”inc 4K 120Fps", 19),
            ProductData(R.drawable.product2, "Aestechic Mug - white variant", 34),
            ProductData(R.drawable.product3, "Airpods pro", 67),
            ProductData(R.drawable.product4, "PS5 Console", 78),
            ProductData(R.drawable.product5, "MacBook Pro m2 chip", 78),
            ProductData(R.drawable.product1, "Monitor LG 22”inc 4K 120Fps", 87),
            ProductData(R.drawable.product2, "Aestechic Mug - white variant", 87),
            ProductData(R.drawable.product3, "Airpods pro", 87),
            ProductData(R.drawable.product4, "PS5 Console", 87),
            ProductData(R.drawable.product5, "MacBook Pro m2 chip", 87),
            ProductData(R.drawable.product1, "Monitor LG 22”inc 4K 120Fps", 87),
            ProductData(R.drawable.product2, "Aestechic Mug - white variant", 87),
            ProductData(R.drawable.product3, "Airpods pro", 87),
            ProductData(R.drawable.product4, "PS5 Console", 87),
            ProductData(R.drawable.product5, "MacBook Pro m2 chip", 876),
            ProductData(R.drawable.product1, "Monitor LG 22”inc 4K 120Fps", 786),
            ProductData(R.drawable.product2, "Aestechic Mug - white variant", 76),
            ProductData(R.drawable.product3, "Airpods pro", 76),
            ProductData(R.drawable.product4, "PS5 Console", 76),
            ProductData(R.drawable.product5, "MacBook Pro m2 chip", 876),


            )
        val sectionList = listOf(
            SelectionData(1, advertList),      // Reklama bo‘limi
            SelectionData(2, categoryList), // Kategoriya bo‘limi
            SelectionData(3, productList)   // Mahsulotlar bo‘limi
        )
        val parentAdapter = ParentAdapter(sectionList)
        val recycler = findViewById<RecyclerView>(R.id.rootRv)
        recycler.adapter = parentAdapter
        recycler.layoutManager = LinearLayoutManager(this)
    }
}