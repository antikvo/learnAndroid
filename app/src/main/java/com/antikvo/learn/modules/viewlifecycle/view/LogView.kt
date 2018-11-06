package com.antikvo.learn.modules.viewlifecycle.view

import android.content.Context
import android.graphics.Canvas
import android.os.Build
import android.os.Parcelable
import android.support.annotation.RequiresApi
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View


class LogView : View {

    constructor(context: Context) : super(context) {
        Log.d("LogView", "constructor(context: Context)")
    }

    constructor(context: Context, attributeSet: AttributeSet?) : super(context, attributeSet) {
        Log.d("LogView", "constructor(context: Context, attributeSet: AttributeSet?)")
    }

    constructor(context: Context, attributeSet: AttributeSet?, defStyleAttr: Int) : super(context, attributeSet, defStyleAttr) {
        Log.d("LogView", "constructor(context: Context, attributeSet: AttributeSet?, defStyleAttr: Int)")
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    constructor(context: Context, attributeSet: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attributeSet, defStyleAttr, defStyleRes) {
        Log.d("LogView", "constructor(context: Context, attributeSet: AttributeSet?, defStyleAttr: Int, defStyleRes: Int)")
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        Log.d("LogView", "onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int)")
    }

    override fun layout(l: Int, t: Int, r: Int, b: Int) {
        super.layout(l, t, r, b)
        Log.d("LogView", "layout(l: Int, t: Int, r: Int, b: Int)")
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Log.d("LogView", "onAttachedToWindow()")
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.d("LogView", "onTouchEvent()")
        return super.onTouchEvent(event)
    }

    override fun onFinishInflate() {
        Log.d("LogView", "onFinishInflate()")
        super.onFinishInflate()
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        Log.d("LogView", "onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int)")
    }

    override fun onSaveInstanceState(): Parcelable? {
        Log.d("LogView", "onSaveInstanceState")
        return super.onSaveInstanceState()
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        Log.d("LogView", "onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int)")
        super.onLayout(changed, left, top, right, bottom)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        Log.d("LogView", "onDraw(canvas: Canvas?)")
    }

    override fun onRestoreInstanceState(state: Parcelable?) {
        super.onRestoreInstanceState(state)
        Log.d("LogView", "onRestoreInstanceState(state: Parcelable?)")
    }

    override fun onVisibilityChanged(changedView: View, visibility: Int) {
        super.onVisibilityChanged(changedView, visibility)
        Log.d("LogView", "onVisibilityChanged(changedView: View, visibility: Int)")
    }

}