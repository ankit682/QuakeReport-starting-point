package com.example.android.quakereport;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by PC on 13-12-2016.
 */

public class EarthQuakeAdapter extends ArrayAdapter<EarthQuake> {


    public EarthQuakeAdapter(Context context, ArrayList<EarthQuake> earthQuakeArrayList){
        super(context, 0 , earthQuakeArrayList);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        EarthQuake currentEarthQuake = getItem(position);

        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.word_content,parent, false);
        }

        TextView scaleView = (TextView) listItemView.findViewById(R.id.scale_earthquake);
        scaleView.setText(currentEarthQuake.getScaleEarthQuake());

        TextView placeView = (TextView) listItemView.findViewById(R.id.place_earthquake);
        placeView.setText(currentEarthQuake.getPlaceEarthQuake());

        TextView dateView = (TextView) listItemView.findViewById(R.id.date_earthquake);
        dateView.setText(currentEarthQuake.getDateEarthQuake());

        return listItemView;
    }
}
