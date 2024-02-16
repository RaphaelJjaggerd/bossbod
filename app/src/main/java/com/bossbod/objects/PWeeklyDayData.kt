package com.bossbod.objects

import com.bignerdranch.expandablerecyclerview.model.Parent

class PWeeklyDayData: Parent<PWeekDayData> {

    var Workout_id = ""
    var dayId = ""
    var Day_name = ""
    var Week_name = ""
    var Is_completed = ""
    var categoryName = ""

    var flagPrevDay = true

    var arrWeekDayData = ArrayList<PWeekDayData>()
    override fun getChildList(): MutableList<PWeekDayData> {

        return arrWeekDayData
    }

    override fun isInitiallyExpanded(): Boolean {
        return true
    }
}