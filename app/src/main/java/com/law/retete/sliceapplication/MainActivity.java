package com.law.retete.sliceapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickRetetar(View view) {
        Intent intent = new Intent(MainActivity.this, Retetar.class);
        startActivity(intent);
    }

    public void clickChestionar(View view) {
        Intent intent = new Intent(MainActivity.this, ChestionarActivity.class);
        startActivity(intent);
    }

    public void clickJoc(View view) {
        Intent intent = new Intent(MainActivity.this, JocActivity.class);
        startActivity(intent);
    }

    public void clickChat(View view) {
        Intent intent = new Intent(MainActivity.this, ChatActivity.class);
        startActivity(intent);
    }

    public void clickMail(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("plain/text");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "some@email.address" });
        intent.putExtra(Intent.EXTRA_SUBJECT, "subject");
        intent.putExtra(Intent.EXTRA_TEXT, "mail body");
        startActivity(Intent.createChooser(intent, ""));
    }
}
