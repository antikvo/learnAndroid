package com.antikvo.learn.base

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by antikvo on 18/10/31.
 */
open class BaseViewHolder(parent: ViewGroup, layoutId: Int) : RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(layoutId, parent, false))
