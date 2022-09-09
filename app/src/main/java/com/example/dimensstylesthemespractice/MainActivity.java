package com.example.dimensstylesthemespractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // this is a change
    String name;
    EditText nameTextBox;
    public void onButtonClick(View view){
        name = nameTextBox.getText().toString();
        
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name="";
        nameTextBox = findViewById(R.id.editTextTextPersonName);
    }
}