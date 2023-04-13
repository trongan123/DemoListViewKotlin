package com.example.demolistviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import java.text.FieldPosition

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

    override fun getView(position   : Int, converView: View?, p2: ViewGroup?): View {
        var view : View?
        var viewHolder : ViewHolder
        if(converView == null){
            var layoutInflater : LayoutInflater = LayoutInflater.from(context)
            view = layoutInflater.inflate(R.layout.monan_item,null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = converView
            viewHolder = converView.tag as ViewHolder
        }
        var monAn : MonAn = getItem(position) as MonAn
        viewHolder.txtName.text = monAn.ten
        viewHolder.imageMonan.setImageResource(monAn.hinhanh)
        return view as View

    }

    class ViewHolder(row : View){
        var txtName : TextView
        var imageMonan : ImageView
        init {
            txtName = row.findViewById(R.id.txvTen) as  TextView
            imageMonan = row.findViewById(R.id.imageMonan) as  ImageView
        }
    }


}