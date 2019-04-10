package com.example.luthfi.motionstudygroup2fix;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.luthfi.motionstudygroup2fix.Adapter.ListMenuAdapter;
import com.example.luthfi.motionstudygroup2fix.model.Makanan;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Makanan> makananList = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecyclerView.Adapter rcAdapter;
    private RecyclerView.LayoutManager rcLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_list_makanan);
        makananList.add(new Makanan("Ayam Bakar", 10000));
        makananList.add(new Makanan("Ayam Goreng", 10000));
        makananList.add(new Makanan("Bebek Bakar", 10000));
        makananList.add(new Makanan("Bebek Goreng", 10000));
        makananList.add(new Makanan("Lele Bakar", 10000));
        makananList.add(new Makanan("Lele Goreng", 10000));
        makananList.add(new Makanan("Tahu Bakar", 10000));
        makananList.add(new Makanan("Tahu Goreng", 10000));
        makananList.add(new Makanan("Tempe Bakar", 10000));
        makananList.add(new Makanan("Tempe Goreng", 10000));

        rcAdapter = new ListMenuAdapter(this, makananList);
        rcLayoutManager = new LinearLayoutManager(this
                , LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(rcLayoutManager);
        recyclerView.setAdapter(rcAdapter);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("ListMenu");


    }
}
