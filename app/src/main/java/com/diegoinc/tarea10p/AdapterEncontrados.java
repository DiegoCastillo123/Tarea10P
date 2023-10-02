package com.diegoinc.tarea10p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterEncontrados extends RecyclerView.Adapter<AdapterEncontrados.ViewHolderEncontradosMascotas> {

    ArrayList<VariablesEncontrados> listaEncontradosMascotas;

    public AdapterEncontrados(ArrayList<VariablesEncontrados> listaEncontradosMascotas) {
        this.listaEncontradosMascotas = listaEncontradosMascotas;
    }

    @Override
    public ViewHolderEncontradosMascotas onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_encontrados, null, false);
        return new AdapterEncontrados.ViewHolderEncontradosMascotas(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolderEncontradosMascotas holder, int position) {
        holder.Et_informacionEncontrados.setText(listaEncontradosMascotas.get(position).getInfoEncontrados());
        holder.fotoEncontrados.setImageResource(listaEncontradosMascotas.get(position).getFotoEncontrados());
    }

    @Override
    public int getItemCount() {
        return listaEncontradosMascotas.size();
    }


    public class ViewHolderEncontradosMascotas extends RecyclerView.ViewHolder {
        TextView Et_informacionEncontrados;
        ImageView fotoEncontrados;
        public ViewHolderEncontradosMascotas(@NonNull View itemView) {
            super(itemView);
            Et_informacionEncontrados = (TextView) itemView.findViewById(R.id.idInfoEncontrados);
            fotoEncontrados = (ImageView) itemView.findViewById(R.id.idImagenEncontrados);
        }
    }
}
