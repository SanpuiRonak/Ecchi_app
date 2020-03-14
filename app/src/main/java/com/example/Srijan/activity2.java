package com.example.Srijan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class activity2 extends AppCompatActivity {

    public static final String f= "Key2";
    public String s;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        setCotent();
        FloatingActionButton f = findViewById(R.id.floatingActionButton);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCotent();
            }
        });
        }

    public void setCotent()
    {
        Intent intent=getIntent();
        s = intent.getStringExtra(MainActivity.key);
        TextView t= findViewById(R.id.textView);
        String[] arr ={
                "Harder "+s+" push it harder!",
                s+ " Senpai Onegai!"
        };
        int img[]={
                R.drawable.echi0,
                R.drawable.echi1
        };
        int index = getRandom(arr.length);
        int index_img = getRandom(arr.length);
        Log.i("Index",""+index);
        Log.i("Index_image",""+index_img);
        t.setText(arr[index]);
        ImageView i=findViewById(R.id.echi0);
        i.setImageResource(img[index_img]);

    }

    public int getRandom(int n)
    {
        return (int)(Math.random()*n);
    }
}
