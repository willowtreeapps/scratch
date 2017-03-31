package com.willowtreeapps.scratch

import android.content.Intent
import android.service.quicksettings.TileService
import android.util.Log

class ScratchTileService : TileService() {
    override fun onClick() {
        sendBroadcast(Intent("com.willowtreeapps.scratch.CLEAR_DATA"))
        Log.d("Scratch", "Scratch Broadcast Sent")
    }

    override fun onTileRemoved() {
        super.onTileRemoved()
    }

    override fun onTileAdded() {
        super.onTileAdded()
    }

    override fun onStartListening() {
        super.onStartListening()
    }
}
