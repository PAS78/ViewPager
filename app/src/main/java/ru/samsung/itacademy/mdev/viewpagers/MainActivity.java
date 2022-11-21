package ru.samsung.itacademy.mdev.viewpagers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import ru.samsung.itacademy.mdev.viewpagers.Adapter.MyPagerAdapter;

public class MainActivity extends AppCompatActivity {

    // Создаем Пейджер (как поле класса)
    ViewPager vp;
    // Создаем Адаптер
    MyPagerAdapter myAdapter = new MyPagerAdapter(MainActivity.this);;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp = findViewById(R.id.vp);

        // Вешаем Адаптер на Пейджер
        vp.setAdapter(myAdapter);

    }
}