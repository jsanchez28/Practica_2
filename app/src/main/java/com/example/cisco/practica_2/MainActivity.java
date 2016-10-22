package com.example.cisco.practica_2;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        //metodo definido para el onclick del boton
        Button btnIngreso = (Button)findViewById(R.id.btnIngreso);
        final String mensaje = getResources().getString(R.string.alerta);
        btnIngreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, mensaje, Toast.LENGTH_SHORT).show();
            }
        });
        */
    }


    public void presionar_boton(View view){
        Toast.makeText(MainActivity.this, "Mensaje metodo", Toast.LENGTH_SHORT).show();
    }
}
