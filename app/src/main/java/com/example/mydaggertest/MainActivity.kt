package com.example.mydaggertest

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mydaggertest.burger.BuggerDaggerActivity
import com.example.mydaggertest.burger.Burger
import com.example.mydaggertest.recyclerview.SampleRecyclerActivitiy
import com.example.mydaggertest.simple.SimpleActivity
import com.example.mydaggertest.test.UserRepository
import com.example.mydaggertest.viewmodelsample.ViewModelActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.sample_intent_text.view.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var userRepository: UserRepository
    @Inject lateinit var viewModel: SampleViewModel

    private fun getData() : ArrayList<String> {
        val ar: ArrayList<String> = arrayListOf()
        ar.add("BuggerSample")
        ar.add("RecyclerSample")
        ar.add("ViewModelSample")
        ar.add("Simple")
        return ar
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as AppApplication).getApplicationComponent()
            .mainActivityComponentBuilder
            .create()
            .inject(this)

        //application에서 가지고있는 userRepository 상속받아 사용할수있다.
        Log.d("TestInjectMainActivity=", userRepository.hoho())
        viewModel.oh()

        main_rv.layoutManager = LinearLayoutManager(this)
        main_rv.adapter = MainAdapter(getData())
    }
}

class MainAdapter(private val ar: ArrayList<String>) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.sample_intent_text, parent, false))
    }

    override fun getItemCount(): Int {
        return ar.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bindView(ar[position])
    }

    inner class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(text: String) {
            itemView.sampleTxt.text = text
            itemView.sampleTxt.setOnClickListener {
                when (itemView.sampleTxt.text) {
                    "BuggerSample" -> {
                        val intent = Intent(itemView.context, BuggerDaggerActivity::class.java)
                        startActivity(itemView.context, intent, null)
                    }
                    "RecyclerSample" -> {
                        val intent = Intent(itemView.context, SampleRecyclerActivitiy::class.java)
                        startActivity(itemView.context, intent, null)
                    }
                    "ViewModelSample" -> {
                        val intent = Intent(itemView.context, ViewModelActivity::class.java)
                        startActivity(itemView.context, intent, null)
                    }
                    "Simple" -> {
                        val intent = Intent(itemView.context, SimpleActivity::class.java)
                        startActivity(itemView.context, intent, null)
                    }
                }

            }
        }
    }
}