package ru.samsung.itacademy.mdev.vp2fragment;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

//в эту акивность в разметке встроен фрагмент, в котором размещён пейджер "нового поколения"
public class Container extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.container);
    }
}
