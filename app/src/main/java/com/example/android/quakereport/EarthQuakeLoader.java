package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Created by PC on 16-12-2016.
 */

public class EarthQuakeLoader extends AsyncTaskLoader<List<EarthQuake>> {

    // Tag for log messages
    private static final String LOG_TAG = EarthQuakeLoader.class.getName();

    /** Query URL */
    private String url;

    public EarthQuakeLoader(Context context, String url) {
        super(context);
        this.url = url;
    }

    @Override
    public List<EarthQuake> loadInBackground() {
        Log.i(LOG_TAG, "loadBackground() called");

        if (url == null){
            return null;
        }

        List<EarthQuake> earthQuakes = QueryUtils.fetchEarthQuakeData(url);

        return earthQuakes;
    }

    @Override
    protected void onStartLoading() {
        Log.i(LOG_TAG, "onStartLoading() called");
        forceLoad();
    }
}
