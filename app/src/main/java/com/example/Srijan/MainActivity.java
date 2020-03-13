package com.example.Srijan;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.view.View;
import android.widget.*;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

public static final String key="Key";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            Button b=findViewById(R.id.button);

            b.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    onGo();
                }

            });
        }
    public void onGo(){
        EditText e=findViewById(R.id.editText);
        String t =e.getText().toString();
        Intent intent =new Intent(this,activity2.class);
        intent.putExtra(key,t);
        startActivity(intent);


    }
    }

