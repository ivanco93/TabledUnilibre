package com.example.tabledunilibre;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CustomAdapterStatus extends BaseAdapter {
    Context context;
    String countryList[][];
    int flags[];
    LayoutInflater inflter;

    public CustomAdapterStatus(Context applicationContext, String[][] countryList, int[] flags) {
        this.context = context;
        this.countryList = countryList;
        this.flags = flags;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return countryList.length;
    }

    @Override

    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_status, null);
        TextView country = (TextView) view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        TextView msg = (TextView) view.findViewById(R.id.textMsg);
        TextView tittle = (TextView)view.findViewById(R.id.textViewTitleRecent);
        LinearLayout layoutUserProfile = (LinearLayout)view.findViewById(R.id.layoutUserProfile);
        if(i>0) {
            tittle.setVisibility(View.GONE);
            layoutUserProfile.setVisibility(View.GONE);
        }

        country.setText(countryList[i][0]);
        icon.setImageResource(flags[i]);
        msg.setText(countryList[i][1]);
        return view;
    }
}