package com.hhp227.hhp227_3dviewer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    companion object {
        private const val SPLASH_TIME_OUT = 1500L
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
            finish()
            overridePendingTransition(R.anim.splash_in, R.anim.splash_out)
        }, SPLASH_TIME_OUT)
    }
}
