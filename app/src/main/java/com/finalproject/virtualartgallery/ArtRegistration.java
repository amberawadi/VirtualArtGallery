package com.finalproject.virtualartgallery;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.material.snackbar.Snackbar;


public class ArtRegistration extends AppCompatActivity {

    private static final int uploadResultCode = 5;
    ImageView uploadedImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art_registration);
        uploadedImage = (ImageView) findViewById(R.id.uploadedImage);
    }

    public void searchImage(View view) {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, uploadResultCode);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == uploadResultCode && (resultCode == RESULT_OK) && (data != null)) {
            Uri selectedImage = data.getData();
            uploadedImage.setImageURI(selectedImage);
        }
    }

    public void submitWork(View view) {
        EditText artistName = findViewById(R.id.artistName);
        EditText artTitle = findViewById(R.id.artTitle);

        if ((artistName.getText() != null ) || (artTitle.getText() != null)) {

            Intent i = new Intent(this, SubmissionNotice.class);
            startActivity(i);

        } else {
            Snackbar.make(view, "Please fill in the required fields.", Snackbar.LENGTH_LONG).setAction("Action", null).show();
        }
    }

    public void clearEntry(View view) {

        EditText artistName = findViewById(R.id.artistName);
        EditText artTitle = findViewById(R.id.artTitle);
        EditText artUrl = findViewById(R.id.artUrl);
        ImageView artImage = findViewById(R.id.uploadedImage);

        artistName.setText("");
        artTitle.setText("");
        artUrl.setText("");
        artImage.setImageIcon(null);
    }
}
