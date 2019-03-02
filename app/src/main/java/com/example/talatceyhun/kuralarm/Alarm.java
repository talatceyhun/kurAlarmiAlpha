package com.example.talatceyhun.kuralarm;

/**
 * Created by talatceyhun on 13.03.2018.
 */

public class Alarm {
    private String kur1;
    private String kur2;
    private double oran;


    public Alarm(){
        this.kur1="";
        this.kur2="";
        this.oran=0;

    }

    public Alarm(String kur1, String kur2,double oran) {
        this.kur1 = kur1;
        this.kur2 = kur2;
        this.oran = oran;
    }

    public String getKur1() {
        return kur1;
    }

    public void setKur1(String kur1) {
        this.kur1 = kur1;
    }

    public String getKur2() {
        return kur2;
    }

    public void setKur2(String kur2) {
        this.kur2 = kur2;
    }

    @Override
    public String toString() {
        return
                 kur1 + " / " +
                 kur2 + "   "+oran;
    }
}
