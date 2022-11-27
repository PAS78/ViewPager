package ru.samsung.itacademy.mdev.vpager2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

//если работать без фрагментов с ViewPager2, то будем работать с адаптером RecyclerView
//то есть этот адаптер считает "новый пейджер" за своего
public class VPwithRecycler extends AppCompatActivity {
    ViewPager2 vp;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_pwith_recycler);
        vp = findViewById(R.id.vp);
        myAdapter = new MyAdapter(this);
        vp.setAdapter(myAdapter);

    }
}
