package com.mobile.deny.kepegawaian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerMainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<DataPegawai> dataPegawai;
    DataPegawai DetailDataPegawai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_main);
        recyclerView =(RecyclerView) findViewById(R.id.recyclerview);
        dataPegawai = new ArrayList<>();
        DetailDataPegawai = new DataPegawai("Mark Zuckerberg","Belajar Coding Android dengan bahasa JAVA",R.drawable.mark);
        dataPegawai.add(DetailDataPegawai);
        DetailDataPegawai = new DataPegawai("Mark Zuckerberg","Belajar Coding Android dengan bahasa JAVA",R.drawable.mark);
        dataPegawai.add(DetailDataPegawai);
        DetailDataPegawai = new DataPegawai("Mark Zuckerberg","Belajar Coding Android dengan bahasa JAVA",R.drawable.mark);
        dataPegawai.add(DetailDataPegawai);
        MyAdapter myAdapter = new MyAdapter(RecyclerMainActivity.this,dataPegawai);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(myAdapter);
    }
}
