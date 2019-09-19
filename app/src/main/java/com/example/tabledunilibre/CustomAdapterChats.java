package com.example.tabledunilibre;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CustomAdapterChats extends BaseAdapter {
    Context context;
    String chatList[][];
    int photos[];
    LayoutInflater inflter;

    public CustomAdapterChats(Context applicationContext, String[][] chatList, int[] photos) {
        this.context = context;
        this.chatList = chatList;
        this.photos = photos;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return chatList.length;
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
        view = inflter.inflate(R.layout.activity_chats, null);
        TextView country = (TextView) view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        TextView msg = (TextView) view.findViewById(R.id.textMsg);
        country.setText(chatList[i][0]);
        icon.setImageResource(photos[i]);
        msg.setText(chatList[i][1]);
        return view;
    }
}