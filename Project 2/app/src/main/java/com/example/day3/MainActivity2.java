package com.example.day3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        Bundle b= getIntent().getExtras();
        String k =b.getString("info");
        String v =b.getString("inf");
        String n =b.getString("in");
        String c =b.getString("i") ;


        TextView t= findViewById(R.id.t2) ;
        t.setText(k) ;
        TextView q= findViewById(R.id.t3) ;
        q.setText(v) ;
        TextView p= findViewById(R.id.t4) ;
        p.setText(n) ;
        TextView t1 = findViewById(R.id.tele);
        t1.setText(c);



        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent= new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:"+c)) ;
                startActivity(callIntent);
            }

        });
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email = new Intent(Intent.ACTION_SEND);
                email.setData(Uri.parse("to"));
                email.setType("text/plain");
                email.putExtra(Intent.EXTRA_EMAIL, String.valueOf(v));
                email.putExtra(Intent.EXTRA_SUBJECT,"TEST");
                email.putExtra(Intent.EXTRA_TEXT,"HELLO");

                startActivity(Intent.createChooser(email,"Send email"));


            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("google.streetview:cbII=29.240434,47.906287");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");

                startActivity(mapIntent);
            }
        });







    }
}