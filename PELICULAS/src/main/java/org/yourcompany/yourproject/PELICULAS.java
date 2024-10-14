
package org.yourcompany.yourproject;


import org.yourcompany.yourproject.Genero.Accion.Accion;
import org.yourcompany.yourproject.Genero.Drama.Drama;
import org.yourcompany.yourproject.Genero.Terror.Terror;

public class PELICULAS {

    public static void main(String[] args) {
        Terror terror1 = new Terror(2013, "James Wan", 112, "Terror", "El Conjuro", "18","Sobrenatural","Alta");
        Terror terror2 = new Terror(2017, "Andy Muschietti", 135, "Terror", "IT", "18","Psicológico","Media");
        Terror terror3 = new Terror(2018, "Ari Aster", 127, "Terror", "Hereditary", "18","Psicológico","baja");
        Terror terror4 = new Terror(2018, "John Krasinski", 90, "Terror", "Un lugar en silencio", "13","Suspenso","Alta");
        System.out.println("------PELICULAS DE TERROR----");

        System.out.println(terror1.mostrarDetalles());
        System.out.println(terror2.mostrarDetalles());
        System.out.println(terror3.mostrarDetalles());
        System.out.println(terror4.mostrarDetalles());


        System.out.println("------PELICULAS DE ACCION----");
        Drama pelicula1 = new Drama(1994, "Frank Darabont", 142,"Drama", "The Shawshank Redemption", "Prisión","Puede contener drogas","Alto");
        Drama pelicula2 = new Drama(1999, "Sam Mendes", 122, "Drama", "American Beauty", "Psicológico","Puede contener relaciones sexuales", "Alto");
        Drama pelicula3 = new Drama(2016, "Barry Jenkins", 111 , "Drama", "Moonlight", "Coming-of-age","Puede contener alcohol","Bajo");
        Drama pelicula4 = new Drama(1993, "Steven Spielberg", 195, "Drama", "Schindler's List", "Histórico","Puede contener violencia","Medio");
        Drama pelicula5 = new Drama(2004, "Nick Cassavetes", 123, "Drama", "Diario de una pasión", "Romántico","Puede contener relaciones sexuales","Alto");

        System.out.println(pelicula1.toString());
        System.out.println(pelicula2.toString());
        System.out.println(pelicula3.toString());
        System.out.println(pelicula4.toString());
        System.out.println(pelicula5.toString());


        System.out.println("------PELICULAS DE TERROR----");
        System.out.println("------PELICULAS DE TERROR----");


    }
}
