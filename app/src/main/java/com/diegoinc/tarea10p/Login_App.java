package com.diegoinc.tarea10p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class Login_App extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_app);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.btnIngresar) {
            Toast toast = Toast.makeText(this,"Ingresando...",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.START, 90, 0);
            toast.show();

            Intent miIntent = new Intent(Login_App.this, ListaAdopcion.class);
            startActivity(miIntent);
        } else if (v.getId() == R.id.btnRegistrar) {
            Toast toast = Toast.makeText(this,"Redirigiendo...",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.START, 90, 0);
            toast.show();

            Intent miIntent = new Intent(Login_App.this,Formulario.class);
            startActivity(miIntent);
        }

    }
}