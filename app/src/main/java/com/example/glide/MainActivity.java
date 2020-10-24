package com.example.glide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView= (ImageView) findViewById(R.id.ivFoto);
        String url="http://www.secsanluis.com.ar/img/1.jpg";

        Glide.with(this)
                .load(url)
                .placeholder(R.drawable.ic_launcher_background)
                .into(imageView);


    }
}