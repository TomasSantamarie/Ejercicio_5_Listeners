package com.example.ejercicio_5_listeners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.botonSumar).isEnabled = false;

        /*if (findViewById<TextView>(R.id.string1).text.toString().isEmpty() && findViewById<TextView>(R.id.string2).text.toString().isEmpty())
            findViewById<TextView>(R.id.botonSumar).isEnabled = false;

         */


        findViewById<TextView>(R.id.string1).addTextChangedListener( object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                findViewById<TextView>(R.id.botonSumar).isEnabled =
                    !(findViewById<TextView>(R.id.string1).text.toString().isEmpty() || findViewById<TextView>(R.id.string2).text.toString().isEmpty());} })


        findViewById<TextView>(R.id.string2).addTextChangedListener( object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                findViewById<TextView>(R.id.botonSumar).isEnabled =
                    !(findViewById<TextView>(R.id.string1).text.toString().isEmpty() || findViewById<TextView>(R.id.string2).text.toString().isEmpty());} })
        //findViewById<TextView>(R.id.botonSumar).isEnabled = true;


        findViewById<Button>(R.id.botonSumar).setOnClickListener { sumar() }



        findViewById<EditText>(R.id.string1).setOnClickListener {
            (findViewById<TextView>(R.id.solucion)).setText("@+id/string1")

        }
        findViewById<EditText>(R.id.string2).setOnClickListener {
            (findViewById<TextView>(R.id.solucion)).setText("@+id/string2")

        }




    }


    private fun sumar() {

            var num = findViewById<TextView>(R.id.string1).text.toString()
            var num2 = findViewById<TextView>(R.id.string2).text.toString()
            var result = num + num2
            findViewById<TextView>(R.id.string2).text = result.toString()
            findViewById<TextView>(R.id.string1).text = ""


    }


}

