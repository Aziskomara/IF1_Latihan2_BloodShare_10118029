package com.example.bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// NIM : 10118029
// Nama : Azis Komara
// Kelas : IF-1
// Tanggal : 39-04-2021

public class AlmoseThere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almose_there);

        Button btn_almosetthere = findViewById(R.id.btn_almoset_there);
        btn_almosetthere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(AlmoseThere.this,VerifyAccount.class);
                startActivity(intent3);
                finish();
            }
        });
    }
}