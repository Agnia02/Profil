package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class EducationActivity : AppCompatActivity() {

    lateinit var educationView: RecyclerView
    lateinit var educationAdapter: SchoolAdapter
    val list = ArrayList<SchoolData>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        educationView = findViewById(R.id.rvEducation)
        educationView.layoutManager = LinearLayoutManager(this)

        list.add(SchoolData("RA Tunas Bangsa", "Dukuh Badong-Sidogemah, Kec. Sayung, Kab. Demak"))
        list.add(SchoolData("SD Negeri Sidogemah 1", "Dukuh Badong-Sidogemah, Kec. Sayung, Kab. Demak"))
        list.add(SchoolData("SMP Negeri 2 Sayung", "Jl. Raya Semarang-Demak Km.14 Onggorawe, Kec. Sayung, Kab. Demak"))
        list.add(SchoolData("SMK Negeri 1 Sayung", "Jl. Raya Semarang-Demak Km.14 Onggorawe, Kec. Sayung, Kab. Demak"))

        educationAdapter = SchoolAdapter(list)
        educationView.adapter = educationAdapter
    }
}