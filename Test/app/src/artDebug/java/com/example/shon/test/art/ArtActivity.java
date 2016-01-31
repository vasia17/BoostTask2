package com.example.shon.test.art;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;
import com.example.shon.test.MainActivity;

public class ArtActivity extends MainActivity implements RecyclerViewAdapter.OnItemClickListener{

    private RecyclerView myRecyclerView;
    private LinearLayoutManager linearLayoutManager;
    private RecyclerViewAdapter myRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_art);
        myRecyclerView = new RecyclerView(this);
        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        myRecyclerViewAdapter = new RecyclerViewAdapter(this);
        myRecyclerViewAdapter.setOnItemClickListener(this);
        myRecyclerView.setAdapter(myRecyclerViewAdapter);
        myRecyclerView.setLayoutManager(linearLayoutManager);

        setContentView(myRecyclerView);
        int catnamesSize = catnames.length;
        int num = 0;
        while (num != catnamesSize) {
            myRecyclerViewAdapter.add(num, catnames[num]);
            num++;
        }

    }

    @Override
    public void onItemClick(RecyclerViewAdapter.ItemHolder item, int position) {
        Toast.makeText(this,
                position + " : " + item.getItemName(),
                Toast.LENGTH_SHORT).show();
    }
}