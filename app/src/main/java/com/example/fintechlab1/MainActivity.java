package com.example.fintechlab1;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textView = findViewById(R.id.textView2);
    }

    public void OnBtnclick(View view) {
        this.textView.setText("Hello world!");
    }
}