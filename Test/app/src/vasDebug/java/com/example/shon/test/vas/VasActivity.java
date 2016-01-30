package com.example.shon.test.vas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.shon.test.R;

public class VasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vas);
        // получаем экземпляр элемента
        ListView listView = (ListView)findViewById(R.id.listView);
        // определяем массив типа String
        final String[] catnames = new String[] { "Я", "Знаю", "Як", "Вивести", "Текст", "В", "ListView", "Через", "ArrayAdapter"};
        // используем адаптер данных
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, catnames);
        listView.setAdapter(adapter);
    }

}
