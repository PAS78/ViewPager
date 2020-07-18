package ru.samsung.itacademy.mdev.fragmentadapter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

//третий (заключительный) фрагмент. Ещё с одним тортиком.
//При желании можете добавить ещё фрагментов с новыми тортиками :)
public class Cake3 extends Fragment {
    public Cake3() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.cake3,container,false);
    }
}
