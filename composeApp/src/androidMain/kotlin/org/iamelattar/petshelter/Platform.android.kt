package org.iamelattar.petshelter

import android.os.Build

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()



actual fun getMyFullName(): Platform {
    TODO("Not yet implemented")
}