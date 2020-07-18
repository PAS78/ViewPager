package ru.samsung.itacademy.mdev.vpager2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//а это тот же самый адаптер, который управляет рецикличными списками
public class MyAdapter extends RecyclerView.Adapter {
    //данные для заполнения элементов пейджера
    String []year = {"2014", "2015", "2016", "2017", "2018", "2019"};
    int []photo = {R.drawable.t2014, R.drawable.tort, R.drawable.t2016, R.drawable.t2017, R.drawable.t2018,  R.drawable.t2019};
    Context context; //раз нет фрагмента, то нужно указать, где будет работать пейджер

    //конструктор адаптера
public MyAdapter(Context context){
    this.context = context;}

    //создаём держатель контента - имитатор фрагмента, раздуваем из разметки cake.xml
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
           View content = (LayoutInflater.from(parent.getContext())).inflate(R.layout.cake,parent,false);
           return new MyHolder(content);
    }

    //заполняем элемент пейджера (полученный от holder'а в методе onCreateViewHolder) данными из массивов
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((TextView)(holder.itemView.findViewById(R.id.year))).setText(year[position]);// год
        ((ImageView)(holder.itemView.findViewById(R.id.photo))).setImageResource(photo[position]);//фото
    }

    @Override
    public int getItemCount() {return 6;}

    //RecyclerView.ViewHolder - абстрактный класс, по этому для создания экземпляров делаем наследника
     private  class MyHolder extends RecyclerView.ViewHolder{
      public MyHolder(@NonNull View itemView) {
        super(itemView);
    }
     }
}
