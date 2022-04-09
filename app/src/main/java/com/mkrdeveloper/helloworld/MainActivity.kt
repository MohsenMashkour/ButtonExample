package com.mkrdeveloper.helloworld

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickMe = findViewById<Button>(R.id.btn_test)

       // clickMe.setOnClickListener {
          //  Toast.makeText(this, "btn test is clicked", Toast.LENGTH_SHORT).show()
     //   }

        clickMe.setOnLongClickListener {
            Toast.makeText(this, "btn test is long clicked", Toast.LENGTH_SHORT).show()
            true
        }

    }

    fun clicked(view: View) {

        Toast.makeText(this, "btn clicked", Toast.LENGTH_SHORT).show()
    }
}