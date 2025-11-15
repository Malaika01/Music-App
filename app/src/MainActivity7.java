package com.example.i190726;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity7 extends AppCompatActivity {
    EditText text1;
    EditText text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       text1=findViewById(R.id.editTextTextPersonEmail);
      text2=findViewById(R.id.editTextTextPersonName);

    }
}