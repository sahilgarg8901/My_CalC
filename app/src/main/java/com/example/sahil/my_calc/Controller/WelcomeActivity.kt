package com.example.sahil.my_calc.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.sahil.my_calc.R

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
    }
}
