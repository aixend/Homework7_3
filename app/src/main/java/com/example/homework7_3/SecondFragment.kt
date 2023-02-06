package com.example.homework7_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework7_3.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
   private lateinit var binding: FragmentSecondBinding
   private lateinit var navArgs: SecondFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            navArgs = SecondFragmentArgs.fromBundle(it)
        }
        binding.tvName.text = navArgs.rm.name
        binding.tvLife.text = navArgs.rm.life
        binding.imgCharacter.setImageResource(navArgs.rm.picture)


    }




}