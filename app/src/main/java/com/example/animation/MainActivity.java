package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void fade(View view){

        ImageView kakashri = (ImageView) findViewById(R.id.kakashri);

        ImageView Naruto = (ImageView) findViewById(R.id.Naruto);

        kakashri.animate().alpha(0f).setDuration(2000);
        Naruto.animate().alpha(1f).setDuration(2000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}