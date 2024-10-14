package org.yourcompany.yourproject.Genero.Terror;

import org.yourcompany.yourproject.Genero.Gen;
import org.yourcompany.yourproject.Genero.Genero;

public class Terror extends Genero {
    private String tipo;
    private String intensidad;

    public Terror(int año, String director, int duracion, String genero, String nombre, String restriccion, String tipo, String intensidad) {
        super(año, director, duracion, genero, nombre, restriccion);
        this.tipo = tipo;
        this.intensidad= intensidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    @Override
    public String mostrarDetalles() {
        return super.toString()+
                "tipo='" + tipo + '\'' +
                "intensidad='" + intensidad + '\'' +
                '}';
    }


}
