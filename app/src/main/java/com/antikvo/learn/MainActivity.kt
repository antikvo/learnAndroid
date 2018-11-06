package com.antikvo.learn

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.antikvo.learn.adapter.MainAdapter
import com.antikvo.learn.modules.viewlifecycle.activity.ViewLifecycleActivity

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: MainAdapter
    private lateinit var viewManager: RecyclerView.LayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("MainActivity", "onCreate")
        setContentView(R.layout.activity_main)
        viewManager = LinearLayoutManager(this.applicationContext)
        initAdapter()
        recyclerView = findViewById<RecyclerView>(R.id.recycler_view).apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }

    private fun initAdapter() {
        viewAdapter = MainAdapter(this)
        viewAdapter.addActivity("View的Invisible，visible，gone区别", ViewLifecycleActivity::class.java)
    }


    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "onRestart")
    }
}
