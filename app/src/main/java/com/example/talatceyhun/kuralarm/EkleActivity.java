package com.example.talatceyhun.kuralarm;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import static com.example.talatceyhun.kuralarm.KurOranlari.oran;

public class EkleActivity extends AppCompatActivity {

    //TextView oranText;
    Button buton;
    EditText miktarText;

    Spinner kur1;
    Spinner kur2;
    String kurPay;
    String kurPayda;
    String AlarmOran;
    double oran1;
    final String[] kurlar = {"USD", "TRY", "EUR", "GBP"};
    final String[] kurlar2 = {"USD", "TRY", "EUR", "GBP"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekle);
        String oran;



        kur1 =  findViewById(R.id.spinnerKur1);
        kur2 =  findViewById(R.id.spinnerKur2);
        buton = findViewById(R.id.buttonOran);
        miktarText = findViewById(R.id.miktarText);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1
                , kurlar);
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1
                , kurlar2);
        kur1.setAdapter(arrayAdapter);
        kur2.setAdapter(arrayAdapter2);
        kur1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                kurPay = kurlar[position];

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        kur2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                kurPayda = kurlar2[position];

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });





    }

        public void cevir(View v) {


            /*KurOranlari kurOranlari = new KurOranlari();
            oran = kurOranlari.getRates(kurPay, kurPayda);
            new CountDownTimer(2000, 1000) {

                public void onTick(long millisUntilFinished) {

                }

                public void onFinish() {
                    //oranText.setText(oran);
                    buton.setText(oran);
                }
            }.start();*/

            AlarmOran = miktarText.getText().toString();
            oran1 = Double.parseDouble(AlarmOran);
            Alarm alarm = new Alarm(kurPay,kurPayda,oran1);
            AlarmlarActivity.alarmlar.add(alarm);





    }


    }



