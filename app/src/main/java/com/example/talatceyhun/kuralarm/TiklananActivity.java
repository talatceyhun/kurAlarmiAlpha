package com.example.talatceyhun.kuralarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TiklananActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiklanan);
        Alarm secilenAlarm= AlarmlarActivity.selectedAlarm;
        textView = (TextView) findViewById(R.id.alarmText);
        textView.setText(secilenAlarm.toString());

    }

    public void guncelle(View view){
        Intent intent = new Intent(getApplicationContext(),GuncellemeActivity.class);
        startActivity(intent);
    }


}
