package ru.samsung.itacademy.mdev.myapplicatio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

class MyAdapter extends PagerAdapter {
    // контент для выгрузки в текстовое поле пейджера
    String[] year = {"2014", "2015","2016","2017","2018", "2019"};
    // контент для выгрузки в поле картинок ImageView пейджера
    int photo[] ={R.drawable.t2014, R.drawable.tort, R.drawable.t2016, R.drawable.t2017, R.drawable.t2018,  R.drawable.t2019};
    Context context; //окружение для работы пейджера, поскольку фрагмент отсутствует.

    //конструктор для адаптера
    public MyAdapter(Context context) {
            this.context = context;
    }

    //выгружаем в пейджер разметку для каждого отдельного элемента и заполняем содержимым
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View content = inflater.inflate(R.layout.cake,container,false); //создали контейнер
        ((TextView)content.findViewById(R.id.year)).setText(year[position]); // заполнили текстовое поле значением
        ((ImageView)content.findViewById(R.id.photo)).setImageResource(photo[position]);// вставили картинку
        container.addView(content); //вставили контейнер в пейджер
        return  content;
    }

    //при смене позиции предыдущий контент удаляется
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
      container.removeView((LinearLayout)object);
    }

    //сколько элементов отображает пейджер
    @Override
    public int getCount() {
        return year.length;
    }

    //проверка на совпадение формы контейнера из разметки cake.xml и вставляемого из instantiateItem элемента
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }
}
