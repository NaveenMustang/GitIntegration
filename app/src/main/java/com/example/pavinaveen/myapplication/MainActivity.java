package com.example.pavinaveen.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Hello git", Toast.LENGTH_LONG).show();
        Toast.makeText(this, "Hello devlpment", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hello adsadsadsadads"+"hello world update", Toast.LENGTH_SHORT).show();

        showToast();
    }

    private void showToast() {
        Toast.makeText(this, "my work", Toast.LENGTH_SHORT).show();
    }
}
