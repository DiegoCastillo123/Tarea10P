package com.diegoinc.tarea10p;

public class VariablesEncontrados {

    private String infoEncontrados;
    private int fotoEncontrados;


    public VariablesEncontrados() {
    }

    public VariablesEncontrados( String infoEncontrados, int fotoEncontrados) {

        this.infoEncontrados = infoEncontrados;
        this.fotoEncontrados = fotoEncontrados;
    }


    public String getInfoEncontrados() {
        return infoEncontrados;
    }

    public void setInfoEncontrados(String infoEncontrados) {
        this.infoEncontrados = infoEncontrados;
    }

    public int getFotoEncontrados() {
        return fotoEncontrados;
    }

    public void setFotoEncontrados(int fotoEncontrados) {
        this.fotoEncontrados = fotoEncontrados;
    }
}
