package com.example.sahil.my_calc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        try{
            getStartedBtn.setOnClickListener{
                val leagueIntent = Intent(this, MainActivity::class.java)
                startActivity(leagueIntent)
            }
        }catch (e : Exception){
            Log.e("my_app","exception "+e.message)
        }

    }
}
