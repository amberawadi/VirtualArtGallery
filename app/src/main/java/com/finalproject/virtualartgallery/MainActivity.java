package com.finalproject.virtualartgallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exploreGallery(View view) {
        Intent i = new Intent(this, ArtworkList.class);
        startActivity(i);
    }

    public void submitArt(View view) {
        Intent i = new Intent(this, ArtRegistration.class);
        startActivity(i);
    }

}