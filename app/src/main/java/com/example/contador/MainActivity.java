package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int contador;
    TextView contadorclicks;
    Button aumentoContador;

    int contador2;
    TextView contadorclicks2;
    Button aumentoContador2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contadorclicks = findViewById(R.id.contador);
        aumentoContador = findViewById(R.id.augmentarElContador);

        aumentoContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador++;
                contadorclicks.setText(String.valueOf(contador));
            }
        });

        contadorclicks2 = findViewById(R.id.contador2);
        aumentoContador2 = findViewById(R.id.augmentarElContador2);

        aumentoContador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador2++;
                contadorclicks2.setText(String.valueOf(contador2));
            }
        });
    }
}