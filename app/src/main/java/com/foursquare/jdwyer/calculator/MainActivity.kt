package com.foursquare.jdwyer.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // allows us to not have to init to null.
    private lateinit var result: EditText
    private lateinit var newNumber: EditText
    // by lazy, defines a func that is called the first time the var is accessed. From there,
    // the val is cached so it's only called once
    private val displayOperation by lazy(LazyThreadSafetyMode.NONE) { findViewById<TextView>(R.id.operation) }
//    benefit of using by lazy is over lateinit is that we can declare values as val instead of var

//    variables to hold operands
    private var operand1: Double? = null
    private var operand2: Double = 0.0
    private var pendingOperation = ""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
