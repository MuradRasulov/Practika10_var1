package com.example.practika10_var4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.edit

class MainActivity : AppCompatActivity() {

    private lateinit var constraintLayout: ConstraintLayout
    private lateinit var TextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        constraintLayout = findViewById<ConstraintLayout>(androidx.constraintlayout.widget.R.id.constraint)
        TextView = findViewById(R.id.editText)
        val preferences = getSharedPreferences("pref", MODE_PRIVATE)

            var count = preferences.getInt("count", -1)
            count++
            TextView.text = count.toString()

            preferences.edit {
                this.putInt("count", count)
            }
    }
}