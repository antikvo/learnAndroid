package com.antikvo.learn.modules.viewlifecycle.activity

import android.os.Bundle
import android.os.Debug
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.antikvo.learn.R

class ViewLifecycleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ViewLifecycleActivity", "onCreate")
        Debug.startMethodTracing()
        setContentView(R.layout.activity_log_view)
        Debug.stopMethodTracing()
    }

    override fun onPause() {
        super.onPause()
        Log.d("ViewLifecycleActivity", "onPause")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ViewLifecycleActivity", "onDestroy")
    }

    override fun onStart() {
        super.onStart()
        Log.d("ViewLifecycleActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ViewLifecycleActivity", "onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ViewLifecycleActivity", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ViewLifecycleActivity", "onRestart")
    }
}
