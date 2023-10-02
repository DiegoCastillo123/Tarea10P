package com.diegoinc.tarea10p;

public class VariablesPerdidos {

    private String nombrePerdidos;
    private String infoPerdidos;
    private int fotoPerdidos;

    public VariablesPerdidos() {
    }

    public VariablesPerdidos(String nombrePerdidos, String infoPerdidos, int fotoPerdidos) {
        this.nombrePerdidos = nombrePerdidos;
        this.infoPerdidos = infoPerdidos;
        this.fotoPerdidos = fotoPerdidos;
    }

    public String getNombrePerdidos() {
        return nombrePerdidos;
    }

    public void setNombrePerdidos(String nombrePerdidos) {
        this.nombrePerdidos = nombrePerdidos;
    }

    public String getInfoPerdidos() {
        return infoPerdidos;
    }

    public void setInfoPerdidos(String infoPerdidos) {
        this.infoPerdidos = infoPerdidos;
    }

    public int getFotoPerdidos() {
        return fotoPerdidos;
    }

    public void setFotoPerdidos(int fotoPerdidos) {
        this.fotoPerdidos = fotoPerdidos;
    }



}
