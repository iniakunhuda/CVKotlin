package com.miftahulhuda.todolistapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.miftahulhuda.todolistapp.databinding.FragmentMedsosBinding


class MedsosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        (activity as AppCompatActivity).supportActionBar?.title = "Link Media Sosial"

        val binding: FragmentMedsosBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_medsos,
            container,
            false
        )

        binding.cardFb.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"))
            startActivity(browserIntent)
        }

        binding.cardTwitter.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.twitter.com"))
            startActivity(browserIntent)
        }

        binding.cardIg.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/miftahulhudaf"))
            startActivity(browserIntent)
        }

        return binding.root
    }
}