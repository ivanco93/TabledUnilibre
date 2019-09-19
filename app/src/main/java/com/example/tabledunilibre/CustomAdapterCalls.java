package com.example.tabledunilibre;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CustomAdapterCalls extends BaseAdapter {
    Context context;
    String countryList[][];
    int flags[];
    int calltype[];
    LayoutInflater inflter;


    public CustomAdapterCalls(Context applicationContext, String[][] countryList, int[] flags, int[] calltype) {
        this.context = context;
        this.countryList = countryList;
        this.flags = flags;
        this.calltype = calltype;
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
        view = inflter.inflate(R.layout.activity_calls, null);
        TextView country = (TextView) view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        TextView msg = (TextView) view.findViewById(R.id.textMsg);
        ImageView calltypeIcon = (ImageView) view.findViewById(R.id.callType);

        int calltypeData = Integer.parseInt(countryList[i][2]);

        country.setText(countryList[i][0]);
        icon.setImageResource(flags[i]);
        calltypeIcon.setImageResource(calltype[calltypeData]);
        msg.setText(countryList[i][1]);

        return view;
    }
}