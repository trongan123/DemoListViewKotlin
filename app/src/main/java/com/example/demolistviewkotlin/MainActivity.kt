package com.example.demolistviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var arraymonan : ArrayList<MonAn> = ArrayList()

        arraymonan.add(MonAn("hình Ao", R.drawable.ao))
        arraymonan.add(MonAn("Hinh ca tre", R.drawable.cac))
        arraymonan.add(MonAn("Cá chép",R.drawable.cachep))
        arraymonan.add(MonAn("Cá Điêu Hồng",R.drawable.cadieuhong))
        arraymonan.add(MonAn("Cá trê",R.drawable.catre))

        var listview : ListView = findViewById(R.id.listView)
        listview.adapter = CustomAdapter(this@MainActivity,arraymonan)
    }
}