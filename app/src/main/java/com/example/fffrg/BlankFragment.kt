package com.example.fffrg

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.example.fffrg.R

class BlankFragment :Fragment() {
    lateinit var root:View


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_blank, container, false)

        val tv=root.findViewById<TextView>(R.id.myfragment)


        tv.setOnClickListener {
            Toast.makeText(context, "Salom man fragmentdagi tv man ", Toast.LENGTH_SHORT).show()
        }
        return root


    }
}
