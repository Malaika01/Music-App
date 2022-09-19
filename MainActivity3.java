package com.example.i190726;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    Button button;
    EditText editTextTextPersonPassword;
    EditText editTextTextPersonEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button=findViewById(R.id.button);
        editTextTextPersonEmail=findViewById(R.id.editTextTextPersonEmail);
        editTextTextPersonPassword=findViewById(R.id.editTextPersonPassword);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity3.this,MainActivity.class);
                String textdata= editTextTextPersonEmail.getText().toString();
                String textdata2= editTextTextPersonPassword.getText().toString();

                intent.putExtra("text",textdata);
                intent.putExtra("text",textdata2);
                startActivity(intent);

            }
        });
    }
}