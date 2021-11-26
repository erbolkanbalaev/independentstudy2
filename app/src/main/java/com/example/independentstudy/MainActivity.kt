package com.example.independentstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var tvbtn: Button
    lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        tvbtn = findViewById(R.id.tvbtn)


        tvbtn.setOnClickListener {
            val numberEditText = editText.text
            if (numberEditText.isNullOrEmpty()) {
                Toast.makeText(this, "Неверный формат", Toast.LENGTH_SHORT).show()
            } else {
                val name = editText.text.toString().toInt()
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("NAME", name)
                startActivity(intent)
            }
        }
    }
}