package com.roam.modularpoctestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.roam.core.PublicClass;
import com.roam.feature1.PublicFeature1Class;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btStart = findViewById(R.id.btStart);
        Button btStop = findViewById(R.id.btStop);
        Button btCustom = findViewById(R.id.btCustom);

        //start tracking by using core module method
        btStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PublicClass.startTracking();
            }
        });

        //stop tracking by using core module method
        btStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PublicClass.stopTracking();
            }
        });

        //send tracking data to custom MQTT sever by using feature1 module
        btCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PublicFeature1Class.setCustomMQTTConnector();
            }
        });
    }
}