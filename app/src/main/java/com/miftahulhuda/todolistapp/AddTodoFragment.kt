package com.miftahulhuda.todolistapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.miftahulhuda.todolistapp.databinding.FragmentAddTodoBinding
import com.miftahulhuda.todolistapp.databinding.FragmentDetailTodoBinding

class AddTodoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        (activity as AppCompatActivity).supportActionBar?.title = "TodoListApp"

        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_add_todo, container, false)
        val binding: FragmentAddTodoBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_todo, container, false)
        return binding.root
    }
}