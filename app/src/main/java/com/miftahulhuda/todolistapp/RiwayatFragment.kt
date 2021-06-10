package com.miftahulhuda.todolistapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.miftahulhuda.todolistapp.databinding.FragmentRiwayatBinding

class RiwayatFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        (activity as AppCompatActivity).supportActionBar?.title = "Riwayat Saya"

        val binding: FragmentRiwayatBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_riwayat, container, false)

        return binding.root
    }
}