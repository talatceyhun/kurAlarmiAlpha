package com.example.talatceyhun.kuralarm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class GirisActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giris);
    }

    public void alarm(View view){

        Intent intent = new Intent(getApplicationContext(),AlarmlarActivity.class);
        startActivity(intent);

    }

    public void ekle(View view){
        Intent intent = new Intent(getApplicationContext(),EkleActivity.class);
        startActivity(intent);
    }

    public void canliTakip(View view){
        Intent intent = new Intent(getApplicationContext(),CanliTakipActivity.class);
        startActivity(intent);
    }

    public void ceviri(View view){
        Intent intent = new Intent(getApplicationContext(),CeviriActivity.class);
        startActivity(intent);
    }


}

