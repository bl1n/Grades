package com.example.grades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.grades.list.Pic
import com.example.grades.list.PicAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val picAdapter by lazy {
        PicAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val columns = resources.getInteger(R.integer.columns)

        recycler.run {
            layoutManager = GridLayoutManager(context, columns)
            adapter = picAdapter
        }

        picAdapter.items = (0 until 100).map { Pic }
    }
}