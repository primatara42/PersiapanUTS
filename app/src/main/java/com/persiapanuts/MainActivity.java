package com.persiapanuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button btnPindah;
    EditText etNama;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPindah = findViewById(R.id.btn_pindah);
        etNama = findViewById(R.id.et_namaPeserta);
        Intent pindah = new Intent(MainActivity.this,MainActivity2.class);


        getSupportActionBar().setTitle("Layout Utama");



        btnPindah.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String nama = etNama.getText().toString();

                if(nama.equals(""))
                {
                    etNama.setError("Nama Harus Diisi!");
                }

                else
                {
                    Toast.makeText(MainActivity.this, "Anda Berhasil Login", Toast.LENGTH_SHORT).show();

                    pindah.putExtra("xNama", nama);
                    startActivity(pindah);
                }


            }
        });

    }
}
