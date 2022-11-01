package com.tugas3.tugas5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recylerView;
    String s1[], s2[];
    int images[] =
            {R.drawable.sunn,R.drawable.awan};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recylerView = findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.cuaca);
        s2 = getResources().getStringArray(R.array.deskripsi);
        CuacaAdapter appAdapter = new
                CuacaAdapter(this,s1,s2,images);
        recylerView.setAdapter(appAdapter);
        recylerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
