package com.udacity.shoestore.shoelist

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.databinding.DataBindingUtil
import com.udacity.shoestore.R
import com.udacity.shoestore.models.Shoe
import com.udacity.shoestore.databinding.ShoeListItemBinding
import timber.log.Timber
import java.util.*

class ShoeListViewAdapter(private val context: Context?, private val data: List<Shoe>) :

    BaseAdapter() {

    private var layoutInflater: LayoutInflater? = null

    override fun getCount(): Int {
        return data.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, itemView: View?, parentView: ViewGroup): View {
        Timber.i("position ${position}, itemView $itemView parentView $parentView")
        if (layoutInflater == null) {
            layoutInflater =
                parentView.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater?
        }

        Timber.i("data @ $position : ${data[position]}")

        val binding: ShoeListItemBinding =
            DataBindingUtil.inflate(layoutInflater!!, R.layout.shoe_list_item, parentView, false)
        binding.shoeName = data[position].name
        binding.shoeSize = data[position].size.toString()
        binding.shoeCompany = data[position].company

        return binding.root
    }
}