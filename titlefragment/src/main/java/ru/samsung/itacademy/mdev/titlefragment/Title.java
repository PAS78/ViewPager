package ru.samsung.itacademy.mdev.titlefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class Title extends AppCompatActivity {
    ViewPager vp; //сам пейджер
    TabLayout tl; //строка заголовков для пейджера
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);
        vp = findViewById(R.id.vp);
        vp.setAdapter(new MyAdapt(getSupportFragmentManager()));
        tl = findViewById(R.id.tl);
        tl.setupWithViewPager(vp); //аставляем работать пейджер по заголовкам

    }
}
