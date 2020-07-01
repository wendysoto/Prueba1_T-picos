package com.example.prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class Crear extends AppCompatActivity {

    EditText nombre, precio,descripcion;

    Button btnGuardar;
    //FirebaseAuth fAuth;


    DatabaseReference  mRootReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear);

        nombre=findViewById(R.id.txtNombre);
        precio=findViewById(R.id.txtprecio);
        descripcion=findViewById(R.id.txtDescrip);
        btnGuardar=findViewById(R.id.btnGuardarProd);

        mRootReference=FirebaseDatabase.getInstance().getReference();



    btnGuardar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String nomprod=nombre.getText().toString();
        Double precioprod= Double.valueOf(precio.getText().toString());
        String descrip=descripcion.getText().toString();

        if(precio.length()<0) {
            precio.setError("ingrese un precio");
            return;
        }
        if(!nomprod.isEmpty()&&!descrip.isEmpty()){
            Map<String, Object> utilesEscolares=new HashMap<>();
            utilesEscolares.put("nombre", nomprod);
            utilesEscolares.put("precio", precioprod);
            utilesEscolares.put("descripcion", descrip);
            mRootReference.child("Producto").push().setValue(utilesEscolares);
            nombre.setText("");
            precio.setText("");
            descripcion.setText("");
            Toast.makeText(Crear.this, "Producto Registrado", Toast.LENGTH_SHORT).show();

        }
        else{
            Toast.makeText(Crear.this, "Complete los campos", Toast.LENGTH_SHORT).show();

        }


    }
});

    }




}