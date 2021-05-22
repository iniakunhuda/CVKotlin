package com.miftahulhuda.todolistapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.miftahulhuda.todolistapp.databinding.FragmentDetailTodoBinding

class DetailTodoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        (activity as AppCompatActivity).supportActionBar?.title = "TodoListApp"

        val binding: FragmentDetailTodoBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail_todo, container, false)
        arguments?.let {
            val args = DetailTodoFragmentArgs.fromBundle(it)
            binding.txtJudul.text = args.judul
            binding.txtKeterangan.text = args.ket
        }

        return binding.root
    }
}