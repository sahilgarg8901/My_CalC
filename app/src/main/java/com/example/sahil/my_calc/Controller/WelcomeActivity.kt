package com.example.sahil.my_calc.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.sahil.my_calc.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {
    private val splashScreenTime = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        Handler().postDelayed({
            val leagueIntent = Intent(this, MainActivity::class.java)
            startActivity(leagueIntent)
            finish()
        },splashScreenTime.toLong())
        //WelcomeLogo.x = -1000f
        //WelcomeLogo.animate().translationXBy(1000f).rotation(720f).duration=1000
        WelcomeLogo.scaleX=0.5f
        WelcomeLogo.scaleY=0.5f
        WelcomeLogo.animate().scaleX(1f).scaleY(1f).rotation(720f).duration=1500
    }
}
