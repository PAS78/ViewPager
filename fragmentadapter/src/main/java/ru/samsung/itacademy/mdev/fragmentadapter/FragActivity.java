package ru.samsung.itacademy.mdev.fragmentadapter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;

//КАЖДЫЙ ФРАГМЕНТ В ЭТОМ МОДУЛЕ ХРАНИТСЯ В ПАМЯТИ ВО ВРЕМЯ РАБОТЫ ПРИЛОЖЕНИЯ.
//ЧЕМ БОЛЬШЕ ФРАГМЕНТОВ, ТЕМ МЕНЬШЕ ПРИЛОЖЕНИЙ БУДУТ РАБОТАТЬ НА ВАШЕМ УСТРОЙСТВЕ
//И ТЕМ БОЛЬШЕ ЭТО ПРИЛОЖЕНИЕ БУДЕТ "ТОРМОЗИТЬ"
//НО ДЛЯ 2-4 ЭЛЕМЕНТОВ ИСПОЛЬЗОВАТЬ МОЖНО, МОЖЕТ И ПОБОЛЬШЕ...
public class FragActivity extends AppCompatActivity {
    ViewPager vp;
    MyAdapt adapt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag);
        vp = findViewById(R.id.vp);
        adapt = new MyAdapt(getSupportFragmentManager());
        vp.setAdapter(adapt);
    }
    // public static class MyAdapt extends FragmentPagerAdapter { ничего не меняет, будет то же самое.
    // По этому в ViewPager2 остался только один адаптер FragmentStateAdapter
    public static class MyAdapt extends FragmentStatePagerAdapter {

        // для androidx в конструктор родителя добавлен аргумент для указания поведения пейджера
        public MyAdapt(@NonNull FragmentManager fm) {
            super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        }

        //в зависимости от позиции в пейджере отображается соответственный элемент
        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0: return new Cake();
                case 1: return new Cake2();
                case 2: return new Cake3();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        } //количество экранов пейджера
    }
}
