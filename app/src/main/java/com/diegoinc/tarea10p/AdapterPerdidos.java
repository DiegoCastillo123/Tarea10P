package com.diegoinc.tarea10p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterPerdidos extends RecyclerView.Adapter<AdapterPerdidos.ViewHolderPerdidosMascotas>{

    ArrayList<VariablesPerdidos> listaPerdidosMascotas;

    public AdapterPerdidos(ArrayList<VariablesPerdidos> listaPerdidosMascotas) {
        this.listaPerdidosMascotas = listaPerdidosMascotas;
    }

    @Override
    public ViewHolderPerdidosMascotas onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_perdidos,null,false);
        return new ViewHolderPerdidosMascotas(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPerdidosMascotas holder, int position) {

        holder.Et_nombrePerdidos.setText(listaPerdidosMascotas.get(position).getNombrePerdidos());
        holder.Et_informacionPerdidos.setText(listaPerdidosMascotas.get(position).getInfoPerdidos());
        holder.fotoPerdidos.setImageResource(listaPerdidosMascotas.get(position).getFotoPerdidos());
    }

    @Override
    public int getItemCount() {
        return listaPerdidosMascotas.size();
    }

    public class ViewHolderPerdidosMascotas extends RecyclerView.ViewHolder {

        TextView Et_nombrePerdidos, Et_informacionPerdidos;
        ImageView fotoPerdidos;
        public ViewHolderPerdidosMascotas(View itemView) {
            super(itemView);
            Et_nombrePerdidos = (TextView) itemView.findViewById(R.id.idNombrePerdidos);
            Et_informacionPerdidos = (TextView) itemView.findViewById(R.id.idInfoPerdidos);
            fotoPerdidos = (ImageView) itemView.findViewById(R.id.idImagenPerdidos);
        }
    }
}
