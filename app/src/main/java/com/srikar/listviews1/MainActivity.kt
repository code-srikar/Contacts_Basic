package com.srikar.listviews1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.srikar.listviews1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var contacts: Array<String> = arrayOf("Srikar","Police","Ambulance","Fire","Dad","Mom","Bro","Sis","Srikar","Police","Ambulance","Fire","Dad","Mom","Bro","Sis")
        var contAdapter: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,contacts)
        binding.contacts.adapter = contAdapter
        var searchAdapter: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,contacts)
        binding.search.setAdapter(searchAdapter)
        binding.search.threshold = 2

        binding.contacts.setOnItemClickListener { parent, view, position, id ->
            if(contacts[position].toString().equals("Srikar")){
                Toast.makeText(this,"Your Number",Toast.LENGTH_SHORT).show()
            }
            if(contacts[position].toString().equals("Police")){
                Toast.makeText(this,"100",Toast.LENGTH_SHORT).show()
            }
            if(contacts[position].toString().equals("Ambulance")){
                Toast.makeText(this,"108",Toast.LENGTH_SHORT).show()
            }
            if(contacts[position].toString().equals("Fire")){
                Toast.makeText(this,"101",Toast.LENGTH_SHORT).show()
            }
            if(contacts[position].toString().equals("Dad")){
                Toast.makeText(this,"Father Number",Toast.LENGTH_SHORT).show()
            }
            if(contacts[position].toString().equals("Mom")){
                Toast.makeText(this,"Mother Number",Toast.LENGTH_SHORT).show()
            }
            if(contacts[position].toString().equals("Bro")){
                Toast.makeText(this,"Brother Number",Toast.LENGTH_SHORT).show()
            }
            if(contacts[position].toString().equals("Sis")){
                Toast.makeText(this,"Sister Number",Toast.LENGTH_SHORT).show()
            }
        }

        binding.exit.setOnClickListener(){
            Toast.makeText(this,"Exited",Toast.LENGTH_SHORT).show()
            finish()
        }

    }
}