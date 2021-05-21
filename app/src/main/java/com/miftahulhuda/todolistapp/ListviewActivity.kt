package com.miftahulhuda.todolistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.miftahulhuda.todolistapp.databinding.ActivityListviewBinding

class ListviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_listview)

        val binding: ActivityListviewBinding = DataBindingUtil.setContentView(this, R.layout.activity_listview)

//        binding.itemCard.setOnClickListener(
//            Navigation.createNavigateOnClickListener(R.id.action_introFragment_to_detailTodoFragment)
//        )
    }
}