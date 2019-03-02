package com.example.talatceyhun.kuralarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class AlarmlarActivity extends AppCompatActivity {
    static Alarm selectedAlarm;
    public static ArrayList<Alarm> alarmlar = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarmlar);





        ListView alarmListesi = findViewById(R.id.alarmListesi);
        //Alarm a = new Alarm("usd","tl",2.0);
        //alarmlar.add(a);


        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,
                alarmlar);
        alarmListesi.setAdapter(arrayAdapter);

        alarmListesi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(getApplicationContext(),TiklananActivity.class);
                startActivity(intent);
                selectedAlarm = alarmlar.get(position);

            }
        });




    }

}
