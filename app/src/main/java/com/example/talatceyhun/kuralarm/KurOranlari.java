package com.example.talatceyhun.kuralarm;

import android.os.AsyncTask;
import android.view.View;

import org.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by talatceyhun on 13.03.2018.
 */

public class KurOranlari {
    public KurOranlari(){

    }
    static String oran;
    String secilenBase ;

    public String getRates(String secilenPay,String secilenPayda) {

        DownloadData downloadData = new DownloadData();

        try {

            String url = "http://api.fixer.io/latest?base=";
            String secilen1 = secilenPay;
            secilenBase = secilenPayda;
            downloadData.execute(url+secilen1);
            return oran;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }


    private class DownloadData extends AsyncTask<String, Void, String> {
        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            try {
                JSONObject jsonObject = new JSONObject(s);
                String base = jsonObject.getString("base");
                String rates = jsonObject.getString("rates");
                JSONObject jsonObject1 = new JSONObject(rates);
                oran = jsonObject1.getString(secilenBase);



            } catch (Exception e) {
                e.printStackTrace();
            }


        }

        @Override
        protected String doInBackground(String... params) {
            String result = "";
            URL url;
            HttpURLConnection httpURLConnection;
            try {
                url = new URL(params[0]);
                httpURLConnection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = httpURLConnection.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                int data = inputStreamReader.read();
                while (data > 0) {
                    char karakter = (char) data;
                    result += karakter;
                    data = inputStreamReader.read();
                }
                return result;

            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }
}







