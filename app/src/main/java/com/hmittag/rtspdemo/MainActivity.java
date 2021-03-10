package com.hmittag.rtspdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    ////fields
    private static final String RTSP_URL = "rtsp://192.168.0.10:8554/H264Video";
    //views
    private VideoView mVideoView;

    ////functions
    //OnCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //init views
        mVideoView = findViewById(R.id.Main_VideoView);
        mVideoView.setVideoURI(Uri.parse(RTSP_URL));
        mVideoView.start();


    }


}