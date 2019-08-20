package com.muthu.snaphelper

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.SnapHelper

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    private var itemList: ArrayList<ListModel> by Delegates.notNull()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)



        prepareItems()

        setView()
    }

    private fun setView() {

        rvHorizontal.adapter = NumbersAdapter(itemList)

        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(rvHorizontal)
    }

    private fun prepareItems() {
        itemList = arrayListOf()

        itemList.add(
            ListModel(
                "Muthu",
                getRandomNumber(),
                "23/25",
                "346"
            )
        )
        itemList.add(
            ListModel(
                "Sugan",
                getRandomNumber(),
                "20/25",
                "306"
            )
        )
        itemList.add(
            ListModel(
                "Naren",
                getRandomNumber(),
                "03/22",
                "064"
            )
        )
        itemList.add(
            ListModel(
                "Martin",
                getRandomNumber(),
                "08/23",
                "683"
            )
        )


    }

    private fun getRandomNumber(): String {
        val first14 = (Math.random() * 100000000000000L).toLong()
        val number = 5200000000000000L + first14
        Log.i("mmm", "" + number)

        return number.toString()
    }
}
