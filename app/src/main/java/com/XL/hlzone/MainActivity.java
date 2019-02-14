package com.XL.hlzone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import cn.bmob.v3.Bmob;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bmob.initialize(this,"ba5f2c8f1d0a06efb63bef849e365fe1");
    }
}
