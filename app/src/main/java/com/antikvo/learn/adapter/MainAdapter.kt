package com.antikvo.learn.adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import com.antikvo.learn.R
import com.antikvo.learn.base.BaseViewHolder
import kotlinx.android.synthetic.main.item_main_layout.view.*
import java.util.*

open class MainAdapter(private val context: Context) : RecyclerView.Adapter<MainAdapter.MainVH>() {

    private val nameList = ArrayList<String>()
    private val activityList = ArrayList<Class<*>>()

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): MainVH {
        return MainVH(viewGroup)
    }

    override fun onBindViewHolder(mainVH: MainVH, i: Int) {
        mainVH.tvActivityName.text = nameList[i]
        mainVH.tvActivityName.setOnClickListener { context.startActivity(Intent(context, activityList[i])) }
    }

    override fun getItemCount(): Int {
        return nameList.size
    }

    fun addActivity(name: String, activityClass: Class<*>) {
        nameList.add(name)
        activityList.add(activityClass)
        notifyItemInserted(itemCount)
    }

    class MainVH(parent: ViewGroup) : BaseViewHolder(parent, R.layout.item_main_layout) {
        val tvActivityName: TextView = itemView.tv_activity_name
    }

}
