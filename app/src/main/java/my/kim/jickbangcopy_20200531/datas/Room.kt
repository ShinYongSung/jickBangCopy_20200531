package my.kim.jickbangcopy_20200531.datas

import java.text.NumberFormat
import java.util.*

class Room(val price:Int, val address:String, val floor: Int, val description:String){

    fun getFormattedFloor() : String {
        if (this.floor > 0) {
            return "${this.floor}층"
        }


        else if (this.floor == 0) {
                return "반지하"
        }

        else {
            return "지하 ${-this.floor}층"
        }

    }

    fun getFormattedPrice() : String {
        if (this.price<10000) {
            return NumberFormat.getInstance(Locale.KOREA).format(this.price)
//            return "${this.price/10000}억${this.price}"
        }
        else {
//            정수 / 정수 = 정수 =>28500 / 10000 = 2
//            28500 % 10000 => 만으로 나눈 나머지 => 8500
            val uk = this.price / 10000
            val underUK = this.price % 10000
            return "${uk}억${NumberFormat.getInstance(Locale.KOREA).format(underUK)}"
        }
    }

}