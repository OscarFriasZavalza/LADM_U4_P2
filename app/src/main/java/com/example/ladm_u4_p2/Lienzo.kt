package com.example.ladm_u4_p2

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.view.View

class Lienzo (p:MainActivity): View(p) {

    var dia =true
    var posX=0f
    var posY=0f
    var bruja:Bitmap=BitmapFactory.decodeResource(resources,R.drawable.bruja)
    //img dia
    var nube:Bitmap=BitmapFactory.decodeResource(resources,R.drawable.nube)
    var sol:Bitmap=BitmapFactory.decodeResource(resources,R.drawable.sol)
    //img noche
    var estrellas:Bitmap=BitmapFactory.decodeResource(resources,R.drawable.estrellas)
    var luna : Bitmap=BitmapFactory.decodeResource(resources,R.drawable.luna)
    var nube2:Bitmap=BitmapFactory.decodeResource(resources,R.drawable.nube2)



    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val p=Paint()

        if (dia==true){
            canvas.drawBitmap(sol,posX,posY,p)
            canvas.drawBitmap(nube,posX,posY+300,p)
            canvas.drawBitmap(nube,posX+500,posY+300,p)
            canvas.drawBitmap(bruja,200f,600f,p)
        }else{
             canvas.drawBitmap(estrellas,posX,posY+300f,p)
             canvas.drawBitmap(luna,posX,posY,p)

             canvas.drawBitmap(nube2,posX+500f,posY+300f,p)
            canvas.drawBitmap(bruja,200f,600f,p)
        }
    }

}