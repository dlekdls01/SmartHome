package com.example.a502.smarthome;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoomActivity extends AppCompatActivity {
    private RecyclerAdapter adapter;
    private List<Device> devices;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
        Intent intent = getIntent();

        // 방에 있는 device들 가져오기
        devices = (ArrayList<Device>)intent.getSerializableExtra("DEVICE");
        init();
        getData();
    }
    private void init() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        adapter = new RecyclerAdapter();
        recyclerView.setAdapter(adapter);
    }

    private void getData() {
        if (devices == null) {
            Log.e("getData","devices is null");
            return;
        }

        // 0 - led, 1 - blind, 2 - fan
        List<Drawable> drawableList = Arrays.asList(getResources().getDrawable(R.drawable.light),getResources().getDrawable(R.drawable.blind),getResources().getDrawable(R.drawable.fan));
        for(int i=0; i<devices.size(); i++) {
            Device data = devices.get(i);
            data.setDeviceName(data.getDeviceName());
            data.setDeviceImgDrawable(drawableList.get(i));
            data.setDeviceType(data.getDeviceType());
            data.setDeviceState(data.getDeviceState());
            adapter.addItem(data);
        }
        adapter.notifyDataSetChanged();
    }
}