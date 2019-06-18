package com.example.lavisha.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m);
    }
    public void v1(View view) {
        Intent intent=new Intent(MActivity.this,Main2Activity.class);
        startActivity(intent);
    }

    public void v2(View view) {
        Intent intent=new Intent(MActivity.this,Main3Activity.class);
        startActivity(intent);
    }
}
