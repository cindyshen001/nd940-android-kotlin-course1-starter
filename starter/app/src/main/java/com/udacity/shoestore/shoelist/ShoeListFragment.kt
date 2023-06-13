package com.udacity.shoestore.shoelist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeListBinding
import com.udacity.shoestore.models.Shoe
import timber.log.Timber

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
        binding.listViewShoes.setOnItemClickListener { adapter, view, position, id ->
            Timber.i("Clicked position $position")
            findNavController().navigate(
                ShoeListFragmentDirections.actionShoeListFragmentToShoeDetailFragment(
                    position
                )
            )
        }

        binding.floatingActionButton.setOnClickListener {
            Timber.i("add new shoe btn clicked.")
            findNavController().navigate(
                ShoeListFragmentDirections.actionShoeListFragmentToShoeDetailFragment(
                    -1
                )
            )
        }

        return binding.root
    }

    override fun onResume() {
        Timber.i("onResume")

        super.onResume()
    }
}
