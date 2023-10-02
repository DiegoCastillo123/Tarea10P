package com.diegoinc.tarea10p;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class ListaPerdidos extends AppCompatActivity {
    ArrayList<VariablesPerdidos> listaPerdidos;
    RecyclerView recyclerPerdidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_perdidos);

        listaPerdidos = new ArrayList<>();
        recyclerPerdidos = (RecyclerView) findViewById(R.id.recyclerPerdidoId);
        recyclerPerdidos.setLayoutManager(new LinearLayoutManager(this));

        llenarMascotasPerdidas();
        AdapterPerdidos adapters = new AdapterPerdidos(listaPerdidos);
        recyclerPerdidos.setAdapter(adapters);
    }

    private void llenarMascotasPerdidas() {
        listaPerdidos.add(new VariablesPerdidos("OSO","Perro perdido en comuna de San Ramón, Ultima vez visto fue en calle Riquelme con Av.La Bandera Cualquier Información Contactar a este número +569 12345678",R.drawable.koda));
        listaPerdidos.add(new VariablesPerdidos("LOLA","Perrita perdido en comuna de San Ramón, Ultima vez visto fue en calle Av.La Bandera Cualquier Información Contactar a este número +569 41654559",R.drawable.mona));
        listaPerdidos.add(new VariablesPerdidos("COPITO","Perrito perdido en comuna de San Ramón, Ultima vez visto fue en calle Riquelme con Av.La Bandera Cualquier Información Contactar a este número +569 12345678\"",R.drawable.negrito));
        listaPerdidos.add(new VariablesPerdidos("MANOTA","Perro perdido en comuna de San Ramón, Ultima vez visto fue en calle Riquelme con Av.La Bandera Cualquier Información Contactar a este número +569 12345678\"",R.drawable.malote));
        listaPerdidos.add(new VariablesPerdidos("MICHI","Gatita perdido en comuna de San Ramón, Ultima vez visto fue en calle Riquelme con Av.La Bandera Cualquier Información Contactar a este número +569 12345678\"",R.drawable.michi));
        listaPerdidos.add(new VariablesPerdidos("LUTHER","Perro Galgo perdido en comuna de San Ramón, Ultima vez visto fue en calle Riquelme con Av.La Bandera Cualquier Información Contactar a este número +569 12345678\"",R.drawable.lancelot));
    }

    public void onClick(View view) {

        if (view.getId() == R.id.btnAdopcionP) {

            Intent miIntent = new Intent(ListaPerdidos.this, ListaAdopcion.class);
            startActivity(miIntent);
        } else if (view.getId() == R.id.btnEncontradosP) {

            Intent miIntent = new Intent(ListaPerdidos.this, ListaEncontrados.class);
            startActivity(miIntent);
        }
    }
}
