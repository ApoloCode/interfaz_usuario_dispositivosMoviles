package com.example.interfaz_usuario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Interfaz formulario
        setContentView(R.layout.formulario);
        // Interfaz aceptacion
        // setContentView(R.layout.aceptacion);
    }
}