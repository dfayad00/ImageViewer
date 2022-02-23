package edu.temple.imageviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = arrayOf(
            R.drawable.pug,
            R.drawable.bulldog,
            R.drawable.dalmation,
            R.drawable.doberman,
            R.drawable.german_sheperd,
            R.drawable.golden_retriever,
            R.drawable.saint_bernard,
            R.drawable.shih_tzu,
            R.drawable.rottweiler,
            R.drawable.yellow_lab)

        val numColumns = 2
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = GridLayoutManager(this, numColumns)

        val adapter = ImageAdapter(images)
        recyclerView.adapter = adapter
    }
}