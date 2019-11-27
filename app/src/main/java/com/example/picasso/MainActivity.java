package com.example.picasso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.img);
        Picasso.get().load("https://image.shutterstock.com/image-photo/beautiful-water-drop-on-dandelion-260nw-789676552.jpg").into(imageView);

    }
}
