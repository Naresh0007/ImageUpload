package com.naresh.imageupload;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.naresh.imageupload.adapter.adapter;
import com.naresh.imageupload.model.classDetails;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText tvname, tvage;
    RadioButton radioM, radioF,radioO;
    RadioGroup radioGroup;
    Spinner spinner;
    RecyclerView recyclerView;
    Button buttonsave;
    String name,gender,age;
    int imgpos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvname= findViewById(R.id.name);
        tvage = findViewById(R.id.age);
        radioM = findViewById(R.id.radioM);
        radioF= findViewById(R.id.radioF);
        radioO= findViewById(R.id.radioO);
        radioGroup= findViewById(R.id.rdgrp);
        spinner= findViewById(R.id.spinner);
        recyclerView= findViewById(R.id.recycleview);
        buttonsave=findViewById(R.id.btnsave);
       final List<classDetails> classDetails = new ArrayList<>();
       final int[] title = {
               (R.drawable.dayahang),
               (R.drawable.budha),
               (R.drawable.gurung),
               (R.drawable.prithvi),
               (R.drawable.rajesh),
               (R.drawable.spiderman),
               (R.drawable.rajesh),
       };
       final String [] titlename = {
               "Select image",
               "Dayahang Rai",
               "Budha",
               "Vilain",
               "Prithvi",
               "Rajesh Hamal",
               "Spiderman",
               "Rajesh",
       };
        ArrayAdapter<String> imagetitle = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_list_item_1, titlename);
        spinner.setAdapter(imagetitle);

        buttonsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = tvname.getText().toString();
                int id = radioGroup.getCheckedRadioButtonId();
                RadioButton radioButton = findViewById(id);
                gender = radioButton.getText().toString();
                age= (tvage.getText().toString());
                int position = (spinner.getSelectedItemPosition());
                imgpos = title[position-1];
                classDetails.add(new classDetails(name,age,gender,imgpos));
                RecyclerView.Adapter adapter = new adapter(MainActivity.this,classDetails);
                recyclerView.setAdapter(adapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

            }
        });
    }
}
