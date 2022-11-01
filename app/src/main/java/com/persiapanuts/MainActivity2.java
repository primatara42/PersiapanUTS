package com.persiapanuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tvNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        tvNama = findViewById(R.id.tv_nama);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       

    }
}