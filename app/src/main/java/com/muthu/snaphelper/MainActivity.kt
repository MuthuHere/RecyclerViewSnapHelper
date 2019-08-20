package com.muthu.snaphelper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.PagerSnapHelper
import com.muthu.snaphelper.Util.getRandomNumber
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
        //setting adapter
        rvHorizontal.adapter = NumbersAdapter(itemList)

        //snapHelper to stick to a view when scrolling
        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(rvHorizontal)
    }

    /**
     * preparing card details for test view
     */
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

}
