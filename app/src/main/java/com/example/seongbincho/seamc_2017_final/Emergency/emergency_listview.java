package com.example.seongbincho.seamc_2017_final.Emergency;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.seongbincho.seamc_2017_final.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seongbincho on 12/31/16.
 */

public class emergency_listview extends Activity {
    private ListView lvEmergency;
    private emergency_adapter adapter;
    private List<emergencylis> mEmergencyList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_lis);

        lvEmergency = (ListView)findViewById(R.id.listview_emergency);

        mEmergencyList = new ArrayList<>();
        //Add sample data for list
        //We can get data from DB, webservice here
        mEmergencyList.add(new emergencylis(1, "International SOS", "Hospitals", "021 750 6001"));
        mEmergencyList.add(new emergencylis(2, "RS Premier Bintaro", "Hospitals", "021 7455 500 / 600 / 700"));
        mEmergencyList.add(new emergencylis(3, "RS Pondok Indah", "Hospitals","021 765 2565 / 750 2322"));
        mEmergencyList.add(new emergencylis(4, "Siloam Karawaci", "Hospitals","021 546 0055 / 546 0066"));
        mEmergencyList.add(new emergencylis(5, "Medistra Hospital", "Hospitals","021 521 0200"));
        mEmergencyList.add(new emergencylis(6, "Global Assistance & Healthcare", "Hospitals","021 2997 8988"));



        //Init adapter
        adapter = new emergency_adapter(getApplicationContext(),mEmergencyList);
        lvEmergency.setAdapter(adapter);



    }



}

