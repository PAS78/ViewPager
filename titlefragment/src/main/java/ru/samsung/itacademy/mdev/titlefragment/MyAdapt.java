package ru.samsung.itacademy.mdev.titlefragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class MyAdapt extends FragmentStatePagerAdapter {
    String []year = {"2014", "2015", "2016", "2017", "2018", "2019"};
    int []photo = {R.drawable.t2014, R.drawable.tort, R.drawable.t2016, R.drawable.t2017, R.drawable.t2018,  R.drawable.t2019};
    public MyAdapt(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT); }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Bundle content = new Bundle();
        content.putInt("photo",photo[position]);
        content.putString("year",year[position]);
        Cake infoCake = new Cake();
        infoCake.setArguments(content);
        return infoCake;
    }

    @Override
    public int getCount() {
        return year.length;
    }

    // что отображать в таблице заголовков
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return "ТОРТ " + year[position] + " ГОДА";
    }
}
