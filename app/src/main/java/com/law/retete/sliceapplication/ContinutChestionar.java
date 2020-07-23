package com.law.retete.sliceapplication;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ContinutChestionar extends AppCompatActivity {

    private int i = 0, raspCorecte = 0, flag = 0;
    private int[] vectRasp = {2, 3, 1, 2, 2, 3, 3, 1, 2, 3};
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continut_chestionar);
    }

    public void clickImageView1(View view) {
        img = (ImageView) findViewById(R.id.imageView1);
        if (flag == 0) {
            if (vectRasp[i] == 1) {
                raspCorecte++;
                img.setImageResource(R.color.colorCorectChest);
            } else
                img.setImageResource(R.color.colorGresitChest);
        }
        flag = 1;
    }

    public void clickImageView2(View view) {
        img = (ImageView) findViewById(R.id.imageView2);
        if (flag == 0) {
            if (vectRasp[i] == 2) {
                raspCorecte++;
                img.setImageResource(R.color.colorCorectChest);
            } else
                img.setImageResource(R.color.colorGresitChest);
        }
        flag = 1;
    }

    public void clickImageView3(View view) {
        img = (ImageView) findViewById(R.id.imageView3);
        if (flag == 0) {
            if (vectRasp[i] == 3) {
                raspCorecte++;
                img.setImageResource(R.color.colorCorectChest);
            } else
                img.setImageResource(R.color.colorGresitChest);
        }
        flag = 1;
    }

    public void clickButtonNext(View view) {
        ImageView img1 = (ImageView) findViewById(R.id.imageView1), img2 = (ImageView) findViewById(R.id.imageView2), img3 = (ImageView) findViewById(R.id.imageView3);
        TextView title = (TextView) findViewById(R.id.textViewToolbar), q = (TextView) findViewById(R.id.textViewQ);
        flag = 0;
        if (i < 9) {
            i++;
                title.setText("Întrebarea " + (i + 1));
                if (i == 1) {
                    img1.setImageResource(R.drawable.a2_1);
                    img2.setImageResource(R.drawable.a2_2);
                    img3.setImageResource(R.drawable.a2_3);
                    q.setText("Un taco este un fel de mâncare traditională din Mexic. Este în general cosumat fără ustentile și poate fi garnisit cu salsa, ardei iute, avocado, guacamole etc. Care e acesta?");
                }
                if (i == 2) {
                    img1.setImageResource(R.drawable.a3_1);
                    img2.setImageResource(R.drawable.a3_2);
                    img3.setImageResource(R.drawable.a3_3);
                    q.setText("Eggs Benedict este un dish consistent, care poate fi servit atât la micul dejun, cât și la prânz. Îl recunoști dintre cele 3?");
                }
                if (i == 3) {
                    img1.setImageResource(R.drawable.a4_1);
                    img2.setImageResource(R.drawable.a4_2);
                    img3.setImageResource(R.drawable.a4_3);
                    q.setText("Souvlaki este o mâncare de tip fast-food, cunoscută în Atena(Grecia) ca și kalamaki. Care e aceasta?");
                }
                if (i == 4) {
                    img1.setImageResource(R.drawable.a5_1);
                    img2.setImageResource(R.drawable.a5_2);
                    img3.setImageResource(R.drawable.a5_3);
                    q.setText("Care dintre aceste deserturi este Crème brûlée?");
                }
                if (i == 5) {
                    img1.setImageResource(R.drawable.a6_1);
                    img2.setImageResource(R.drawable.a6_2);
                    img3.setImageResource(R.drawable.a6_3);
                    q.setText("Toate aceste feluri de mâncare provin din Asia, ȋnsă doar unul dintre ele este sushi. Despre ce preparat e vorba?");
                }
                if (i == 6) {
                    img1.setImageResource(R.drawable.a7_1);
                    img2.setImageResource(R.drawable.a7_2);
                    img3.setImageResource(R.drawable.a7_3);
                    q.setText("Care dintre aceste preparate savuroase este un quiche?");
                }
                if (i == 7) {
                    img1.setImageResource(R.drawable.a8_1);
                    img2.setImageResource(R.drawable.a8_2);
                    img3.setImageResource(R.drawable.a8_3);
                    q.setText("Cum arată o Paella (dish originar din Spania)?");
                }
                if (i == 8) {
                    img1.setImageResource(R.drawable.a9_1);
                    img2.setImageResource(R.drawable.a9_2);
                    img3.setImageResource(R.drawable.a9_3);
                    q.setText("Cum arată pastele Farfalle?");
                }
                if (i == 9) {
                    img1.setImageResource(R.drawable.a10_1);
                    img2.setImageResource(R.drawable.a10_2);
                    img3.setImageResource(R.drawable.a10_3);
                    q.setText("Acest răsfăț dulce se prepară din făină de migdale. Despre care dintre ele este vorba?");
                } }
        else {
            Intent intent = new Intent(ContinutChestionar.this, EndChestionar.class);
            intent.putExtra("raspC", raspCorecte);
            startActivity(intent);
        }
    }
}
