package com.example.aninterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button clickbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     final Boxer boxera=new Boxer("navee",200,400);
     boxera.throwjab();
      Kickboxer kickboxer=new Kickboxer();

     clickbutton=findViewById(R.id.clickbutton);
     clickbutton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Toast.makeText(MainActivity.this,boxera.throwjab(),Toast.LENGTH_LONG ).show();
         }
     });


    }


}
