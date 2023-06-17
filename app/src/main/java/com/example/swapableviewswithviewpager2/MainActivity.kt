package com.example.swapableviewswithviewpager2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        viewPager = findViewById(R.id.viewPager)        // to initialize viewPager remember it is of type viewPager2

        val images = listOf(
            R.drawable.image,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image
        )


        val adapter = ViewPagerAdapter(images)
        viewPager.adapter = adapter

        // heavy feature
        viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL

        // heavy feature
        viewPager.beginFakeDrag()
        viewPager.fakeDragBy(-10f)
        viewPager.endFakeDrag()


    }
}