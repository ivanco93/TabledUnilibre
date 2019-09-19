package com.example.tabledunilibre;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

public class Tab3Llamadas extends Fragment {
    GridView gv;
    String chatList[][] = {
            {"Luisa","14 de septiembre 2:56 p.m.","0"},
            {"Alejandro Leal","11 de septiembre 1:52 p.m.","0"},
            {"Mamá","11 de septiembre 1:36 p.m.","1"},
            {"Andres Cruz","8 de septimebre 12:50 p.m.","0"},
            {"Luisa","7 de septimebre 9:46 a.m.","1"},
            {"Mamá","5 de septimebre 2:18 p.m.","1"}
    };
    int flags[] = {R.drawable.call_1, R.drawable.chat6, R.drawable.call_2, R.drawable.chat4, R.drawable.call_1, R.drawable.call_2};
    int calltype[] = {R.drawable.phone_call, R.drawable.video_call};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab3llamadas, container, false);

        gv=(GridView) rootView.findViewById(R.id.gridChat);
        gv.setAdapter(new CustomAdapterCalls(getActivity(), chatList, flags, calltype));

        return rootView;
    }
}