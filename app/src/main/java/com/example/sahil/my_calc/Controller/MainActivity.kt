package com.example.sahil.my_calc.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.sahil.my_calc.Utilities.Extra_text
import com.example.sahil.my_calc.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var text : String? = ""
    private var len: Int = 0
    private var check : Int = 2
    private val ZeroTonine = arrayListOf<Char>('0','1','2','3','4','5','6','7','8','9','.')

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
        TextViewBar.text = ""
    }
    fun DivideBtnClicked(view: View){

            check = operator_check()
            if(check == 2){
                text = "${TextViewBar.text.toString()}/"
            }  else if (check == 1) {
                text = "${TextViewBar.text.toString().dropLast(1)}/"
            } else text = TextViewBar.text.toString()

            TextViewBar.text = text
    }
    fun MultiplyBtnClicked(view: View){
        check = operator_check()
        if(check == 2){
            text = "${TextViewBar.text.toString()}*"
        }  else if (check == 1) {
            text = "${TextViewBar.text.toString().dropLast(1)}*"
        } else text = TextViewBar.text.toString()

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
        check = operator_check()
        if(check == 2){
            text = "${TextViewBar.text.toString()}-"
        }  else if (check == 1) {
            text = "${TextViewBar.text.toString().dropLast(1)}-"
        } else text = TextViewBar.text.toString()

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
        check = operator_check()
        if(check == 2){
            text = "${TextViewBar.text.toString()}+"
        }  else if (check == 1) {
            text = "${TextViewBar.text.toString().dropLast(1)}+"
        } else text = TextViewBar.text.toString()

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
        check = operator_check()
        if(check == 2){
            text = "${TextViewBar.text.toString()}%"
        }  else if (check == 1) {
            text = "${TextViewBar.text.toString().dropLast(1)}%"
        } else text = TextViewBar.text.toString()

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
        len = TextViewBar.text.toString().length
        if (len > 0){
            text = TextViewBar.text.toString().substring(0,len-1)
            TextViewBar.text = text
        }
    }
    fun EqualBtnClicked(view: View){

    }
    private fun operator_check() : Int {
        len = TextViewBar.text.toString().length
        if (len > 0){
            if (TextViewBar.text.toString()[len-1] in ZeroTonine) return 2 else return 1
        } else return 0
       /* this function returns 0 if string is empty, for replacement it returns 1 &
         add the operator it returns 2.*/
    }
}

