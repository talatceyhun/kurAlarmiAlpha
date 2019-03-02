package com.example.talatceyhun.kuralarm;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class CeviriActivity extends AppCompatActivity {

    final String[] kurlar = {"USD", "TRY", "EUR", "GBP"};
    final String[] kurlar2 = {"USD", "TRY", "EUR", "GBP"};
    Spinner kutu1;
    Spinner kutu2;
    String kurPay;
    String kurPayda;
    String oran;
    Button butonCevir;
    TextView sonuc;
    EditText miktar;
    double oranDouble;
    String sonucString;
    double paraMiktar;
    double sonucPara;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ceviri);

        butonCevir = findViewById(R.id.buttonCevir);
        sonuc = findViewById(R.id.textSonuc);
        miktar = findViewById(R.id.miktarText);
        kutu1 = findViewById(R.id.ceviri1);
        kutu2 = findViewById(R.id.ceviri2);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,kurlar);
        kutu1.setAdapter(arrayAdapter);
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,kurlar2);
        kutu2.setAdapter(arrayAdapter2);

        kutu1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                kurPay = kurlar[position];

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        kutu2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                kurPayda = kurlar2[position];

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });





    }
    public void cevir (View v){
        paraMiktar = Double.parseDouble(miktar.getText().toString());
        KurOranlari kurOranlari = new KurOranlari();
        oran = kurOranlari.getRates(kurPay, kurPayda);



        new CountDownTimer(3000, 1000){

            public void onTick(long millisUntilFinished) {

            }


            public void onFinish() {
                oranDouble = Double.parseDouble(oran);
                sonucPara = paraMiktar*oranDouble;
                sonucString = String.valueOf(sonucPara);




            }
        }.start();


        sonuc.setText(sonucString);



    }



}
