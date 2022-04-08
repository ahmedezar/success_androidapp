package com.example.success

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val forgotpasswordtextview = findViewById<TextView>(R.id.textView5)

        forgotpasswordtextview.setOnClickListener {

            val myIntent = Intent(this, forgetpass::class.java)
            startActivity(myIntent)

            val textView5 = forgotpasswordtextview
            textView5.movementMethod = LinkMovementMethod.getInstance();

        }
        val signuptextview = findViewById<TextView>(R.id.textView6)

        signuptextview.setOnClickListener {

            val myIntent = Intent(this, signup::class.java)
            startActivity(myIntent)

            val textView6 = signuptextview
            textView6.movementMethod = LinkMovementMethod.getInstance();

        }
        var btn: Button = findViewById<Button>(R.id.button)
        btn.setOnClickListener {


            val btn = Intent(this, home::class.java)
            startActivity(btn)
        }
    }

}