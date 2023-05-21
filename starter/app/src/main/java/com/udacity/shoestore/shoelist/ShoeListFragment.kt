package com.udacity.shoestore.shoelist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeListBinding

class ShoeListFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentShoeListBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_shoe_list, container, false
        )
        binding.lifecycleOwner = this
        val viewModel = ViewModelProvider(this)[ShoeListViewModel::class.java]
        binding.listViewShoes.adapter = ShoeListViewAdapter(this.context, viewModel.shoes.value!!)

        return binding.root
    }
}