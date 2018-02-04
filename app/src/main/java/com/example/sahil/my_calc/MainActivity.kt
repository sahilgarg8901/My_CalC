package com.example.sahil.my_calc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /*var text = TextViewBar.editableText
    var newText : String = ""*/
    var text : String? = ""

    private var textView : TextView = findViewById(R.id.TextViewBar) as TextView
    //textView.setText(text)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text = ""
        textView.text = ""
        //TextViewBar.setText("")
        ClearAllButton.setOnClickListener{
            textView.text = ""
        }
        DivideButton.setOnClickListener {
            text = "${textView.text.toString()}/"
            textView.text = text
        }
        MultiplyButton.setOnClickListener {
                    text = "${textView.text.toString()}*"
                    textView.text = text
        }
        SevenButton.setOnClickListener {
                    text = "${textView.text.toString()}7"
                    textView.text = text
                }
        EightButton.setOnClickListener {
                    text = "${textView.text.toString()}8"
                    textView.text = text
                }
        NineButton.setOnClickListener {
                    text = "${textView.text.toString()}9"
                    textView.text = text
                }
        MinusButton.setOnClickListener {
                    text = "${textView.text.toString()}-"
                    textView.text = text
                }
        FourButton.setOnClickListener {
                    text = "${textView.text.toString()}4"
                    textView.text = text
        }
        FiveButton.setOnClickListener {
                    text = "${textView.text.toString()}5"
                    textView.text = text
        }
        SixButton.setOnClickListener {
                    text = "${textView.text.toString()}6"
                    textView.text = text
        }
        plusButton.setOnClickListener {
                    text = "${textView.text.toString()}+"
                    textView.text = text
        }
        OneButton.setOnClickListener {
                    text = "${textView.text.toString()}1"
                    textView.text = text
        }
        TwoButton.setOnClickListener {
                    text = "${textView.text.toString()}2"
                    textView.text = text
        }
        ThreeButton.setOnClickListener {
                    text = "${textView.text.toString()}3"
                    textView.text = text
        }
        EqualButton.setOnClickListener {
                    text = "${textView.text.toString()}="
                    textView.text = text
        }
        PercentButton.setOnClickListener {
                    text = "${textView.text.toString()}%"
                    textView.text = text
        }
        ZeroButton.setOnClickListener {
                    text = "${textView.text.toString()}0"
                    textView.text = text
        }
        DecimalButton.setOnClickListener {
                    text = "${textView.text.toString()}."
                    textView.text = text
        }
        EraseOneButton.setOnClickListener {
//                    text = "${textView.text.toString()}"
//                    textView.text = text
        }


    }/*
    fun ClearAllBtnClicked(view: View){

        //TextViewBar.setText("")
        textView.text = ""
    }
    fun DivideBtnClicked(view: View){
      //  newText = text + "/"
        text = "${textView.text.toString()}/"
        //TextViewBar.setText(text)
        textView.text = text
    }
    fun MultiplyBtnClicked(view: View){
        text = "${textView.text.toString()}*"
        //TextViewBar.setText(text)
        textView.text = text
    }
    fun SevenBtnClicked(view: View){
        text = "${textView.text.toString()}7"
        //TextViewBar.setText(text)
        textView.text = text
    }
    fun EightBtnClicked(view: View){
        text = "${textView.text.toString()}8"
        //TextViewBar.setText(text)
        textView.text = text
    }
    fun NineBtnClicked(view: View){
        text = "${textView.text.toString()}9"
        //TextViewBar.setText(text)
        textView.text = text
    }
    fun MinusBtnClicked(view: View){
        text = "${textView.text.toString()}-"
        //TextViewBar.setText(text)
        textView.text = text
    }
    fun FourBtnClicked(view: View){
        text = "${textView.text.toString()}4"
        //TextViewBar.setText(text)
        textView.text = text
    }
    fun FiveBtnClicked(view: View){
        text = "${textView.text.toString()}5"
        //TextViewBar.setText(text)
        textView.text = text
    }
    fun SixBtnClicked(view: View){
        text = "${textView.text.toString()}6"
        //TextViewBar.setText(text)
        textView.text = text
    }
    fun plusBtnClicked(view: View){
        text = "${textView.text.toString()}+"
        //TextViewBar.setText(text)
        textView.text = text
    }
    fun OneBtnClicked(view: View){
        text = "${textView.text.toString()}1"
        //TextViewBar.setText(text)
        textView.text = text
    }
    fun TwoBtnClicked(view: View){
        text = "${textView.text.toString()}2"
        //TextViewBar.setText(text)
        textView.text = text
    }
    fun ThreeBtnClicked(view: View){
        text = "${textView.text.toString()}3"
        //TextViewBar.setText(text)
        textView.text = text
    }
    fun PercentBtnClicked(view: View){
        text = "${textView.text.toString()}%"
        //TextViewBar.setText(text)
        textView.text = text
    }
    fun ZeroBtnClicked(view: View){
        text = "${textView.text}0"
        //TextViewBar.setText(text)
        textView.text = text
    }
    fun DecimalBtnClicked(view: View){
        text = "${textView.text.toString()}."
        //TextViewBar.setText(text)
        textView.text = text
    }
    fun EraseOneBtnClicked(view: View){
        text = "${textView.text.toString()}="
        //TextViewBar.setText(text)
        textView.text = text
    }
    fun EqualBtnClicked(view: View){
        text = "${textView.text.toString()}="
        //TextViewBar.setText(text)
        textView.text = text
    }*/

}
