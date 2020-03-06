package com.example.practica02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class actividad02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad02);
    }

    public void Agregar(View v){




     Toast.makeText(v.getContext(),"Agregue Productos",Toast.LENGTH_SHORT).show();
     Intent grabarcon = new Intent(this, MainActivity.class);
        startActivity(grabarcon);
    }

    public void Perfil(View v){




    Toast.makeText(v.getContext(),"Este es su perfil",Toast.LENGTH_SHORT).show();
    Intent grabarcon = new Intent(this, MainActivity.class);
        startActivity(grabarcon);
    }

    public void Salir(View v){
        finish();
    }


}
