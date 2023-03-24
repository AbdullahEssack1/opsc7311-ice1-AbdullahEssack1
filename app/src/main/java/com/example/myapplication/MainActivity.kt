package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPlay = findViewById<Button>(R.id.buttonStart)
        val txtName = findViewById<EditText>(R.id.txtName)



        btnPlay.setOnClickListener() {
            Toast.makeText(this, "Hello " + txtName.text, Toast.LENGTH_LONG).show()

            val intent = Intent(this, Word::class.java)
            startActivity(intent)
        }

        val btnWords = findViewById<Button>(R.id.buttonWords)

        btnWords.setOnClickListener() {

            val intent2 = Intent(this, RecycleviewActivity::class.java)
            startActivity(intent2)
        }
    }
}




