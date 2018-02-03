package com.example.sahil.my_calc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var text : String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       TextViewBar.text=""
    }
    fun ClearAllBtnClicked(view: View){
        TextViewBar.text = ""
    }
    fun DivideBtnClicked(view: View){
        text = "${TextViewBar.text.toString()}/"
        TextViewBar.text = text
    }
    fun MultiplyBtnClicked(view: View){
        text = "${TextViewBar.text.toString()}*"
        TextViewBar.text = text
    }
    fun SevenBtnClicked(view: View){
        text = "${TextViewBar.text.toString()}7"
        TextViewBar.text = text
    }
    fun EightBtnClicked(view: View){
        text = "${TextViewBar.text.toString()}8"
        TextViewBar.text = text
    }
    fun NineBtnClicked(view: View){
        text = "${TextViewBar.text.toString()}9"
        TextViewBar.text = text
    }
    fun MinusBtnClicked(view: View){
        text = "${TextViewBar.text.toString()}-"
        TextViewBar.text = text
    }
    fun FourBtnClicked(view: View){
        text = "${TextViewBar.text.toString()}4"
        TextViewBar.text = text
    }
    fun FiveBtnClicked(view: View){
        text = "${TextViewBar.text.toString()}5"
        TextViewBar.text = text
    }
    fun SixBtnClicked(view: View){
        text = "${TextViewBar.text.toString()}6"
        TextViewBar.text = text
    }
    fun plusBtnClicked(view: View){
        text = "${TextViewBar.text.toString()}+"
        TextViewBar.text = text
    }
    fun OneBtnClicked(view: View){
        text = "${TextViewBar.text.toString()}1"
        TextViewBar.text = text
    }
    fun TwoBtnClicked(view: View){
        text = "${TextViewBar.text.toString()}2"
        TextViewBar.text = text
    }
    fun ThreeBtnClicked(view: View){
        text = "${TextViewBar.text.toString()}3"
        TextViewBar.text = text
    }
    fun PercentBtnClicked(view: View){
        text = "${TextViewBar.text.toString()}%"
        TextViewBar.text = text
    }
    fun ZeroBtnClicked(view: View){
        text = "${TextViewBar.text.toString()}0"
        TextViewBar.text = text
    }
    fun DecimalBtnClicked(view: View){
        text = "${TextViewBar.text.toString()}."
        TextViewBar.text = text
    }
    fun EraseOneBtnClicked(view: View) {

    }
    fun EqualBtnClicked(view: View){

    }
}

