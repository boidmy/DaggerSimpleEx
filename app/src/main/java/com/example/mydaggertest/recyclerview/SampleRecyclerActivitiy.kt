package com.example.mydaggertest.recyclerview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mydaggertest.R
import com.example.mydaggertest.recyclerview.component.DaggerRecyclerComponent
import kotlinx.android.synthetic.main.activity_recycler_sample.*
import javax.inject.Inject

class SampleRecyclerActivitiy : AppCompatActivity() {

    @Inject
    lateinit var sampleAdapter: SampleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_sample)

        DaggerRecyclerComponent.create().inject(this) //대거 주입

        sample_rv.layoutManager = LinearLayoutManager(this
            , LinearLayoutManager.VERTICAL, false)
        sample_rv.adapter = sampleAdapter
    }
}

class SampleAdapter : RecyclerView.Adapter<SampleAdapter.SampleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleViewHolder {
        return SampleViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.sample_rv_item, parent, false))
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: SampleViewHolder, position: Int) {
        holder.bindView()
    }

    inner class SampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView() {

        }
    }
}