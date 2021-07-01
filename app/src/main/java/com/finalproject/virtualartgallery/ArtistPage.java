package com.finalproject.virtualartgallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class ArtistPage extends AppCompatActivity {

    WebView webView = findViewById(R.id.webView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_page);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.kellogg.edu");
    }


}