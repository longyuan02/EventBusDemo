//package com.kt.test.eventbus
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import org.greenrobot.eventbus.EventBus
//import org.greenrobot.eventbus.Subscribe
//import org.greenrobot.eventbus.ThreadMode
//import kotlinx.android.synthetic.main.activity_main.*
//
//public class MainActivity : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        EventBus.getDefault().register(this)
////        EventBus.getDefault().post("111")
//        EventBus.getDefault().postSticky("111")
////        EventBus.getDefault()
//    }
//
//    @Subscribe(threadMode = ThreadMode.POSTING)
//    public fun getMessage(str: String) {
//        tv_main.text = str
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        EventBus.getDefault().unregister(this)
//    }
//}
