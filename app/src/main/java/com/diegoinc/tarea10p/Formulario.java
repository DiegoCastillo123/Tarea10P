package com.diegoinc.tarea10p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class Formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
    }

    public void onClick(View view) {

        if (view.getId() == R.id.btnFormularioRegistrar) {
            Toast toast = Toast.makeText(this, "Registrado con exito... ", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.START, 90, 0);
            toast.show();

            Intent miIntent = new Intent(Formulario.this, Login_App.class);
            startActivity(miIntent);

        }
    }
}