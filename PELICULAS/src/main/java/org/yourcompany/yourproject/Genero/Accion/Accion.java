package org.yourcompany.yourproject.Genero.Accion;

import org.yourcompany.yourproject.Genero.Genero;

public class Accion extends Genero {
    private String tipoProtagonista;
    private String foto;

    public Accion(int año, String director, int duracion, String genero, String nombre, String restriccion, String tipoProtagonista, String foto) {
        super(año, director, duracion, genero, nombre, restriccion);
        this.tipoProtagonista = tipoProtagonista;
        this.foto = foto;


    }

    public String getTipoProtagonista() {
        return tipoProtagonista;
    }

    public void setTipoProtagonista(String tipoProtagonista) {
        this.tipoProtagonista = tipoProtagonista;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return super.toString()+
                "tipoProtagonista='" + tipoProtagonista + '\'' +
                ", foto='" + foto + '\'' +
                '}';
    }
}
