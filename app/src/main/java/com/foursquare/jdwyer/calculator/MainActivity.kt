package com.foursquare.jdwyer.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // allows us to not have to init to null.
    private lateinit var result: EditText
    private lateinit var newNumber: EditText
    // by lazy, defines a func that is called the first time the var is accessed. From there,
    // the val is cached so it's only called once
    private val displayOperation by lazy(LazyThreadSafetyMode.NONE) { findViewById<TextView>(R.id.operation) }
    // benefit of using by lazy is over lateinit is that we can declare values as val instead of var

    //    variables to hold operands
    private var operand1: Double? = null
    private var operand2: Double = 0.0
    private var pendingOperation = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result = findViewById(R.id.result)
        newNumber = findViewById(R.id.newNumber)

        var button0: Button = findViewById(R.id.button0)
        var button1: Button = findViewById(R.id.button1)
        var button2: Button = findViewById(R.id.button2)
        var button3: Button = findViewById(R.id.button3)
        var button4: Button = findViewById(R.id.button4)
        var button5: Button = findViewById(R.id.button5)
        var button6: Button = findViewById(R.id.button6)
        var button7: Button = findViewById(R.id.button7)
        var button8: Button = findViewById(R.id.button8)
        var button9: Button = findViewById(R.id.button9)
        var buttonDot: Button = findViewById(R.id.buttonDot)

//        Operand Buttons
        var buttonAdd: Button = findViewById(R.id.buttonAdd)
        var buttonDiv: Button = findViewById(R.id.buttonDiv)
        var buttonMult: Button = findViewById(R.id.buttonMult)
        var buttonSub: Button = findViewById(R.id.buttonSub)
        var buttonEqu: Button = findViewById(R.id.buttonEqu)

    }
}
