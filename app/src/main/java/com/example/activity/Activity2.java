package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        texto = findViewById(R.id.texto);
        Bundle tex = getIntent().getExtras();
        String textoR= tex.getString("dato");
        texto.setText(textoR);
    }
    public void cambio (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
