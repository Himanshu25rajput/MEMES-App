package com.example.memes

import android.app.StatusBarManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash_scrren.*

class SplashScrrenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_scrren)
        val text1animation= AnimationUtils.loadAnimation(this,R.anim.text1_animation)
        val createranimation= AnimationUtils.loadAnimation(this,R.anim.creater_animation)
        text1.startAnimation(text1animation)
        creater.startAnimation(createranimation)
        val splashScrrenTimeout=2500
        Handler().postDelayed({
                val intent=Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()
        },splashScrrenTimeout.toLong())

    }
}