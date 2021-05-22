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
        (activity as AppCompatActivity).supportActionBar?.title = "TodoListApp"

        val binding: FragmentIntroBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_intro, container, false)
        binding.fabAdd.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_introFragment_to_addTodoFragment)
        )

        val items = listOf("Beli Minyak Goreng 1 Liter", "Beli Gula 1 kg", "Beli Jajan")
        val desc = listOf("Beli Minyak Goreng 1 Liter Deskripsi", "Beli Gula 1 kg Deskripsi", "Beli Jajan Deskripsi")

        val adapter = activity?.let {
            ArrayAdapter<String>(
                it,
                R.layout.activity_listview,
                R.id.txtItem,
                items
            )
        }

        binding.listView.isClickable = true
        binding.listView.adapter = adapter
        binding.listView.setOnItemClickListener { parent, view, position, id ->
            val element = position // The item that was clicked
            val judul = items[position]
            val ket = desc[position]
            view.findNavController().navigate(IntroFragmentDirections.actionIntroFragmentToDetailTodoFragment(judul, ket))
        }

        return binding.root
    }

}
