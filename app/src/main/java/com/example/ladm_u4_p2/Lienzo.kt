package com.example.ladm_u4_p2

import android.graphics.Canvas
import android.graphics.Paint
import android.view.View

class Lienzo (p:MainActivity): View(p) {
    var puntero=p
    var dia =true
    var posX=600f
    var posY=1700f

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val p=Paint()

        if (dia==true){
            //
        }else{
             
        }
    }

}