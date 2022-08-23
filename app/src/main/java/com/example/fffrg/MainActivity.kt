package com.example.fffrg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val blankFragment= BlankFragment()

        findViewById<Button>(R.id.ad_fragment).
        setOnClickListener {

            val manager=supportFragmentManager
            val transaction=manager.beginTransaction()
            transaction.add(R.id.my_container,blankFragment)
            transaction.commit()
        }
        findViewById<Button>(R.id.remove_fragment).
        setOnClickListener {

            val manager=supportFragmentManager
            val transaction=manager.beginTransaction()
            transaction.remove(blankFragment)
            transaction.commit()
        }

        val blankFragment2= BlankFragment2()

        findViewById<Button>(R.id.replace_fragment).
        setOnClickListener {
            val manager=supportFragmentManager
            val transaction=manager.beginTransaction()
            transaction.add(R.id.my_container,blankFragment2)
            transaction.addToBackStack(blankFragment2.toString())
            transaction.commit()
        }

        findViewById<Button>(R.id.hide_fragment).
        setOnClickListener {

            val manager=supportFragmentManager
            val transaction=manager.beginTransaction()
            transaction.hide(blankFragment)
            transaction.commit()
        }

        findViewById<Button>(R.id.shove_fragment).
        setOnClickListener {
            val manager=supportFragmentManager
            val transaction=manager.beginTransaction()
            transaction.show(blankFragment)
            transaction.commit()
        }





    }
}