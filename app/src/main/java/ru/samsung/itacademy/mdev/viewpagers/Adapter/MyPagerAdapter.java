package ru.samsung.itacademy.mdev.viewpagers.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import ru.samsung.itacademy.mdev.viewpagers.R;

// Для упраления пейджером нужен (создаем) Адаптер

public class MyPagerAdapter extends PagerAdapter {

    // Добавлеям данные (контент)
    String[] year = {"14", "15", "16", "17", "18", "19"};
    int photo[] = {R.drawable.t2014, R.drawable.tort, R.drawable.t2016, R.drawable.t2017, R.drawable.t2018, R.drawable.t2019};

    // Т.к. не используем фрагмент - нужно будет передавать Контекст
    Context context;

    // Конструктор Адаптера по Контексту
    public MyPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return photo.length;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        // Создаем наш Layout
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // Создаём нашу View и раздуваем из Cake.xml
        // Сажаем в контейнер и не прикрепляем к корню
        View view = layoutInflater.inflate(R.layout.cake, container, false);
        // Теперь можно использовать поля из view (заполняем контент данными)
        TextView tv = view.findViewById(R.id.year);
        tv.setText(year[position]);
        ImageView imageView = view.findViewById(R.id.photo);
        imageView.setImageResource(photo[position]);
        // Сажаем view в наш Контейнер ViewGroup
        container.addView(view);

        // Возращаем view
        return view;
    }

    // Для удаления (выгрузки) неиспользуемых элементов из контейнеров
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
}
