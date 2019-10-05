package com.example.profil

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

open class FragmentOne : Fragment(){
    val TAG = "FragmentOne"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG,"onAttach")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?)
            : View? {
        Log.d(TAG,  "onCreateView")
        return inflater!!.inflate(R.layout.fragment_one, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d(TAG,  "onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG,  "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,  "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,  "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,  "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG,  "onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d(TAG,  "onDetach")
        super.onDetach()
    }

}