package com.im.dailytasksapp.views.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.im.dailytasksapp.R
import kotlinx.android.synthetic.main.fragment_home_.view.*

class Home_Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home_, container, false)

        view.add_npte.setOnClickListener {
            findNavController().navigate(R.id.action_home_Fragment_to_add_Fragment)
        }


        return view
    }

}