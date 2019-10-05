package com.example.profil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var isFragmentLoaded = true

    val manager  = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Pindah_kiri = findViewById<Button>(R.id.button_prev)
        val Pindah_kanan = findViewById<Button>(R.id.button_next)

        showFragmentOne()

        Pindah_kanan.setOnClickListener {
            if (isFragmentLoaded) {
                showFragmentThree()
                Pindah_kanan.setEnabled(false)
            } else {
                showFragmentOne()
                Pindah_kiri.setEnabled(true)
            }
        }
        Pindah_kiri.setOnClickListener {
            if (isFragmentLoaded) {
                showFragmentTwo()
                Pindah_kiri.setEnabled(false)
            } else {
                showFragmentOne()
                Pindah_kanan.setEnabled(true)
            }
        }
    }




    fun showFragmentOne(){
        val transaction = manager.beginTransaction()
        val fragment = FragmentOne()
        transaction.replace(R.id.fragment_holder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
        isFragmentLoaded = true
    }

    fun showFragmentTwo(){
        val transaction = manager.beginTransaction()
        val fragment = FragmentTwo()
        transaction.replace(R.id.fragment_holder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
        isFragmentLoaded = false
    }

    fun showFragmentThree(){
        val transaction = manager.beginTransaction()
        val fragment = FragmentThree()
        transaction.replace(R.id.fragment_holder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
        isFragmentLoaded = false
    }
}


