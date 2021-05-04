package com.example.newsexpress.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.newsexpress.R
/**
 * A simple [Fragment] subclass.
 * Use the [NavigationMenuFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NavigationMenuFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_navigation_menu, container, false)
    }
}