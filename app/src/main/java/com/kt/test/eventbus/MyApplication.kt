package com.kt.test.eventbus

import android.app.Application
import com.kt.test.eventbus.myapp.MyEventBusIndex
import org.greenrobot.eventbus.EventBus


/**
 * @Author: dr
 * @Data: 2020-02-21
 */
public class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // 只设置一次，并且要在我们第一次使用EventBus之前进行设置
        // 只设置一次，并且要在我们第一次使用EventBus之前进行设置
        EventBus.builder().addIndex(MyEventBusIndex()).installDefaultEventBus()
    }
}