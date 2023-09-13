package com.hfad.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController

class MessageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_message, container, false)
        val nextButton: Button = view.findViewById(R.id.next)
        val messageView: EditText =  view.findViewById(R.id.message)



        nextButton.setOnClickListener {
            val message =  messageView.text.toString()
            val action = MessageFragmentDirections.actionMessageFragmentToEncryptFragment(message)
            view.findNavController().navigate(action)
        }
        // Inflate the layout for this fragment
        return view
    }
}