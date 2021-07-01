package com.finalproject.virtualartgallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SubmissionNotice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submission_notice);
    }

    public void backToMenu (View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}