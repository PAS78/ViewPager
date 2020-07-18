package ru.samsung.itacademy.mdev.myapplicatio;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
//ПЕЙДЖЕР БЕЗ ИСПОЛЬЗОВАНИЯ ФРАГМЕНТОВ. ДЛЯ ВЫГРУЗКИ КОНТЕНТА В КОНТЕЙНЕР ИСПОЛЬЗУЕТСЯ PagerAdapter
public class VPnoFrag extends AppCompatActivity {
    ViewPager pager;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.no_frag);
        pager = findViewById(R.id.vp);
        adapter = new MyAdapter(VPnoFrag.this); //указываем, что пейджер будет работать в этой активности
        pager.setAdapter(adapter);
//pager.setCurrentItem(3); Можно при желании установить элемент, отображаемый при старте пейджера. По умолчанию установлен элемент с индексом 0.
    }
}
