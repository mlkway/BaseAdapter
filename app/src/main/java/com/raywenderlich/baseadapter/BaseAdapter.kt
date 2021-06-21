package com.raywenderlich.baseadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding


typealias Inflate<T> = (LayoutInflater,ViewGroup, Boolean) -> T


abstract class BaseAdapter<VB:ViewBinding, DATA:Any>
    (private val inflater: Inflate<VB>):RecyclerView.Adapter<BaseAdapter.BaseViewHolder<VB>>(){

    val items = mutableListOf<DATA>()

    fun setData(list: MutableList<DATA>){
        items.addAll(list)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<VB> {
        return BaseViewHolder(inflater.invoke(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: BaseViewHolder<VB>, position: Int) {
        start(items[position],holder.binding)
    }

    override fun getItemCount()=items.size



        class BaseViewHolder<VB: ViewBinding>(val binding: VB):RecyclerView.ViewHolder(binding.root)


    abstract fun <DATA>start(data: DATA, binding: VB)


    }