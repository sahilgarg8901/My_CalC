package com.example.sahil.my_calc.Utilities

import java.util.ArrayList
import kotlin.math.pow

public class calculation {
    var List : MutableList<MyData?> = mutableListOf<MyData?>()
    var signs  = ArrayList<Char?>()
    //var num  = "10.0"
    var len : Int? = 0
    var result : Double = 0.0
     fun perform (text : String?) : String? {
         var i : Int = 0
         var j : Int = 0
        signs = arrayListOf('^','/','*','-','+')
        len = text?.length

         while (i < len!!.toInt()){
             if (text!![i] in signs){
                     List.add(MyData(text!!.substring(j, i).toDouble(), text[i]))
                 j = i + 1
             }
             i += 1
         }

         List.add(MyData(text!!.substring(j, i).toDouble(), ' '))
         for (a in signs){
            i = 0
             while (i <= List.lastIndex) {
                 if (a == List[i]?.sign){
                     when(a){
                         '^' -> List[i]?.number = List[i]!!.number.pow(List[i+1]!!.number)
                         '/' -> List[i]?.number = List[i]!!.number.div(List[i+1]!!.number)
                         '*' -> List[i]?.number = List[i]!!.number.times(List[i+1]!!.number)
                         '+' -> List[i]?.number = List[i]!!.number.plus(List[i+1]!!.number)
                         '-' -> List[i]?.number = List[i]!!.number.minus(List[i+1]!!.number)
                     }
                     List[i]?.sign = List[i+1]?.sign
                     List.removeAt(i+1)
                 } else i += 1
             }
         }
        result = List[0]!!.number
         List.removeAt(0)
       return  if(result.compareTo(result.toInt()) == 0)  result.toInt().toString() else result.toString()

    }
}