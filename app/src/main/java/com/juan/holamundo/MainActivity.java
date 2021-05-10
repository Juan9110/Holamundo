package com.juan.holamundo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     String[] frase;
TextView juanholamundo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        juanholamundo = findViewById(R.id.juanholamundo);
        frase = new String[5];
        frase[0] = "te va atocar la loteria";
        frase[1] = "aprobaran todos";
        frase[2] = "no van haber errores en el programa";
        frase[3] = "me va a salir el proyecto muy chulo";
        frase[4] = "voy a ir de vacaciones ala playa";

    }

    public void generarSaludar(View view) {
        int num = (int)(Math.random()*5);
        juanholamundo.setText("saludos desde manjatan " + frase[num]);

    }
}