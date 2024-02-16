package com.bossbod.interfaces

interface PermissionListener {

    fun onPermissionClick()

    fun onPermissionAllow(isAllow: Boolean)
}