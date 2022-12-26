package com.nakibul.navigationcomponentdemo.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.nakibul.navigationcomponentdemo.R
import kotlinx.android.synthetic.main.fragment_about.*


class AboutFragment : Fragment() {

    private val getArgs: AboutFragmentArgs? by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val getTrainee = getArgs!!.trainee
        Log.d("Test", "onViewCreated: $getTrainee")
        if(getTrainee != null) {
            textView_employee.text =
                "${getTrainee.id}\n${getTrainee.fistName}\n${getTrainee.lastName}"
        }
        button_home_about.setOnClickListener {
            val action = AboutFragmentDirections.actionAboutFragmentToHomeFragment()
            findNavController().navigate(action)
        }

        button_profile_about.setOnClickListener {
            val action = AboutFragmentDirections.actionAboutFragmentToProfileFragment()
            findNavController().navigate(action)
        }
    }


}