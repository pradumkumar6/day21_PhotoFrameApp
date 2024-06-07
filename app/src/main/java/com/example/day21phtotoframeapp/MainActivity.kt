package com.example.day21phtotoframeapp

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var currentImage = 0
    lateinit var image: ImageView
    var names = arrayOf("IIT Dhanbad","IIT Dhanbad","Mayra","Mayra","Mayra","Shubham","Manish")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val prev = findViewById<ImageButton>(R.id.imgPrev)
        val next = findViewById<ImageButton>(R.id.imgNext)
        val text = findViewById<TextView>(R.id.textView)
        prev.setOnClickListener {
            // find id of current image
            val idCurrentImageString = "pic$currentImage"
            // Convert String id in to integer address associated with it
            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString,"id",packageName)
            image = findViewById(idCurrentImageInt)
            // current image will be invisible
            image.alpha =0f
            currentImage = (7+currentImage-1)%7
            // find id of current image
            val idImageToShowString = "pic$currentImage"
            // Convert String id in to integer address associated with it
            val idImageToShowInt = this.resources.getIdentifier(idImageToShowString,"id",packageName)
            image = findViewById(idImageToShowInt)
            image.alpha = 1f
            // To show the name
            text.text = names[currentImage]
        }
        next.setOnClickListener {
            // find id of current image
            val idCurrentImageString = "pic$currentImage"
            // Convert String id in to integer address associated with it
            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString,"id",packageName)
            image = findViewById(idCurrentImageInt)
            // current image will be invisible
            image.alpha =0f
            currentImage = (7+currentImage+1)%7
            // find id of current image
            val idImageToShowString = "pic$currentImage"
            // Convert String id in to integer address associated with it
            val idImageToShowInt = this.resources.getIdentifier(idImageToShowString,"id",packageName)
            image = findViewById(idImageToShowInt)
            image.alpha = 1f
            text.text = names[currentImage]
        }




    }
}