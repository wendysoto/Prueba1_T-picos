package com.example.prueba1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Leer extends AppCompatActivity {
//private ListView lvl;
private TextView textData;

    DatabaseReference mRootReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leer);
        //lvl=(ListView)findViewById(R.id.listView);
        textData=(TextView) findViewById(R.id.tvDatos);

        //mRootReference=FirebaseDatabase.getInstance().getReference(getString(R.string.nodo_Producto));
        mRootReference=FirebaseDatabase.getInstance().getReference();

        mRootReference.child("Producto").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    String name=dataSnapshot.child("nombre").getValue().toString();
                    //String price=dataSnapshot.child("precio").getValue().toString();
                    //String descrip=dataSnapshot.child("descripcion").getValue().toString();
                    textData.setText("nombre"+name);
                }
/*
                ArrayAdapter<String> adaptador;
                ArrayList<String>listado=new ArrayList<String>();
                for(DataSnapshot snapshot: dataSnapshot.getChildren()){
                   escolar utiles= dataSnapshot.getValue(escolar.class);

                   String name= utiles.getNombre();
                   listado.add(name);

                }
                adaptador=new ArrayAdapter<String>(Leer.this, android.R.layout.simple_list_item_1,listado);
                lvl.setAdapter(adaptador);*/
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }


}