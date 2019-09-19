package com.example.tabledunilibre;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Tab1Contactos extends Fragment {

    GridView gv;
    String chatList[][] = {
            {"David Fonseca","Ok parce gracias",""},
            {"Tito Mantenimiento","Buen dia Ivan",""},
            {"+57 313  76134006877","Gracias",""},
            {"Universidad Libre I S","+57 300 3619443 salió del grupo",""},
            {"Andres Cruz","En la tarde como el sabado tenemos manten...",""},
            {"+57 311  2306877","Ah bueno primo. Allá estaremos",""},
            {"Alejandro Leal","Jajajajaja de una",""},
            {"Papá","ok",""}
    };
    int flags[] = {R.drawable.chat1, R.drawable.chat2, R.drawable.default_user, R.drawable.chat3, R.drawable.chat4, R.drawable.chat5, R.drawable.chat6, R.drawable.default_user};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1contactos, container, false);

        gv=(GridView) rootView.findViewById(R.id.gridChat);
        gv.setAdapter(new CustomAdapterChats(getActivity(), chatList, flags));

        return rootView;
    }


}