package com.sigmotoa.naval3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnR0C0 = findViewById(R.id.button1);
        Button btnR0C3 = findViewById(R.id.button4);

        btnR0C0.setOnClickListener(v -> {

            btnR0C0.setText("X");
            btnR0C0.setBackgroundColor(getColor(R.color.green));
            btnR0C0.setCompoundDrawables(getDrawable(R.drawable.twotone_houseboat_24),null,null,null);

        });

        btnR0C0.setOnLongClickListener(v -> {
            btnR0C0.setText("O");
            btnR0C0.setBackgroundColor(getColor(R.color.red));
            btnR0C0.setCompoundDrawables(null,getDrawable(R.drawable.twotone_houseboat_24),null,null);
            return true;
        });


        btnR0C3.setOnClickListener(v -> {

            btnR0C3.setText("X");
            btnR0C3.setBackgroundColor(getColor(R.color.green));
            btnR0C3.setCompoundDrawables(getDrawable(R.drawable.twotone_houseboat_24),null,null,null);

        });

    }
}