package com.willowtreeapps.scratchlib

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.Context.ACTIVITY_SERVICE
import android.app.ActivityManager
import android.util.Log


class ScratchReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.d("Scratch", "Scratch Broadcast Received")
        val status = (context?.getSystemService(ACTIVITY_SERVICE) as ActivityManager)
                .clearApplicationUserData()
        Log.d("Scratch", "Scratch cleared data: " + status)
    }
}


