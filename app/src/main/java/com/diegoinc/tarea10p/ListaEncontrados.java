package com.diegoinc.tarea10p;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class ListaEncontrados extends AppCompatActivity {
    ArrayList<VariablesEncontrados> listaEncontrados;
    RecyclerView recyclerEncontrados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_encontrados);

        listaEncontrados = new ArrayList<>();
        recyclerEncontrados = (RecyclerView) findViewById(R.id.recyclerEncontradosId);
        recyclerEncontrados.setLayoutManager(new LinearLayoutManager(this));

        llenarMascotasEncontradas();
        AdapterEncontrados adapters = new AdapterEncontrados(listaEncontrados);
        recyclerEncontrados.setAdapter(adapters);
    }

    private void llenarMascotasEncontradas() {
        listaEncontrados.add(new VariablesEncontrados("Perro encontrado en comuna EL Bosque, Lo tengo retenido, es macho" + "\n Mi dirección es Av.Sur #1819 y mi número +569 12345678",R.drawable.koda));
        listaEncontrados.add(new VariablesEncontrados("Perrita encontrada en comuna San Ramon, Lo tengo retenido, es hembra" + "\n Mi dirección es Av.La Bandera #1234 y mi número +569 12345678",R.drawable.mona));
        listaEncontrados.add(new VariablesEncontrados("Perrito encontrado en comuna EL Bosque, Lo tengo retenido, es macho"+ "\n Mi dirección es Av.Sur #1819 y mi número +569 12345678",R.drawable.negrito));
        listaEncontrados.add(new VariablesEncontrados("Perro encontrado en comuna EL Bosque, Lo tengo retenido, es macho"+ "\n Mi dirección es Av.Sur #1819 y mi número +569 12345678",R.drawable.malote));
        listaEncontrados.add(new VariablesEncontrados("Perro Galgo encontrado en comuna EL Bosque, Lo tengo retenido, es macho"+ "\n Mi dirección es Av.Sur #1819 y mi número +569 12345678",R.drawable.lancelot));
    }

    public void onClick(View view) {
        if (view.getId() == R.id.btnAdopcionE) {

            Intent miIntent = new Intent(ListaEncontrados.this, ListaAdopcion.class);
            startActivity(miIntent);
        } else if (view.getId() == R.id.btnPerdidosE) {

            Intent miIntent = new Intent(ListaEncontrados.this, ListaPerdidos.class);
            startActivity(miIntent);
        }
    }
}