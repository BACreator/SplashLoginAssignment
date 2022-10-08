package com.example.splashloginassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class SplashScreenActivity : AppCompatActivity() {

    private val SPLASH_TIME: Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val imageViewSplash: View = findViewById(R.id.splashImageView);

        Handler().postDelayed({
            startActivity(Intent(this, LogIn::class.java))
            finish()
        }, SPLASH_TIME)

       /* imageViewSplash.alpha = 0f
        imageViewSplash.animate().setDuration(1500).alpha(1f).withEndAction {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }*/
    }
}