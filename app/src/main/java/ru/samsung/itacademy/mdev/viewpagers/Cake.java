package ru.samsung.itacademy.mdev.viewpagers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Cake extends Fragment {
    TextView year;
    ImageView photo;

    public Cake() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cake,container,false);
        Bundle content = getArguments();
        year = view.findViewById(R.id.year);
        year.setText(content.getString("year"));
        photo = view.findViewById(R.id.photo);
        photo.setImageResource(content.getInt("photo"));
        return view;
    }
}
