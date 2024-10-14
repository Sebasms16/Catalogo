package org.yourcompany.yourproject.Genero.Comedia;

import org.yourcompany.yourproject.Genero.Genero;

public class Comedia extends Genero {
    private String tipoHumor;

    public Comedia(int año, String director, int duracion, String genero, String nombre, String restriccion, String tipoHumor) {
        super(año, director, duracion, genero, nombre, restriccion);
        this.tipoHumor = tipoHumor;
    }

    public String getTipoHumor() {
        return tipoHumor;
    }

    public void setTipoHumor(String tipoHumor) {
        this.tipoHumor = tipoHumor;
    }

    @Override
    public String toString() {
        return super.toString() +
                "tipoHumor='" + tipoHumor + '\'' +
                '}';
    }
}

