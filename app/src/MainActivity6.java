package com.example.i190726;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity6 extends AppCompatActivity {
    Button button;
    EditText edit_query;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);button=findViewById(R.id.button);
        edit_query=findViewById(R.id.editTextTextPersonEmail);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity6.this,MainActivity.class);
                String textdata1= edit_query.getText().toString();
                intent.putExtra("text",textdata1);

                startActivity(intent);

            }
        });

    }
}