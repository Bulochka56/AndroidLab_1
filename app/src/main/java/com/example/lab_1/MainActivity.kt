package com.example.lab_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView = findViewById<ImageView>(R.id.imageView)

        // Загрузите анимацию из ресурсов
        val slideInLeftAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in_left)

        // Примените анимацию к изображению
        imageView.startAnimation(slideInLeftAnimation)
    }
}