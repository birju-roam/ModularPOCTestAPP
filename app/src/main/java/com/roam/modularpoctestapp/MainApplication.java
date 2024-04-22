package com.roam.modularpoctestapp;

import android.app.Application;

import com.roam.core.PublicClass;
import com.roam.feature1.PublicFeature1Class;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //initialize core module
        PublicClass.initialize(this);

        //initialize feature module
        PublicFeature1Class.initializeFeature1(this);
    }
}
