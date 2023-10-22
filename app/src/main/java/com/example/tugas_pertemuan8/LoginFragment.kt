package com.example.tugas_pertemuan8

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.tugas_pertemuan8.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private val Username = "maia"
    private val Password = "492561"
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            val enteredUsername = binding.email.text.toString()
            val enteredPassword = binding.password.text.toString()

            if (enteredUsername == Username && enteredPassword == Password) {
                // Authentication successful
                val intentToHome = Intent(requireContext(), welcome::class.java)
                startActivity(intentToHome)
            } else {
                Toast.makeText(requireContext(), "Username atau password salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}