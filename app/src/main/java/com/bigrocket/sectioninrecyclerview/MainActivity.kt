package com.bigrocket.sectioninrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.bigrocket.sectioninrecyclerview.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val list = mutableListOf<Parent>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        setAdapter()
    }

    fun setAdapter() {
        populateList()
        recyclerViewParent.apply {
            adapter = ListParentAdapter(list)
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }

    fun populateList() {
        list.add(Parent("Section 1", mutableListOf("Um", "Dois", "Três", "Quatro")))
        list.add(Parent("Section 2", mutableListOf("Um", "Dois", "Três", "Quatro")))
        list.add(Parent("Section 3", mutableListOf("Um", "Dois", "Três", "Quatro")))
        list.add(Parent("Section 4", mutableListOf("Um", "Dois", "Três", "Quatro")))
        list.add(Parent("Section 5", mutableListOf("Um", "Dois", "Três", "Quatro")))
        list.add(Parent("Section 6", mutableListOf("Um", "Dois", "Três", "Quatro")))
        list.add(Parent("Section 7", mutableListOf("Um", "Dois", "Três", "Quatro")))
        list.add(Parent("Section 8", mutableListOf("Um", "Dois", "Três", "Quatro")))
        list.add(Parent("Section 9", mutableListOf("Um", "Dois", "Três", "Quatro")))
        list.add(Parent("Section 10", mutableListOf("Um", "Dois", "Três", "Quatro")))

        println(">>>>>>>>>>>>>>>>>>>>>>")
        println(list[0])
        println(">>>>>>>>>>>>>>>>>>>>>>")
    }
}