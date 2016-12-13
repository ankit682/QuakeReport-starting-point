package com.example.android.quakereport;

import java.util.Date;

/**
 * Created by PC on 13-12-2016.
 */

public class EarthQuake {

    private String scaleEarthQuake;
    private String placeEarthQuake;
    private String dateEarthQuake;

    public EarthQuake(String scaleEarthQuake, String placeEarthQuake, String dateEarthQuake) {
        this.scaleEarthQuake = scaleEarthQuake;
        this.placeEarthQuake = placeEarthQuake;
        this.dateEarthQuake = dateEarthQuake;
    }

    public String getScaleEarthQuake() {
        return scaleEarthQuake;
    }

    public void setScaleEarthQuake(String scaleEarthQuake) {
        this.scaleEarthQuake = scaleEarthQuake;
    }

    public String getPlaceEarthQuake() {
        return placeEarthQuake;
    }

    public void setPlaceEarthQuake(String placeEarthQuake) {
        this.placeEarthQuake = placeEarthQuake;
    }

    public String getDateEarthQuake() {
        return dateEarthQuake;
    }

    public void setDateEarthQuake(String dateEarthQuake) {
        this.dateEarthQuake = dateEarthQuake;
    }
}
