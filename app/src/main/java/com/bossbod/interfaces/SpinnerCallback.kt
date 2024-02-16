package com.bossbod.interfaces

import com.bossbod.objects.Spinner
import java.util.*


interface SpinnerCallback {
    abstract fun onDone(list: ArrayList<Spinner>)
}