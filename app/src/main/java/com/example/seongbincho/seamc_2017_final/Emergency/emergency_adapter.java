package com.example.seongbincho.seamc_2017_final.Emergency;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.seongbincho.seamc_2017_final.R;

import java.util.List;

/**
 * Created by seongbincho on 12/31/16.
 */

public class emergency_adapter extends BaseAdapter {
    private Context mContext;
    private List<emergencylis> mEmergencyList;

    //Constructor

    public emergency_adapter(Context mContext, List<emergencylis> mEmergencyList){
        this.mContext = mContext;
        this.mEmergencyList = mEmergencyList;
    }

    @Override
    public int getCount() {
        return mEmergencyList.size();
    }

    @Override
    public Object getItem(int position) {
        return mEmergencyList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.emergency_list, null);
        TextView activityEmname = (TextView)v.findViewById(R.id.activity_emname);
        TextView activityStatus = (TextView)v.findViewById(R.id.activity_status);
        TextView activityPhonenumber = (TextView)v.findViewById(R.id.activity_phonenumber);
        //Set text for TextView
        activityEmname.setText(mEmergencyList.get(position).getEmname());
        activityStatus.setText(mEmergencyList.get(position).getStatus());
        activityPhonenumber.setText(mEmergencyList.get(position).getPhonenumber());

        //Save product id to tag
        v.setTag(mEmergencyList.get(position).getId());

        return v;
    }
}

