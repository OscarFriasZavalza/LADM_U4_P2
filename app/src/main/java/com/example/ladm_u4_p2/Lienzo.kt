package com.example.ladm_u4_p2

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo (p:MainActivity): View(p) {

    var bruja= BitmapFactory.decodeResource(resources,R.drawable.bruja)
    var luna= BitmapFactory.decodeResource(resources,R.drawable.luna)
    var nube= BitmapFactory.decodeResource(resources,R.drawable.nube2)
    var estrella= BitmapFactory.decodeResource(resources,R.drawable.estrella)

    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        var  p = Paint()

        //fondo noche
        c.drawColor(Color.BLUE)

        //pintar imagenes
        c.drawBitmap(bruja,150f,750f,p)
        c.drawBitmap(luna,450f,100f,p)
        c.drawBitmap(nube,100f,30f,p)
        c.drawBitmap(nube,820f,320f,p)
        c.drawBitmap(estrella,120f,290f,p)
        c.drawBitmap(estrella,800f,60f,p)

    }
}