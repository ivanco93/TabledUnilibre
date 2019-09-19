package com.example.tabledunilibre.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tabledunilibre.R;
import com.example.tabledunilibre.Tab1Contactos;
import com.example.tabledunilibre.Tab3Llamadas;
import com.example.tabledunilibre.Tab2OnLine;
import com.example.tabledunilibre.Tab4Bloqueados;

public class SectionsPagerAdapter extends FragmentPagerAdapter {
    @StringRes
    private static final int[] TAB_TITLES =
            new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3, R.string.tab_text_4};
    private final Context mContext;
    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Tab1Contactos tab1 = new Tab1Contactos();
                return tab1;
            case 1:
                Tab2OnLine tab2 = new Tab2OnLine();
                return tab2;
            case 2:
                Tab3Llamadas tab3 = new Tab3Llamadas();
                return tab3;
            case 3:
                Tab4Bloqueados tab4 = new Tab4Bloqueados();
                return tab4;
            default:
                return null;
        }
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }
    @Override
    public int getCount() {
        // Show 2 total pages.
        return 4;
    }
}