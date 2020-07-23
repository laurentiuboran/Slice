package com.law.retete.sliceapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChestionarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chestionar);
    }

    public void clickContinutChestionar(View view) {
        Intent intent = new Intent(ChestionarActivity.this, ContinutChestionar.class);
        startActivity(intent);
    }
}
