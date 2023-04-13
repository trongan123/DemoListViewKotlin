package com.example.demolistviewkotlin

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class CustomAdapter(var context: Context,var mangMonAns: ArrayList<MonAn>): BaseAdapter() {
    override fun getCount(): Int {
        return mangMonAns.size
    }

    override fun getItem(p0: Int): Any {
        return mangMonAns.get(p0)
    }

    override fun getItemId(p0: Int): Long {
    return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        TODO("Not yet implemented")
    }


}