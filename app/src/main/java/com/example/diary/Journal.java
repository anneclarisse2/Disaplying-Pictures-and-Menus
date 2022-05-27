package com.example.diary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class Journal extends AppCompatActivity{




    //context code
    TextView text;


    EditText edit;
    ImageButton btn,btn7,btn6,btn8;
    TextView txtview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal);



        //code for context menu
        text = findViewById(R.id.option_1);

        //code for date picker context menu
        TextView textViewContext = findViewById(R.id.textView2);
        registerForContextMenu(textViewContext);


        edit = (EditText) findViewById(R.id.editTextTextMultiLine3);
        btn = (ImageButton) findViewById(R.id.imageButton5);
        txtview = (TextView) findViewById(R.id.textView2);
        btn7 = (ImageButton)findViewById(R.id.imageButton7);
      //  btn6 = (ImageButton)findViewById(R.id.imageButton6);
        btn8 = (ImageButton)findViewById(R.id.imageButton8);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edit.getText().toString();
                txtview.setText(name);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Journal.this,WebSearch.class);
                startActivity(i);
            }
        });



      /*  btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Journal.this,Home.class);
                startActivity(i);
            }
        });*/

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Journal.this,Grid.class);
                startActivity(i);
            }
        });



    }

    //code for context menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.context_menu,menu);

    }

    //code for context menu


    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.option_1:
                Toast.makeText(this, "Selected", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }

    }



}