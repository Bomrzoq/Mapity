package io.indoorlocation.gps.demoapp;

import android.app.Application;

import com.mapbox.mapboxsdk.Mapbox;

import io.mapwize.mapwizesdk.core.MapwizeConfiguration;


public class GPSIndoorLocationProviderDemoApplication extends Application {

    // This is a demo key, giving you access to the demo building. It is not allowed to use it for production.
    // The key might change at any time without notice. Get your key by signin up at mapwize.io
    static final String MAPWIZE_API_KEY = "6ceac376a3a48bd5f0a77dad6c9e65ec";


    @Override
    public void onCreate() {
        super.onCreate();
        Mapbox.getInstance(this, "pk.mapwize");
        // Mapwize globale initialization
        MapwizeConfiguration config = new MapwizeConfiguration.Builder(this, MAPWIZE_API_KEY).build();
        MapwizeConfiguration.start(config);
    }

}
