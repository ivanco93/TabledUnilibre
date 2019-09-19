package com.example.tabledunilibre;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CustomAdapterLocked extends BaseAdapter {
    Context context;
    String lockedList[];
    int flags[];
    LayoutInflater inflter;

    public CustomAdapterLocked(Context applicationContext, String[] lockedList, int[] flags) {
        this.context = context;
        this.lockedList = lockedList;
        this.flags = flags;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return lockedList.length;
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
        view = inflter.inflate(R.layout.activity_locked, null);
        TextView country = (TextView) view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        TextView msg = (TextView) view.findViewById(R.id.textMsg);
        country.setText(lockedList[i]);
        icon.setImageResource(flags[i]);
        //msg.setText(countryList[i][1]);
        msg.setText("No puede visualizar los mensajes hasta desb...");
        return view;
    }
}