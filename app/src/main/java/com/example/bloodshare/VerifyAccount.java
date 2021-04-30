package com.example.bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// NIM : 10118029
// Nama : Azis Komara
// Kelas : IF-1
// Tanggal : 30-04-2021

public class VerifyAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_account);

        Button  btn_verify = findViewById(R.id.btn_verify_account);
        btn_verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(VerifyAccount.this,Home.class);
                startActivity(intent4);
                finish();
            }
        });
    }
}