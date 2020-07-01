package com.example.prueba1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    Button  btnCrear,btnDelete, btnMod, btnRead;
    //FirebaseAuth fAuth;

    private String mail="";
    private String clave="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCrear=findViewById(R.id.btnInsert);
        btnDelete=findViewById(R.id.btnEliminar);
        btnMod=findViewById(R.id.btnUpdate);
        btnDelete=findViewById(R.id.btnEliminar);
    }


    public void Crear(View view){
        Intent i=new Intent(this, Crear.class);
        startActivity(i);

    }
    public void Leer(View view){
        Intent i=new Intent(this, Leer.class);
        startActivity(i);

    }
    public void Actualizar(View view){
        Intent i=new Intent(this, Actualizar.class);
        startActivity(i);

    }
    public void Eliminar(View view){
        Intent i=new Intent(this, Eliminar.class);
        startActivity(i);

    }



}