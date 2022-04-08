


package com.example.success



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

import android.os.Looper
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splachescreen)
        var splash = findViewById<ImageView>(R.id.bbbb)
        var splish = findViewById<TextView>(R.id.aaaa)
        /*splash.animate().setDuration(3000).alpha(0f).withEndAction{

            // splash.alpha = 1f

            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this, MainActivity:: class.java  )
                startActivity(intent)
            },3000)

        }
        splish.animate().setDuration(3000).translationX(0f).withEndAction {  }*/

        val fadein = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        val textt = AnimationUtils.loadAnimation(this, R.anim.text)

       splash.startAnimation(fadein)
        splish.startAnimation(textt)
        val SPASH_TIME_OUT = 4000
        val intent = Intent(this, MainActivity:: class.java)
        Handler().postDelayed({
            startActivity(intent)
            finish()
        }, SPASH_TIME_OUT.toLong())


    }
}

