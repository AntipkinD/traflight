package com.example.traflight;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout constraintlayout;
    private TextView infoTextView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintlayout = findViewById(R.id.layout);
        infoTextView = findViewById(R.id.textview1);

    }

    public void onRedButtonClick(View view) {
        infoTextView.setText(R.string.redbutt);
        constraintlayout.setBackgroundColor(getColor(R.color.redColor));
    }
    public void onYellowButtonClick(View view) {
        infoTextView.setText(R.string.yellow);
        constraintlayout.setBackgroundColor(getColor(R.color.yellowColor));
    }
    public void onGreenButtonClick(View view) {
        infoTextView.setText(R.string.green);
        constraintlayout.setBackgroundColor(getColor(R.color.greenColor));
    }
}