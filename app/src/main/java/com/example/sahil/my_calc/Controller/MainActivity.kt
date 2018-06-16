package com.example.sahil.my_calc.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.sahil.my_calc.Utilities.Extra_text
import com.example.sahil.my_calc.R
import com.example.sahil.my_calc.R.id.TextViewBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var text : String? = ""
    private var len: Int = 0
    private var check : Int = 2  // var used to store the return value of operator_check() function.
    private val ZeroTonine = arrayListOf<Char>('0','1','2','3','4','5','6','7','8','9','.')
    val calculation = com.example.sahil.my_calc.Utilities.calculation()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState != null){
            text = savedInstanceState.getString(Extra_text)
            TextViewBar.text = text
        }else{
            TextViewBar.text = null
        }
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        //outState?.putParcelable(Extra_text,text as Parcelable?)
        outState?.putString(Extra_text,text)
    }

    fun ClearAllBtnClicked(view: View){
        if(TextViewBar.text.isEmpty()){
            Toast.makeText(this, "Already Blank", Toast.LENGTH_SHORT).show()
        }else {
            text = ""
            TextViewBar.text =  text
        }
    }
    fun DivideBtnClicked(view: View){

        ForOperatorOperation("/")
    }
    fun MultiplyBtnClicked(view: View){
        ForOperatorOperation("*")

    }
    fun SevenBtnClicked(view: View){
        ForNumberOperation("7")
    }
    fun EightBtnClicked(view: View){
        ForNumberOperation("8")
    }
    fun NineBtnClicked(view: View){
        ForNumberOperation("9")
    }
    fun MinusBtnClicked(view: View){

        ForOperatorOperation("-")
    }
    fun FourBtnClicked(view: View){
        ForNumberOperation("4")
    }
    fun FiveBtnClicked(view: View){
        ForNumberOperation("5")
    }
    fun SixBtnClicked(view: View){
        ForNumberOperation("6")
    }
    fun plusBtnClicked(view: View){

        ForOperatorOperation("+")
    }
    fun OneBtnClicked(view: View){

        ForNumberOperation("1")
    }
    fun TwoBtnClicked(view: View){
        ForNumberOperation("2")
    }
    fun ThreeBtnClicked(view: View){
        ForNumberOperation("3")
    }
    fun PowerBtnClicked(view: View){

        ForOperatorOperation("^")
    }
    fun ZeroBtnClicked(view: View){
        if (infinity_check()){
            text = "0"
        }else if (TextViewBar.text.toString() == "0"){
            text = TextViewBar.text.toString()
            Toast.makeText(this, "Zero is already present", Toast.LENGTH_SHORT).show()
        } else {
            text = "${TextViewBar.text.toString()}0"
        }
        TextViewBar.text = text
    }
    fun DecimalBtnClicked(view: View){
        text = TextViewBar.text.toString()

        if (infinity_check()) {
            text = "0."
            TextViewBar.text = text
        } else if ( dot_check()){
            Toast.makeText(this, "Decimal Overloaded", Toast.LENGTH_SHORT).show()
        } else if (text.isNullOrEmpty() || text?.lastOrNull() !in ZeroTonine) {
            text = "${TextViewBar.text.toString()}0."
            TextViewBar.text = text
        } else{
            text = "${TextViewBar.text.toString()}."
            TextViewBar.text = text
        }
    }
    fun EraseOneBtnClicked(view: View) {
        len = TextViewBar.text.toString().length

        if (infinity_check()){
            text = ""
            TextViewBar.text = text
        } else if (len > 0){
            text = TextViewBar.text.toString().substring(0,len-1)
            TextViewBar.text = text
        }else {
            Toast.makeText(this, "Already Blank", Toast.LENGTH_SHORT).show()
        }
    }
    fun EqualBtnClicked(view: View){
        if(TextViewBar.text.isEmpty()){
            Toast.makeText(this, "Enter Something", Toast.LENGTH_SHORT).show()
        } else if (infinity_check()){
            text = TextViewBar.text.toString() // Infinity remains Infinity on equal button
            TextViewBar.text =  text
        } else {
            try {

                text = TextViewBar.text.toString()
                text = calculation.perform(text)
                TextViewBar.text = text
            } catch (e : Exception) {
                Toast.makeText(this, "Syntax Error", Toast.LENGTH_SHORT).show()
                while (!calculation.List.isEmpty()){
                    calculation.List.removeAt(0)
                }
            }
        }
    }
    private fun operator_check() : Int {
        len = TextViewBar.text.toString().length
        if (len > 0){
            if (TextViewBar.text.toString()[len-1] in ZeroTonine) return 2 else return 1
        } else return 0
       /* this function returns 0 if string is empty, for replacement it returns 1 & to
         add the operator it returns 2.*/
    }
    private fun infinity_check() : Boolean{
       return (TextViewBar.text.toString() == "Infinity" ||  TextViewBar.text.toString() == "NaN")
    }
    private fun dot_check() : Boolean {
        return (text?.lastOrNull() == '.')
    }
    // Feature Added : Automatic Zero between decimal & operations
    private fun ForNumberOperation(number : String){
        if (infinity_check() || TextViewBar.text.toString() == "0"){
            text = number
        } else {
            text = TextViewBar.text.toString() + number
        }
        TextViewBar.text = text
    }
    private fun ForOperatorOperation(sign : String){
        if (dot_check()){
            text = "${TextViewBar.text.toString()}0"
            TextViewBar.text = text
        }

        check = operator_check()

        if (infinity_check()){
            text = ""
        } else if(check == 2){
            text = TextViewBar.text.toString() + sign
        }  else if (check == 1) {
            text = TextViewBar.text.toString().dropLast(1) + sign
        } else {
            Toast.makeText(this, "First enter any number", Toast.LENGTH_SHORT).show()
            text = TextViewBar.text.toString()
        }

        TextViewBar.text = text
    }
        //length of the code is reduced to half by using above two functions.
}

