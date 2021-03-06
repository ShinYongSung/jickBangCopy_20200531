package my.kim.jickbangcopy_20200531

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import my.kim.jickbangcopy_20200531.adapters.RoomAdapter
import my.kim.jickbangcopy_20200531.datas.Room

class MainActivity : BaseActivity() {

    val rooms = ArrayList<Room>()

    lateinit var roomAdapter: RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setvalues()
    }

    override fun setupEvents() {

        roomListView.setOnItemLongClickListener { parent, view, position, id ->  }

        val alert = AlertDialog.Builder(mContext)
        alert.setTitle("테스트")
        alert.setMessage("테스트용 얼럿")
        alert.setPositiveButton("확인", null)
        alert.show()


    }

    override fun setvalues() {

        rooms.add(Room(10000, "마포구 서교동", 1, "마포 서교동의 방입니다."))
        rooms.add(Room(25000, "마포구 서교동", 3, "마포 서교동의 방입니다."))
        rooms.add(Room(10000, "마포구 서교동", 5, "마포 서교동의 방입니다."))
        rooms.add(Room(8000, "마포구 서교동", 4, "마포 서교동의 방입니다."))
        rooms.add(Room(12000, "마포구 성산동", 0, "마포 성산동의 방입니다."))
        rooms.add(Room(6000, "마포구 성산동", 1, "마포 성산동의 방입니다."))
        rooms.add(Room(8000, "마포구 성산동", 0, "마포 성산동의 방입니다."))
        rooms.add(Room(12000, "마포구 망원동", -1, "마포 망원동의 방입니다."))
        rooms.add(Room(8000, "마포구 망원동", -1, "마포 망원동의 방입니다."))
        rooms.add(Room(12000, "마포구 망원동", 2, "마포 망원동의 방입니다."))
        rooms.add(Room(8000, "마포구 망원동", 3, "마포 망원동의 방입니다."))

        roomAdapter = RoomAdapter(mContext, R.layout.room_list_item,rooms)

        roomListView.adapter = roomAdapter



    }





}
