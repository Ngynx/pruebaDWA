package com.example.practica02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Agregar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);
    }



    public void grabar_onclick(View v){
        String xcodp = ((EditText)findViewById(R.id.txtCodigop)).getText().toString();
        String xnomb = ((EditText)findViewById(R.id.txtNombre)).getText().toString();
        String xprec = ((EditText)findViewById(R.id.txtPrecio)).getText().toString();
        insertarContacto(xcodp,xnomb,xprec);
        Toast.makeText(v.getContext(),"Grabando registro",Toast.LENGTH_SHORT).show();
        Intent grabarcon = new Intent(this, MainActivity.class);
        startActivity(grabarcon);
    }


    private void insertarContacto(String xcodp, String xnomb, String xprec) {
        com.example.proyectosqlitev3.DatabaseHelper dbh = new com.example.proyectosqlitev3.DatabaseHelper(this);
        SQLiteDatabase db = dbh.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(com.example.proyectosqlitev3.DatabaseHelper.CODIGOP, xcodp);
        cv.put(com.example.proyectosqlitev3.DatabaseHelper.NOMBRE, xnomb);
        cv.put(com.example.proyectosqlitev3.DatabaseHelper.PRECIO, xprec);
        db.insert("productos", com.example.proyectosqlitev3.DatabaseHelper.NOMBRE, cv);
        db.close();
    }

    public void Regresar(View v){
        finish();
    }
}
