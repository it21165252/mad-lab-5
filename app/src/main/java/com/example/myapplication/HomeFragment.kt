package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val btnDisplay = view.findViewById<Button>(R.id.btnDisplay)
        val edtName = view.findViewById<EditText>(R.id.edtName)
        btnDisplay.setOnClickListener {
            Toast.makeText(context,"Hello, ${edtName.text.toString()}",Toast.LENGTH_LONG).show()
        }
        return view
    }

}