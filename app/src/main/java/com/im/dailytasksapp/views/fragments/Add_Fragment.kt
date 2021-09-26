package com.im.dailytasksapp.views.fragments

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.im.dailytasksapp.R
import kotlinx.android.synthetic.main.fragment_add_.*
import kotlinx.android.synthetic.main.fragment_home_.view.*


class Add_Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add_, container, false)

        view.add_npte.setOnClickListener {
            insertNote()
        }


        return view
    }

    private fun insertNote() {

        val titleValue = title_input.text.toString()
        val descriptionValue = description_input.text.toString()


        if (checkinvalid(titleValue, descriptionValue)){
            Toast.makeText(context, "$titleValue, $descriptionValue", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(context, "empty", Toast.LENGTH_LONG).show()
        }
    }

    private fun checkinvalid(titleValue: String, descriptionValue: String): Boolean {
        return !(TextUtils.isEmpty(titleValue) && TextUtils.isEmpty(descriptionValue))
    }


}