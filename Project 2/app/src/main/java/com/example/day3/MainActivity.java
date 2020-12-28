package com.example.day3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      // grey variables means its not working
        EditText a = findViewById(R.id.name);
        EditText c= findViewById(R.id.Mob);
        EditText e =findViewById(R.id.eml) ;
        EditText k = findViewById(R.id.add);
        Button b = findViewById(R.id.button) ;
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,MainActivity2.class) ;
                String name = a.getText().toString();
                String name1 = e.getText().toString();
                String name2 = k.getText().toString();
                String name3= c.getText().toString() ;

                i.putExtra( "info",name);
                i.putExtra("inf",name1);
                i.putExtra("in",name2);
                i.putExtra("i", name3);


                startActivity(i);

            }
        });




    }
}