package com.example.grades.list

import com.example.grades.R
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegate

fun picAD() = adapterDelegate<Pic, Any>(
    R.layout.pic_item
) {}