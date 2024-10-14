package org.yourcompany.yourproject.Genero;

public class Genero implements Gen{

 
private String nombre;
private int año;
private int duracion;
private String genero;
private String director;
private String restriccion;

    public Genero(int año, String director, int duracion, String genero, String nombre, String restriccion) {
        this.año = año;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        this.nombre = nombre;
        this.restriccion = restriccion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRestriccion() {
        return restriccion;
    }

    public void setRestriccion(String restriccion) {
        this.restriccion = restriccion;
    }


    @Override
    public String mostrarDetalles() {
        return  "nombre='" + nombre + '\'' +
                ", año=" + año +
                ", duracion=" + duracion +" min"+
                ", genero='" + genero + '\'' +
                ", director='" + director + '\'' +
                ", restriccion='" + restriccion + '\'';
    }
}






