package com.example.lavisha.project;

import android.graphics.PixelFormat;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Main3Activity extends AppCompatActivity {

    Button clk;
    VideoView videov;
    MediaController mediaC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getWindow().setFormat(PixelFormat.UNKNOWN);
        clk=(Button)findViewById(R.id.button2);
        videov=(VideoView)findViewById(R.id.videoView1);
        mediaC=new MediaController(this);//
    }

    public void videoplay1(View view) {
        String videopath="android.resource://com.example.lavisha.project/"+R.raw.taara;
        Uri uri= Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.requestFocus();
        mediaC.setAnchorView(videov);
        videov.start();

    }
}
