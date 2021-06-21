package com.raywenderlich.baseadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.raywenderlich.baseadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            adapter = Adapter()
            adapter.setData(makeData())
            recyclerview.layoutManager = LinearLayoutManager(this@MainActivity)
            recyclerview.adapter = adapter
        }




    }


    private fun makeData():MutableList<DataForRecycler>{
        val data = mutableListOf<DataForRecycler>()
        data.add(DataForRecycler("temo","xatiashvili","22","mail.com"))
        data.add(DataForRecycler("temo","xatiashvili","22","mail.com"))
        data.add(DataForRecycler("temo","xatiashvili","22","mail.com"))
        data.add(DataForRecycler("temo","xatiashvili","22","mail.com"))
        data.add(DataForRecycler("temo","xatiashvili","22","mail.com"))
        data.add(DataForRecycler("temo","xatiashvili","22","mail.com"))
        data.add(DataForRecycler("temo","xatiashvili","22","mail.com"))
        data.add(DataForRecycler("temo","xatiashvili","22","mail.com"))
        data.add(DataForRecycler("temo","xatiashvili","22","mail.com"))
        data.add(DataForRecycler("temo","xatiashvili","22","mail.com"))
        data.add(DataForRecycler("temo","xatiashvili","22","mail.com"))
        data.add(DataForRecycler("temo","xatiashvili","22","mail.com"))
        return data

    }

}