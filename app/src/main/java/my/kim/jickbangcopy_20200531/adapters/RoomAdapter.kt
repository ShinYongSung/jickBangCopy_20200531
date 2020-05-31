package my.kim.jickbangcopy_20200531.adapters

import android.content.Context
import android.content.LocusId
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import my.kim.jickbangcopy_20200531.R
import my.kim.jickbangcopy_20200531.datas.Room

class RoomAdapter(context:Context, resId: Int, list: List<Room>) : ArrayAdapter<Room>(context, resId, list) {
    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {

            tempRow = inf.inflate(R.layout.room_list_item, null)

        }

        val row = tempRow!!

        val data = mList.get(position)

        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressAndFloorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt)
        val descTxt = row.findViewById<TextView>(R.id.descTxt)


        addressAndFloorTxt.text = "${data.address}, ${data.getFormattedFloor()}층"
        descTxt.text = data.description
        priceTxt.text = "${data.price}, ${data.getFormattedPrice()}"

        return row



    }
}