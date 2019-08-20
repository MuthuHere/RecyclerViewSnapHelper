package com.muthu.snaphelper

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muthu.snaphelper.Util.getScreenWidthInDPs
import kotlinx.android.synthetic.main.item_cc_view.view.*

class NumbersAdapter(
    private val list: ArrayList<ListModel>
) : RecyclerView.Adapter<NumbersAdapter.VHNumber>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHNumber {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cc_view, parent, false)
        return VHNumber(view)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: VHNumber, position: Int) {


        //cover only 70% of width
        val params = holder.itemView.llRootCardView.layoutParams
        params.width = getScreenWidthInDPs(holder.itemView.context)
        holder.itemView.llRootCardView.layoutParams = params


        //setting background colors
        when (position) {
            0 -> holder.itemView.rlCardView.setBackgroundResource(R.drawable.bg_card_view_green)
            1 -> holder.itemView.rlCardView.setBackgroundResource(R.drawable.bg_card_view_pink)
            2 -> holder.itemView.rlCardView.setBackgroundResource(R.drawable.bg_card_view_purple)
            3 -> holder.itemView.rlCardView.setBackgroundResource(R.drawable.bg_card_view_orange)
            else -> holder.itemView.rlCardView.setBackgroundResource(R.drawable.bg_card_view_orange)
        }

        //binding data
        holder.onBind(list[position])
    }

    inner class VHNumber(
        private val view: View
    ) : RecyclerView.ViewHolder(view) {
        fun onBind(item: ListModel) {
            with(item) {
                with(view) {
                    tvCardName.text = name
                    tvCardNumber.text = number
                    tvCardDate.text = date
                    tvCardCvv.text = cvv
                }
            }


        }

    }
}