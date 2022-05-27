package com.example.diary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class Grid extends AppCompatActivity {


        GridView gridView;
        String [] names = {"image1","image2","image3","image4","image5","image6","image7","image8","image1","image2","image3","image4","image5","image6","image7","image8",
                "image1","image2","image3","image4"};
        int [] images = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,
                R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.p,R.drawable.q,R.drawable.r,R.drawable.s,R.drawable.t};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_grid);

            gridView = findViewById(R.id.gridView);

            CustomeAdapter customeAdapter =  new CustomeAdapter(names,images,this);
            gridView.setAdapter((customeAdapter));



        }

        public class CustomeAdapter extends BaseAdapter {

            private String [] imageNames;
            private int [] imagesPhoto;
            private Context context;
            private LayoutInflater layoutInflater;

            public CustomeAdapter(String[] imageNames, int[] imagesPhoto, Context context) {
                this.imageNames = imageNames;
                this.imagesPhoto = imagesPhoto;
                this.context = context;
                this.layoutInflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
            }

            @Override
            public int getCount() {
                return imagesPhoto.length;
            }

            @Override
            public Object getItem(int i) {
                return null;
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {

                if (view == null){
                    view = layoutInflater.inflate(R.layout.row_items, viewGroup,false);

                }

                TextView tvName = view.findViewById(R.id.tvName);
                ImageView imageView = view.findViewById(R.id.imageView);


                tvName.setText(imageNames[i]);
                imageView.setImageResource(imagesPhoto[i]);


                return view;
            }
        }

    }