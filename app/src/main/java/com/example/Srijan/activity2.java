package com.example.Srijan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        TextView t= findViewById(R.id.textView);
        Intent intent=getIntent();
        String s=intent.getStringExtra(MainActivity.key);

        //Add your Quotations here
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
        String s1 ="ech1";

    }
    public int getRandom(int n)
    {
        return (int)(Math.random()*n);
    }
}
