package com.example.ladm_u4_p2

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(),SensorEventListener {
    lateinit var sensorManager:SensorManager
    lateinit var lienzo:Lienzo



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sensorManager= getSystemService(Context.SENSOR_SERVICE)as SensorManager

        sensorManager.registerListener(this,sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY),SensorManager.SENSOR_DELAY_NORMAL)
        sensorManager.registerListener(this,sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),SensorManager.SENSOR_DELAY_NORMAL)

        lienzo=Lienzo(this)
        setContentView(lienzo)

    }

    override fun onSensorChanged(event: SensorEvent) {


        if(event.sensor.type==Sensor.TYPE_ACCELEROMETER){
            lienzo.posX=+event.values[0]*20
            lienzo.posY=+event.values[1]*20
        }
        if(event.sensor.type==Sensor.TYPE_PROXIMITY){
            lienzo.dia=(event.values[0]!=0f)
        }
        lienzo.invalidate()
    }

    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {

    }
}