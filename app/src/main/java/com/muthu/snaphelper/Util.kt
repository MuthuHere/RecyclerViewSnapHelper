package com.muthu.snaphelper

import android.content.Context
import android.content.Context.WINDOW_SERVICE
import android.util.DisplayMetrics
import android.view.WindowManager

object Util {

    /**
     * get mobile screen width and convert into pixel
     */
    fun getScreenWidthInDPs(context: Context): Int {
        val dm = DisplayMetrics()
        val windowManager = context.getSystemService(WINDOW_SERVICE) as WindowManager
        windowManager.defaultDisplay.getMetrics(dm)
        val densityDpi = (dm.density * 160f).toInt()
        if (densityDpi == 240) {
            dm.widthPixels = dm.widthPixels - 80
        } else {
            dm.widthPixels = dm.widthPixels - 140
        }
        return dm.widthPixels
    }


    /**
     * generating card number which starts with 52:)
     */
     fun getRandomNumber(): String {
        val first14 = (Math.random() * 100000000000000L).toLong()
        val number = 5200000000000000L + first14

        return number.toString()
    }



}