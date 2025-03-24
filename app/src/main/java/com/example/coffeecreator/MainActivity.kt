package com.example.coffeecreator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val coffeeRadioGroup: RadioGroup = findViewById(R.id.coffee_selection) // oznaczenie grupy radio buttonow jako zmienna coffeeRadioGroup
        val image = findViewById<ImageView>(R.id.myImage)
        var selectedCoffee: String = "" // deklaracja pustej zmiennej

        coffeeRadioGroup.setOnCheckedChangeListener { _, checkedId ->
            when(checkedId) {
                R.id.Espresso -> image.setImageResource(R.drawable.espresso)
                R.id.Cappuccino -> image.setImageResource(R.drawable.capuccino)
                R.id.Latte -> image.setImageResource(R.drawable.latte)
                else -> R.drawable.image_not_found
            }
        }
        // TODO: fix
    }
}