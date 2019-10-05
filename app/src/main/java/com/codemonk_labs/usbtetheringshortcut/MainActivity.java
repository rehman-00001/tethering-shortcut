package com.codemonk_labs.usbtetheringshortcut;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.launchSettingsScreen(getApplicationContext());
        finish();
    }

}
