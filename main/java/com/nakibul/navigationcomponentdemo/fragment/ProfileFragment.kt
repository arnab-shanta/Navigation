package com.nakibul.navigationcomponentdemo.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.nakibul.navigationcomponentdemo.R
import com.nakibul.navigationcomponentdemo.Trianee
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_profile.*


class ProfileFragment : Fragment() {

    val args: ProfileFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        val number_text = args.number
        textView_number.text = number_text.toString()

        button_home_profile.setOnClickListener {
            val action = ProfileFragmentDirections.actionProfileFragmentToHomeFragment()
            findNavController().navigate(action)
        }
        button_about_profile.setOnClickListener {
            val tarinee = Trianee("FirstName","Lastname",11111)
            val action = ProfileFragmentDirections.actionProfileFragmentToAboutFragment(tarinee)
            findNavController().navigate(action)
        }
    }


}