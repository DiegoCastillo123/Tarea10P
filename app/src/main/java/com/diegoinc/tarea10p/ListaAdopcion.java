package com.diegoinc.tarea10p;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import java.util.ArrayList;

public class ListaAdopcion extends AppCompatActivity {

    ArrayList<VariablesAdopcion> listaMascotas;
    RecyclerView recyclerMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_adopcion);

        listaMascotas = new ArrayList<>();
        recyclerMascotas = (RecyclerView) findViewById(R.id.recyclerId);
        recyclerMascotas.setLayoutManager(new LinearLayoutManager(this));
        
        llenarMascotas();
        AdapterAdopcion adapters = new AdapterAdopcion(listaMascotas);
        recyclerMascotas.setAdapter(adapters);
    }
    private void llenarMascotas() {

        listaMascotas.add(new VariablesAdopcion("JERRY","1 año , Tamaño: Mediano, Raza: Mestizo, sexo: Macho",R.drawable.jerry));
        listaMascotas.add(new VariablesAdopcion("MONA","8 años , Tamaño: Pequeño, Raza: Mestizo, sexo: Hembra",R.drawable.mona));
        listaMascotas.add(new VariablesAdopcion("NEGRITO","3 meses , Tamaño: Grande, Raza: Labrador, sexo: Macho",R.drawable.negrito));
        listaMascotas.add(new VariablesAdopcion("MALOTE","1 año , Tamaño: Mediano, Raza: Mestizo, sexo: Macho",R.drawable.malote));
        listaMascotas.add(new VariablesAdopcion("MICHI","1 año , Tamaño: Mediano, Raza: Mestizo, sexo: Hembra",R.drawable.michi));
        listaMascotas.add(new VariablesAdopcion("LUTHER","1 año , Tamaño: Grande, Raza: Mestizo, sexo: Macho",R.drawable.lancelot));
    }

    public void onClick(View view) {

        if (view.getId() == R.id.btnPerdidosA) {

            Intent miIntent = new Intent(ListaAdopcion.this, ListaPerdidos.class);
            startActivity(miIntent);
        } else if (view.getId() == R.id.btnEncontradosA) {

            Intent miIntent = new Intent(ListaAdopcion.this, ListaEncontrados.class);
            startActivity(miIntent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}