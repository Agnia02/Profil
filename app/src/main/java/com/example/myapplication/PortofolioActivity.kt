package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PortofolioActivity : AppCompatActivity() {
    lateinit var portofolioView: RecyclerView
    lateinit var portofolioAdapter: PortofolioAdapter
    val listPortofolio = ArrayList<PortofolioData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portofolio)

        listPortofolio.add(
            PortofolioData(
            R.drawable.web, "tugas-web-codeigniter4",
            "Project codeigniter4", "https://github.com/zuliana21/tugas-web-codeigniter4"
        )
        )

        listPortofolio.add(
            PortofolioData(
            R.drawable.android, "jobsheet21",
            "Recycler View", "https://github.com/zuliana21/jobsheet21"
        )
        )

        portofolioView = findViewById(R.id.rvPortofolio)
        portofolioView.layoutManager = LinearLayoutManager(this)

        portofolioAdapter = PortofolioAdapter(listPortofolio)
        portofolioAdapter.notifyDataSetChanged()
        portofolioView.adapter = portofolioAdapter
    }
}
