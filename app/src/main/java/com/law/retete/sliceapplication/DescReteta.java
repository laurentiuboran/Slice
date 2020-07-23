package com.law.retete.sliceapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DescReteta extends AppCompatActivity {
    ImageView descimageView;
    TextView descTitle, descShortDesc, descRating, descPrice, descText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc_reteta);
        descimageView = (ImageView) findViewById(R.id.descimageView);
        descTitle = (TextView) findViewById(R.id.descTitle);
        descShortDesc = (TextView) findViewById(R.id.descShortDesc);
        descRating = (TextView) findViewById(R.id.descRating);
        descPrice = (TextView) findViewById(R.id.descPrice);
        descText = (TextView) findViewById(R.id.descText);
        descimageView.setImageResource(getIntent().getIntExtra("img_id", 00));
        descTitle.setText(getIntent().getStringExtra("title"));
        descShortDesc.setText(getIntent().getStringExtra("desc"));
        descRating.setText(getIntent().getStringExtra("rating"));
        descPrice.setText(getIntent().getStringExtra("price"));
        descText.setText(getIntent().getStringExtra("text"));
        descText.setMovementMethod(new ScrollingMovementMethod());
    }
}
