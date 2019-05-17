package com.ghavinj.dogswitcher;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void switchDogs(View view){
        ImageView dogImageView = (ImageView) findViewById(R.id.dogImageView);

        dogImageView.setImageResource(R.drawable.dog2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
