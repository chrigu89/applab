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
		super.setIntegerProperty("splashscreen", R.drawable.splash);
		super.loadUrl("file:///android_asset/www/index.html", 3000);
	}

}
