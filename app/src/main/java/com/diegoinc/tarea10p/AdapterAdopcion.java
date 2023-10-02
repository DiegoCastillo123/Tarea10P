package com.diegoinc.tarea10p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterAdopcion extends RecyclerView.Adapter<AdapterAdopcion.ViewHolderMascotas> {

    ArrayList<VariablesAdopcion> listaMascotas;

    public AdapterAdopcion(ArrayList<VariablesAdopcion> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    @Override
    public ViewHolderMascotas onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_adopcion,null,false);
        return new ViewHolderMascotas(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterAdopcion.ViewHolderMascotas holder, int position) {
            holder.Et_nombre.setText(listaMascotas.get(position).getNombre());
            holder.Et_informacion.setText(listaMascotas.get(position).getInfo());
            holder.foto.setImageResource(listaMascotas.get(position).getFoto());
    }

    @Override
    public int getItemCount() {

        return listaMascotas.size();
    }

    public class ViewHolderMascotas extends RecyclerView.ViewHolder {

        TextView Et_nombre, Et_informacion;
        ImageView foto;
        public ViewHolderMascotas(@NonNull View itemView) {
            super(itemView);
            Et_nombre = (TextView) itemView.findViewById(R.id.idNombre);
            Et_informacion = (TextView) itemView.findViewById(R.id.idInfo);
            foto = (ImageView) itemView.findViewById(R.id.idImagen);
        }

    }
}

