package ru.samsung.itacademy.mdev.dynamicfragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class MyAdapt extends FragmentStatePagerAdapter {
    //Данные для заполнения контента
    String []year = {"2014", "2015", "2016", "2017", "2018", "2019"};
    int []photo = {R.drawable.t2014, R.drawable.tort, R.drawable.t2016, R.drawable.t2017, R.drawable.t2018,  R.drawable.t2019};

    //конструктор
    public MyAdapt(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);   }

    //создаём фрагмент на основе класса Cake.java
    @NonNull
    @Override
    public Fragment getItem(int position) {
        Bundle content = new Bundle(); //данные передаются в виде ассоциативного списка из элементов массивов с индексом position
        content.putInt("photo",photo[position]);// ключ - "photo", значение взято из массива photo
        content.putString("year",year[position]);// ключ - "year", значение взято из массива year
        Cake infoCake = new Cake(); //создаём фрагмент Cake.java
        infoCake.setArguments(content); //заполняем его поля значениями
        return infoCake; // передаём в onCreateView в Cake.java
    }

    @Override
    public int getCount() {
        return year.length;
    }// количество экранов пейджера
}
