package com.example.prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.FirebaseDatabase;

public class Crear extends AppCompatActivity {

    EditText nombre, precio,descripcion;

    Button btnGuardar;
    //FirebaseAuth fAuth;
    FirebaseDatabase fdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear);

        nombre=findViewById(R.id.txtNombre);
        precio=findViewById(R.id.txtprecio);
        descripcion=findViewById(R.id.txtDescrip);
        btnGuardar=findViewById(R.id.btnGuardarProd);
        fdata=FirebaseDatabase.getInstance();








    }







}