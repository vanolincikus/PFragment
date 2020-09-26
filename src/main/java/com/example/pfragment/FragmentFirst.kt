package com.example.pfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class FragmentFirst : Fragment() {

    private lateinit var mButtonNext: Button
    private lateinit var mActivity: MainActivity

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        initView(view)

        initClicks()


        return view
    }

    private fun initView(view: View) {
        mButtonNext = view.findViewById(R.id.buttonNext)
        mActivity = activity as MainActivity
    }

    private fun initClicks() {
        mButtonNext.setOnClickListener {
            mActivity.setFragment(mActivity.mSecondFragment)
        }
    }
}