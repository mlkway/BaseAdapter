package com.raywenderlich.baseadapter

import com.raywenderlich.baseadapter.databinding.ItemViewBinding

class Adapter:BaseAdapter<ItemViewBinding, DataForRecycler>(ItemViewBinding::inflate) {


    override fun <DATA> start(data: DATA, binding: ItemViewBinding) {
        if (data is DataForRecycler){
            binding.textView.text = data.name
            binding.textView2.text = data.surname
            binding.textView3.text = data.age
            binding.textView4.text = data.email
        }
    }


}