package com.bossbod.exceptions

import com.bossbod.utils.Debug

class PermissionException : BaseException() {

    override fun printStackTrace() {
        super.printStackTrace()
        Debug.e("Permission","Permission denied" )
    }
}