package com.example.bhagatmotorcycle

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*


class HomeScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_home_screen, container, false)

    }
    fun openGoogleFormLink(view: View){
        val formURL = "https://forms.gle/Y3H36AeJL1aiAtcKA"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(formURL))
        startActivity(intent)

    }
    fun openFacebookLink(view: View) {
        // Open the Facebook link in a browser
        val facebookUrl = "https://www.facebook.com/dhirajbh"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl))
        startActivity(intent)
    }

    fun openWhatsAppLink(view: View) {
        // Open the WhatsApp link in a browser
        val whatsappUrl = "https://wa.me/8470048251"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(whatsappUrl))
        startActivity(intent)
    }

    }

