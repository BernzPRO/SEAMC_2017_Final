package com.example.seongbincho.seamc_2017_final.Schedule;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

import com.example.seongbincho.seamc_2017_final.R;


@SuppressWarnings("deprecation")
public class tabactivity extends TabActivity {

    TabHost TabHostWindow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablayout);


        //Assign id to Tabhost.
        TabHostWindow = (TabHost)findViewById(android.R.id.tabhost);

        //Creating tab menu.
        TabSpec TabMenu1 = TabHostWindow.newTabSpec("First day");
        TabSpec TabMenu2 = TabHostWindow.newTabSpec("Second day");
        TabSpec TabMenu3 = TabHostWindow.newTabSpec("Third day");
        TabSpec TabMenu4 = TabHostWindow.newTabSpec("Fourth Tab");

        //Setting up tab 1 name.
        TabMenu1.setIndicator("Day1");
        //Set tab 1 activity to tab 1 menu.
        TabMenu1.setContent(new Intent(this,schedule_listview.class));

        //Setting up tab 2 name.
        TabMenu2.setIndicator("Day2");
        //Set tab 3 activity to tab 1 menu.
        TabMenu2.setContent(new Intent(this,day2_listview.class));

        //Setting up tab 3 name.
        TabMenu3.setIndicator("Day3");
        //Set tab 3 activity to tab 3 menu.
        TabMenu3.setContent(new Intent(this,day3_listview.class));

        //Setting up tab 3 name.
        TabMenu4.setIndicator("Day4");
        //Set tab 3 activity to tab 4 menu.
        TabMenu4.setContent(new Intent(this,day4_listview.class));



        //Adding tab1, tab2, tab3 to tabhost view.

        TabHostWindow.addTab(TabMenu1);
        TabHostWindow.addTab(TabMenu2);
        TabHostWindow.addTab(TabMenu3);
        TabHostWindow.addTab(TabMenu4);

    }

}