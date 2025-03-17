package com.example.coffeecreator

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

        var selectedCoffee: String = "" // deklaracja pustej zmiennej

        coffeeRadioGroup.setOnCheckedChangeListener { _, checkedId ->
            val images = when(checkedId) {
                R.id.Espresso -> R.drawable.espresso
                R.id.Cappuccino -> R.drawable.capuccino
                R.id.Latte -> R.drawable.latte
                else -> R.drawable.image_not_found
            }
        }
        // TODO: fix
    }
}