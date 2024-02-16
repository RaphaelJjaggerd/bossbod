package com.bossbod.utils.watertracker

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import java.util.*


class WaterTrackerStopBroadcastReceiver : BroadcastReceiver() {

    @SuppressLint("SimpleDateFormat")
    override fun onReceive(context: Context, intent: Intent) {
        AlarmHelper.stopNotificationsAlarm(context)
        println("fired!")
    }
}
