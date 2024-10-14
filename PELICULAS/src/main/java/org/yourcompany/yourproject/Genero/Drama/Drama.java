package org.yourcompany.yourproject.Genero.Drama;

import org.yourcompany.yourproject.Genero.Genero;

public class Drama extends Genero {
    public String advertencia;
    public String nivelEmocional;

    public Drama(int año, String director, int duracion, String genero, String nombre, String restriccion, String advertencia, String nivelEmocional) {
        super(año, director, duracion, genero, nombre, restriccion);
        this.advertencia = advertencia;
        this.nivelEmocional = nivelEmocional;
    }

    public String getAdvertencia() {
        return advertencia;
    }

    public void setAdvertencia(String advertencia) {
        this.advertencia = advertencia;
    }

    @Override
    public String toString() {
        return super.toString()+
                "advertencia='" + advertencia + '\'' +
                "nivel Emocional='" + nivelEmocional + '\'' +
                '}';
    }
}
