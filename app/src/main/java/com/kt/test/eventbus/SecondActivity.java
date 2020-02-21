package com.kt.test.eventbus;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.kt.test.eventbus.myapp.MyEventBusIndex;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
//import com.example.myapp.MyEventBusIndex;

/**
 * @Author: dr
 * @Data: 2020-02-21
 */
public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
        EventBus eventBus = EventBus.builder().addIndex(new MyEventBusIndex()).build();
    }

    @Subscribe(threadMode = ThreadMode.POSTING)
    public void getMessage(String str) {

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
