package com.example.android.quakereport;

import java.util.Date;

/**
 * Created by PC on 13-12-2016.
 */

public class EarthQuake {

    private double scaleEarthQuake;
    private String placeEarthQuake;
    private long dateEarthQuake;

    public EarthQuake(double scaleEarthQuake, String placeEarthQuake, long dateEarthQuake) {
        this.scaleEarthQuake = scaleEarthQuake;
        this.placeEarthQuake = placeEarthQuake;
        this.dateEarthQuake = dateEarthQuake;
    }

    public double getScaleEarthQuake() {
        return scaleEarthQuake;
    }

    public void setScaleEarthQuake(double scaleEarthQuake) {
        this.scaleEarthQuake = scaleEarthQuake;
    }

    public String getPlaceEarthQuake() {
        return placeEarthQuake;
    }

    public void setPlaceEarthQuake(String placeEarthQuake) {
        this.placeEarthQuake = placeEarthQuake;
    }

    public long getDateEarthQuake() {
        return dateEarthQuake;
    }

    public void setDateEarthQuake(long dateEarthQuake) {
        this.dateEarthQuake = dateEarthQuake;
    }
}
