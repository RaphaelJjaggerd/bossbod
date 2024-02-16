package com.bossbod.exceptions.networks

import com.bossbod.utils.Debug

class NoInternetException : NetworkException() {

    override var errMessage: String = "No Internet Available"

    override var title: String = "Alert"

    override fun printStackTrace() {
        super.printStackTrace()
        Debug.e("NoInternet","No Internet Connection")
    }

    override fun getLocalizedMessage(): String {
        return super.getLocalizedMessage()
    }
}