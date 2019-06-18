package com.example.lavisha.project;

import android.graphics.PixelFormat;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Main2Activity extends AppCompatActivity {

    Button clk;
    VideoView videov;
    MediaController mediaC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getWindow().setFormat(PixelFormat.UNKNOWN);
        clk=(Button)findViewById(R.id.button2);
        videov=(VideoView)findViewById(R.id.videoView);
        mediaC=new MediaController(this);//
    }

    public void videoplay(View view) {
        String videopath="android.resource://com.example.lavisha.project/"+R.raw.chotu;
        Uri uri= Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.requestFocus();
        mediaC.setAnchorView(videov);
        videov.start();

    }
}
