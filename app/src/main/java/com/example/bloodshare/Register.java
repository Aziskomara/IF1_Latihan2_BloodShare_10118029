package com.example.bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

// NIM : 10118029
// Nama : Azis Komara
// Kelas : IF-1
// Tanggal : 28-04-2021

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ImageButton img_button = findViewById(R.id.register_imb_panah);
        img_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Register.this,MainActivity.class);
                startActivity(intent1);
                finish();
            }
        });


    }

    public void register(View view){
        Intent intent2 = new Intent(Register.this,AlmoseThere.class);
        startActivity(intent2);
        finish();

    }
}