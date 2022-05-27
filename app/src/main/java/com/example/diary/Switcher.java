package com.example.diary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class Switcher extends AppCompatActivity {

    private ImageSwitcher imageSwitcher;
    private ImageButton b1,b2;
    private int images [] = {R.drawable.eleven, R.drawable.nine, R.drawable.twelve,R.drawable.fifteen,R.drawable.sixteen,R.drawable.seventeen,R.drawable.eighteen,R.drawable.nineteen,R.drawable.twenty,R.drawable.twentyone    };
    private int position;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switcher);

        imageSwitcher = (ImageSwitcher)findViewById(R.id.imageSwitcher);
        b1 = (ImageButton)findViewById(R.id.imgbtnBefore);
        b2 = (ImageButton)findViewById(R.id.imgbtnNext);

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {

                ImageView imgView = new ImageView(Switcher.this);
                imgView.setImageResource(images[position]);
                return imgView;
            }
        });

        imageSwitcher.setInAnimation(this, android.R.anim.slide_in_left);
        imageSwitcher.setOutAnimation(this, android.R.anim.slide_out_right);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position>0)
                    position--;
                else if(position<0)
                    position=0;
                imageSwitcher.setImageResource(images[position]);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position< images.length)
                    position++;
                if (position>= images.length)
                    position = images.length-1;
                imageSwitcher.setImageResource(images[position]);
            }
        });

    }


    }