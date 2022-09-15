package com.example.dimensstylesthemespractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // this is a change
    String name;
    EditText nameTextBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name="";
        nameTextBox = findViewById(R.id.editTextTextPersonName);
    }

    public void switchScreens(View view) {
        name = nameTextBox.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("NAME", name);
        startActivity(intent);
    }

}