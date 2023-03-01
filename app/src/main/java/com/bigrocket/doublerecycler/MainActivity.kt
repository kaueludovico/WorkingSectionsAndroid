package com.bigrocket.doublerecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var list = mutableListOf<Parent>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        populateList()
        setAdapter()
    }

    fun setAdapter() {
        recyclerViewParent.apply {
            adapter = ListParentAdapter(list)
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }


    fun populateList() {
        list.add(Parent("Seção 1234", mutableListOf("Um", "Dois", "Três", "Quatro")))
        list.add(Parent("Section 2", mutableListOf("Um", "Dois", "Três", "Quatro")))
        list.add(Parent("Section 3", mutableListOf("Um", "Dois", "Três", "Quatro")))
        list.add(Parent("Section 4", mutableListOf("Um", "Dois", "Três", "Quatro")))
        list.add(Parent("Section 5", mutableListOf("Um", "Dois", "Três", "Quatro")))
        list.add(Parent("Section 6", mutableListOf("Um", "Dois", "Três", "Quatro")))
        list.add(Parent("Section 7", mutableListOf("Um", "Dois", "Três", "Quatro")))
        list.add(Parent("Section 8", mutableListOf("Um", "Dois", "Três", "Quatro")))
        list.add(Parent("Section 9", mutableListOf("Um", "Dois", "Três", "Quatro")))
        list.add(Parent("Section 10", mutableListOf("Um", "Dois", "Três", "Quatro")))
        list.add(Parent("Section 11", mutableListOf("Um", "Dois")))
    }
}