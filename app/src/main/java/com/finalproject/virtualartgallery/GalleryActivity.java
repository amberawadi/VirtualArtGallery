package com.finalproject.virtualartgallery;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class GalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery_view);
        getIncomingIntent();
        ImageView image = findViewById(R.id.art_image);
        image.setImageResource(R.drawable.sampleart1);
    }

  private void getIncomingIntent() {
        if (getIntent().hasExtra("title") && getIntent().hasExtra("artistName")) {
            String title = getIntent().getStringExtra("title");
            String artistName = getIntent().getStringExtra("artistName");

            setImage(title, artistName);
        }
    }

    private void setImage(String titles, String artistName) {
        TextView title = findViewById(R.id.art_title);
        title.setText(titles);

        TextView artistname = findViewById(R.id.artist_name);
        artistname.setText(artistName);

    }


}
