package ru.samsung.itacademy.mdev.dynamicfragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

//фрагмент, вставляемый в пейджер. Разметка описана в cake.xml
public class Cake extends Fragment {
    TextView year;
    ImageView photo;
    public Cake(){};

    //создаём и заполняем разметку для текущего элемента
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cake,container,false);
        Bundle content = getArguments(); //получаем из адаптера контент для заполнения полей разметки
        year = view.findViewById(R.id.year); //текстовое поле
        year.setText(content.getString("year")); //заполняем данными из а-списка по ключу year
        photo = view.findViewById(R.id.photo); // поле для картинки
        photo.setImageResource(content.getInt("photo")); //заполняем данными по ключу photo
        return view;
    }

}
