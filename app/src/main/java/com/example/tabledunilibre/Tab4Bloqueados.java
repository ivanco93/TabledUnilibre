package com.example.tabledunilibre;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

public class Tab4Bloqueados extends Fragment {
    GridView gv;
    String chatList[] = {
        "Fredys Simanca",
        "Banco de Bogotá",
        "Stefania Ramirez",
        "Carlos Romero",
        "Diego Fernandez",
        "Camila Montenegro",
        "Papa María"
    };
    int flags[] = {R.drawable.default_user, R.drawable.default_user, R.drawable.default_user, R.drawable.default_user, R.drawable.default_user, R.drawable.default_user, R.drawable.default_user};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab4bloqueados, container, false);

        gv=(GridView) rootView.findViewById(R.id.gridChat);
        gv.setAdapter(new CustomAdapterLocked(getActivity(), chatList, flags));

        return rootView;
    }
}