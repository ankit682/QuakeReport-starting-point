package com.example.android.quakereport;

import java.util.Date;

/**
 * Created by PC on 13-12-2016.
 */

public class EarthQuake {

    private double scaleEarthQuake;
    private String placeEarthQuake;
    private long dateEarthQuake;
    private String urlEarthQuake;

    public EarthQuake(double scaleEarthQuake, String placeEarthQuake, long dateEarthQuake, String urlEarthQuake) {
        this.scaleEarthQuake = scaleEarthQuake;
        this.placeEarthQuake = placeEarthQuake;
        this.dateEarthQuake = dateEarthQuake;
        this.urlEarthQuake = urlEarthQuake;
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

    public String getUrlEarthQuake() {
        return urlEarthQuake;
    }

    public void setUrlEarthQuake(String urlEarthQuake) {
        this.urlEarthQuake = urlEarthQuake;
    }
}
