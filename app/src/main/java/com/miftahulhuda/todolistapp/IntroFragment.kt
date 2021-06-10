package com.miftahulhuda.todolistapp

import android.app.AppComponentFactory
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.miftahulhuda.todolistapp.databinding.FragmentIntroBinding

class IntroFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.title = "CV Saya"

        val binding: FragmentIntroBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_intro, container, false)

        binding.btnMedsos.setOnClickListener { view ->
            view.findNavController().navigate(IntroFragmentDirections.actionIntroFragmentToMedsosFragment())
        }

        binding.btnRiwayat.setOnClickListener { view ->
            view.findNavController().navigate(IntroFragmentDirections.actionIntroFragmentToRiwayatFragment())
        }


        return binding.root
    }

}
