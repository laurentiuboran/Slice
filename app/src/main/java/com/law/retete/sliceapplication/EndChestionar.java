package com.law.retete.sliceapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EndChestionar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_chestionar);
        TextView title = (TextView) findViewById(R.id.textViewTitleEndC), desc = (TextView) findViewById(R.id.textViewDescEndC);
        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("raspC", 0);
        if (intValue < 10) {
            title.setText("Mai încearcă!");
            desc.setText("Ai obținut " + intValue + "/10 întrebări!");
            desc.setTextColor(getResources().getColor(R.color.colorGresitChest));
        }
        else {
            title.setText("Felicitări!");
            desc.setText("Ai obținut 10/10 întrebări!");
            desc.setTextColor(getResources().getColor(R.color.colorCorectChest));
        }
    }

    public void clickEndChestionar(View view) {
        Intent intent = new Intent(EndChestionar.this, MainActivity.class);
        startActivity(intent);
    }
}
