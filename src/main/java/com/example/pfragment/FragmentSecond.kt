package com.example.pfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FragmentSecond : Fragment() {
    private lateinit var  mButtonBack:Button
    private lateinit var mActivity:MainActivity

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view =inflater.inflate(R.layout.fragment_second, container, false)
       initView(view)
        initClicks()
        return view
    }


    private fun initView(view: View){
        mButtonBack = view.findViewById(R.id.buttonBack)
        mActivity = activity as MainActivity
    }

    private fun initClicks(){
        mButtonBack.setOnClickListener {
            mActivity.setFragment(mActivity.mFirstFragment) }
    }
}