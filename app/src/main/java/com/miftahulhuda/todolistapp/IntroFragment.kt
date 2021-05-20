package com.miftahulhuda.todolistapp

import android.app.AppComponentFactory
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.miftahulhuda.todolistapp.databinding.FragmentIntroBinding

class IntroFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_intro, container, false)

        (activity as AppCompatActivity).supportActionBar?.title = "TodoListApp"

        val binding: FragmentIntroBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_intro, container, false)
        binding.fabAdd.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_introFragment_to_addTodoFragment)
        )

        binding.itemCard.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_introFragment_to_detailTodoFragment)
        )

        return binding.root
    }
}