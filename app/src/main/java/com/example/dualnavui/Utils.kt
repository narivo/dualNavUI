package com.example.dualnavui

import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment

fun Fragment.delay(millis: Long, block: () -> Unit) {
    Handler(Looper.getMainLooper()).postDelayed({ block() }, millis)
}