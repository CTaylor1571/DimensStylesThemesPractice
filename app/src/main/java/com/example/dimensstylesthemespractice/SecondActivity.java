package com.example.dimensstylesthemespractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    String name;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        Intent intent1=getIntent();
        name= intent1.getStringExtra("NAME");
        textView=findViewById(R.id.nameRateResultTextView);
        rateName(name);

    }
    public void rateName(String name){
        if(name.equalsIgnoreCase("Christian")||name.equalsIgnoreCase("Christian Taylor")) {
            textView.setText("10/10, best name by far :)");
        } else if (name.equalsIgnoreCase("Aditya")||name.equalsIgnoreCase("Aditya gupta")) {
            textView.setText("3.4/10, ok name overall :)");
        } else if (name.equals("")) {
            textView.setText("Enter a name, silly :P");
        } else {
            int rand = (int)(Math.random()*10)+1;
            textView.setText("This name is a "+ rand + "/10 :)");
        }
    }
    public void switchScreens(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}