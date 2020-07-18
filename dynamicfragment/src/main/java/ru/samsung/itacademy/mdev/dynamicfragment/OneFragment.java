package ru.samsung.itacademy.mdev.dynamicfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class OneFragment extends AppCompatActivity {
    ViewPager vp;
    MyAdapt adapt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_fragment);
        vp=findViewById(R.id.vp);
        adapt = new MyAdapt(getSupportFragmentManager());
        vp.setAdapter(adapt);

    }
}
