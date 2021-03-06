package com.vipuljha.notesapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vipuljha.notesapp.R
import com.vipuljha.notesapp.databinding.FragmentCreateNotesBinding

class CreateNotesFragment : Fragment() {
    lateinit var binding: FragmentCreateNotesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCreateNotesBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}