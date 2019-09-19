package com.example.tabledunilibre;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

public class Tab2OnLine extends Fragment {
    GridView gv;
    String chatList[][] = {
            {"Natalia Romero","Hoy, 5:51 AM",""},
            {"Jacosam Games","Ayer, 11:48 PM",""},
            {"Profesor Universidad","Ayer, 9:56 PM",""},
            {"Wilson Diaz","Ayer, 6:30 PM",""},
            {"Camila Cardenas","Ayer, 5:31 PM",""},
            {"Alejandro Leal","Ayer, 5:12 PM",""}
    };
    int flags[] = {R.drawable.state_1, R.drawable.state_2, R.drawable.state_3, R.drawable.state_4, R.drawable.state_5, R.drawable.state_3};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2online, container, false);

        gv=(GridView) rootView.findViewById(R.id.gridStatus);
        gv.setAdapter(new CustomAdapterStatus(getActivity(), chatList, flags));

        return rootView;
    }
}