package com.example.sahil.my_calc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var text : String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        try {

            TextViewBar.text = ""
            ClearAllButton.setOnClickListener{
                TextViewBar.text = ""
            }
            DivideButton.setOnClickListener {
                text = "${TextViewBar.text.toString()}/"
                TextViewBar.text = text
            }
            MultiplyButton.setOnClickListener {
                text = "${TextViewBar.text.toString()}*"
                TextViewBar.text = text
            }
            SevenButton.setOnClickListener {
                text = "${TextViewBar.text.toString()}7"
                TextViewBar.text = text
            }
            EightButton.setOnClickListener {
                text = "${TextViewBar.text.toString()}8"
                TextViewBar.text = text
            }
            NineButton.setOnClickListener {
                text = "${TextViewBar.text.toString()}9"
                TextViewBar.text = text
            }
            MinusButton.setOnClickListener {
                text = "${TextViewBar.text.toString()}-"
                TextViewBar.text = text
            }
            FourButton.setOnClickListener {
                text = "${TextViewBar.text.toString()}4"
                TextViewBar.text = text
            }
            FiveButton.setOnClickListener {
                text = "${TextViewBar.text.toString()}5"
                TextViewBar.text = text
            }
            SixButton.setOnClickListener {
                text = "${TextViewBar.text.toString()}6"
                TextViewBar.text = text
            }
            plusButton.setOnClickListener {
                text = "${TextViewBar.text.toString()}+"
                TextViewBar.text = text
            }
            OneButton.setOnClickListener {
                text = "${TextViewBar.text.toString()}1"
                TextViewBar.text = text
            }
            TwoButton.setOnClickListener {
                text = "${TextViewBar.text.toString()}2"
                TextViewBar.text = text
            }
            ThreeButton.setOnClickListener {
                text = "${TextViewBar.text.toString()}3"
                TextViewBar.text = text
            }
            EqualButton.setOnClickListener {



            }
            PercentButton.setOnClickListener {
                text = "${TextViewBar.text.toString()}%"
                TextViewBar.text = text
            }
            ZeroButton.setOnClickListener {
                text = "${TextViewBar.text.toString()}0"
                TextViewBar.text = text
            }
            DecimalButton.setOnClickListener {
                text = "${TextViewBar.text.toString()}."
                TextViewBar.text = text
            }
            EraseOneButton.setOnClickListener {

            }
        }catch(e : Exception){
            Log.e("my_app","exception "+e.message)
        }
    }
}
