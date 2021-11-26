package com.example.independentstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SecondActivity : AppCompatActivity() {
    lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        imageView = findViewById(R.id.image)

        val name = intent.getIntExtra("NAME",0)

        when (name){
            1 -> imageView.setImageResource(R.drawable.image2)
            2 -> imageView.setImageResource(R.drawable.image3)
            3 -> imageView.setImageResource(R.drawable.image)
        }
    }
}