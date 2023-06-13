package com.udacity.shoestore.shoedetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeDetailBinding
import com.udacity.shoestore.models.Shoe
import com.udacity.shoestore.shoelist.ShoeListFragmentDirections
import com.udacity.shoestore.shoelist.ShoeListViewModel
import timber.log.Timber
import java.util.Timer

class ShoeDetailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: FragmentShoeDetailBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_shoe_detail, container, false
        )
        val viewModel = ViewModelProvider(this)[ShoeListViewModel::class.java]

        val selected = arguments?.getInt("selected")
        Timber.i("selected position $selected")


        if (selected != -1) {
            val shoe = viewModel.shoes.value?.get(selected!!)
            Timber.i("selected shoe $shoe")
            binding.shoeSize = shoe?.size.toString()
            binding.shoeCompany = shoe?.company
            binding.shoeDesc= shoe?.description
            binding.shoeName = shoe?.name
        }

        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }

        return binding.root
    }
}