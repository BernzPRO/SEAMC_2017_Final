package com.example.seongbincho.seamc_2017_final.contact;

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

public class contact_adapter extends BaseAdapter {
    private Context mContext;
    private List<contactlis> mContactList;

    //Constructor

    public contact_adapter(Context mContext, List<contactlis> mContactList){
        this.mContext = mContext;
        this.mContactList = mContactList;
    }

    @Override
    public int getCount() {
        return mContactList.size();
    }

    @Override
    public Object getItem(int position) {
        return mContactList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.contact_list, null);
        TextView activitystname = (TextView)v.findViewById(R.id.activity_stname);
        TextView activityststatus = (TextView)v.findViewById(R.id.activity_ststatus);
        TextView activitystphonenumber = (TextView)v.findViewById(R.id.activity_stphonenumber);
        TextView activitystemail = (TextView)v.findViewById(R.id.activity_stemail);
        //Set text for TextView
        activitystname.setText(mContactList.get(position).getStname());
        activityststatus.setText(mContactList.get(position).getStstatus());
        activitystphonenumber.setText(mContactList.get(position).getStphonenumber());
        activitystemail.setText(mContactList.get(position).getStemail());


        //Save product id to tag
        v.setTag(mContactList.get(position).getId());

        return v;
    }
}

