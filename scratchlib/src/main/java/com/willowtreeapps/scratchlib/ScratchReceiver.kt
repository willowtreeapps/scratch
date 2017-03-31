package com.willowtreeapps.scratchlib

import android.app.ActivityManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Context.ACTIVITY_SERVICE
import android.content.Intent
import android.util.Log


class ScratchReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (isInForeground()) {
            sendRestartBroadcast(context)
            Log.d("Scratch", "Scratch Broadcast Received")
            val status = (context?.getSystemService(ACTIVITY_SERVICE) as ActivityManager)
                    .clearApplicationUserData()
            Log.d("Scratch", "Scratch cleared data: " + status)
        }
    }

    private fun sendRestartBroadcast(context: Context?) {
        val intent = getLaunchActivity(context)
        val restartBroadcastIntent = Intent("com.willowtreeapps.scratch.RESTART")
        restartBroadcastIntent.putExtra("restartIntent", intent)
        context?.sendBroadcast(restartBroadcastIntent)
    }

    private fun getLaunchActivity(context: Context?): Intent? {
        val pm = context?.packageManager
        return pm?.getLaunchIntentForPackage(context?.packageName)
    }

    fun isInForeground(): Boolean {
        val process = ActivityManager.RunningAppProcessInfo()
        ActivityManager.getMyMemoryState(process)
        return process.importance == ActivityManager.RunningAppProcessInfo.IMPORTANCE_FOREGROUND
    }
}



