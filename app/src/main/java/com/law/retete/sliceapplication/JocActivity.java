package com.law.retete.sliceapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JocActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joc);
    }

    public void clickContinutJoc(View view) {
        Intent intent = new Intent(JocActivity.this, ContinutJoc.class);
        startActivity(intent);
    }
}
