package com.example.android_indicator_custom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.core.widget.NestedScrollView


class OneFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       val view = inflater.inflate(R.layout.fragment_one, container, false)

        val nestedScrollView = view.findViewById<NestedScrollView>(R.id.scrollView)
        val textView = view.findViewById<TextView>(R.id.textViewTestScrollToTop)
        val motionLayout = view.findViewById<MotionLayout>(R.id.motionLayout)
        val floatingView = view.findViewById<CardView>(R.id.floatingView)
        val constraintStartSet = motionLayout.getConstraintSet(R.id.start)

        textView.setOnClickListener {
            nestedScrollView.smoothScrollTo(0,0)
            motionLayout.setConstraintSet(constraintStartSet)
        }

        return view
    }
}