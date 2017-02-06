package com.example.seongbincho.seamc_2017_final;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.seongbincho.seamc_2017_final.Emergency.emergency_listview;
import com.example.seongbincho.seamc_2017_final.Schedule.tabactivity;
import com.example.seongbincho.seamc_2017_final.contact.contact_listview;


public class MainActivity extends AppCompatActivity {

    ImageButton myImageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myImageButton = (ImageButton) findViewById(R.id.imageButton1);
        myImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentLoadActivity = new Intent(MainActivity.this,tabactivity.class);
                startActivity(intentLoadActivity);
            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton4);
        myImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentLoadActivity = new Intent(MainActivity.this, map.class);
                startActivity(intentLoadActivity);
            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton7);
        myImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                String url ="https://www.facebook.com/SEAMC-Indonesia-2017-at-BSJ-156478228178226/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);

            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton3);
        myImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentLoadActivity = new Intent(MainActivity.this, news.class);
                startActivity(intentLoadActivity);
            }
        });


        myImageButton = (ImageButton) findViewById(R.id.imageButton5);
        myImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentLoadActivity = new Intent(MainActivity.this, contact_listview.class);
                startActivity(intentLoadActivity);
            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton6);
        myImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentLoadActivity = new Intent(MainActivity.this, emergency_listview.class);
                startActivity(intentLoadActivity);
            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton8);
        myImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intentLoadActivity = new Intent(MainActivity.this, leaderboard.class);
                startActivity(intentLoadActivity);
            }
        });

        myImageButton = (ImageButton) findViewById(R.id.imageButton2);
        myImageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String url ="https://drive.google.com";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });



    }
    int count=0;
    @Override
    public void onBackPressed() {
        if(count == 1)
        {
            count=0;
            finish();
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Press Back again to quit.", Toast.LENGTH_SHORT).show();
            count++;
        }

        return;

    }









}
