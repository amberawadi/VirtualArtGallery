package com.finalproject.virtualartgallery;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.finalproject.virtualartgallery.ArtistPage;

import com.google.android.material.snackbar.Snackbar;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    public static String [] titles = {"Sample Art1", "SampleArt2", "SampleArt3", "SampleArt4", "SampleArt5", "SampleArt6"};

    public static String[] artistNames = {"Mary Sue", "Bob Sample", "Arthur Work", "Amber Awadi", "Tess Ting", "Anon"};

    public static int[] artWorks = {R.drawable.sampleart1, R.drawable.sampleart2, R.drawable.sampleart3, R.drawable.sampleart4, R.drawable.sampleart5, R.drawable.sampleart6};

    Context context;

    public RecyclerAdapter(Context context, String[] titles, String[] artistName, int[] artWork) {
        titles = titles;
        artistName = artistName;
        artWork = artWork;
        context = context;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.title.setText(titles[i]);
        viewHolder.artistName.setText(artistNames[i]);
        viewHolder.artWork.setImageResource(artWorks[i]);
    }


    @Override
    public int getItemCount() {
        return titles.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        CardView card_view;
        ImageView artWork;
        TextView title;
        TextView artistName;


        ViewHolder(View artView) {
            super(artView);
            artWork = artView.findViewById(R.id.art_image);
            title = artView.findViewById(R.id.art_title);
            artistName = artView.findViewById(R.id.artist_name);
            card_view = artView.findViewById(R.id.card_view);

            artView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int position = getAdapterPosition();
                    
                    if (position == 0) {
                        Snackbar.make(v, "Price of Art: $" + 89, Snackbar.LENGTH_LONG).setAction("Action", null).show();
                    } else if (position == 1) {
                        Snackbar.make(v, "Price of Art: $" + 420, Snackbar.LENGTH_LONG).setAction("Action", null).show();
                    } else if (position == 2) {
                        Snackbar.make(v, "Price of Art: $" + 69, Snackbar.LENGTH_LONG).setAction("Action", null).show();
                    } else if (position == 3) {
                        Snackbar.make(v, "Price of Art: $" + 23, Snackbar.LENGTH_LONG).setAction("Action", null).show();
                    } else if (position == 4) {
                        Snackbar.make(v, "Price of Art: $" + 666, Snackbar.LENGTH_LONG).setAction("Action", null).show();
                    } else {
                        Snackbar.make(v, "Price of Art: $" + 1, Snackbar.LENGTH_LONG).setAction("Action", null).show();
                    }
                }
            });
        }
    }
}


