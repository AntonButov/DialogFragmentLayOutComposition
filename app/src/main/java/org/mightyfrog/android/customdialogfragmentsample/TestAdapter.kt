package org.mightyfrog.android.customdialogfragmentsample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * @author Shigehiro Soejima
 */
class TestAdapter : RecyclerView.Adapter<TestAdapter.TestItem>() {

    private val list = (1..30).toList()

    override fun getItemId(position: Int) = list[position].toLong()

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: TestItem, position: Int) {
        holder.tv.text = list[position].toString()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestItem {
        return TestItem(LayoutInflater.from(parent.context).inflate(R.layout.view_holder, parent, false))
    }

    class TestItem(view: View) : RecyclerView.ViewHolder(view) {
        val tv = view.findViewById<TextView>(R.id.textView)!!
    }
}