package com.felipejose.timepickerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TimePicker
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tempo = findViewById<TimePicker>(R.id.tempo) as TimePicker

        tempo.setOnTimeChangedListener({ view, hourOfDay, minute ->
            Toast.makeText(this@MainActivity,"Hora:-$hourOfDay:$minute",Toast.LENGTH_SHORT).show()
        })
    }
}
