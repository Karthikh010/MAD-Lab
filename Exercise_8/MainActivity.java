package com.example.ex_8_34;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button plus_ = (Button) findViewById(R.id.plus);
        Button minus_ = findViewById(R.id.minus);
        TextView txt=findViewById(R.id.txt);
        Button reset_ = (Button) findViewById(R.id.ret);
        plus_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                txt.setText(count +"");
            }
        });
        minus_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                txt.setText(count +"");
            }
        });
        reset_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
                txt.setText(count +"");
            }
        });

    }
}