package de.thenetworks.applab;

import org.apache.cordova.DroidGap;

import android.os.Bundle;
import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends DroidGap {
    @Override
public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("http://applab.thenetworks.de/index.html");
        //setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
