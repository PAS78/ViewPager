package ru.samsung.itacademy.mdev.vp2fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

//адаптер пейджера "нового поколения", главной заслугой которого считается возможность выбора направления прокрутки
//один новый, заменивший сразу двух старых: FragmentPagerAdapter и FragmentStatePagerAdapter
public class MyAdapter extends FragmentStateAdapter {
    String []year = {"2014", "2015", "2016", "2017", "2018", "2019"};
    int []photo = {R.drawable.t2014, R.drawable.tort, R.drawable.t2016, R.drawable.t2017, R.drawable.t2018,  R.drawable.t2019};

    //конструктор теперь принимает не менеджера фрагментов, а сам фрагмент.
    //значит, отпадает необходимость указания поведения фрагментов
    public MyAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    //и еперь фрагмент является не "начинкой" элемента пейджера, а самим элементом
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Bundle content = new Bundle();
        content.putInt("photo",photo[position]);
        content.putString("year",year[position]);
        Cake infoCake = new Cake();
        infoCake.setArguments(content);
        return infoCake;
    }

    // наверное, за компанию переименовали метод, чтобы совсем всё было новым
    @Override
    public int getItemCount() {
        return year.length;
    }
}
