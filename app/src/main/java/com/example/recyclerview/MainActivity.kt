package com.example.recyclerview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding
import jp.wasabeef.recyclerview.animators.SlideInUpAnimator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val contacts = createContacts()
        binding.rvContacts.adapter = ContactAdapter(this, contacts)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.itemAnimator = SlideInUpAnimator()

    }

    private fun createContacts(): ArrayList<Contact> {
        val contacts: ArrayList<Contact> = ArrayList<Contact>()

        for (i in 1..150) {
            contacts.add(Contact("Person #$i", i))
        }

        return contacts
    }
}