package com.willowtreeapps.scratch

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log


class CleanReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        Log.d("Scratch", "Scheduling Restart")
        val startIntent = intent.getParcelableExtra<Intent>("restartIntent")
        val mPendingIntentId = 5647382
        val pendingIntent = PendingIntent.getActivity(context, mPendingIntentId, startIntent, PendingIntent.FLAG_CANCEL_CURRENT)
        val mgr = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        mgr.set(AlarmManager.RTC, System.currentTimeMillis() + 5000, pendingIntent)
    }
}
