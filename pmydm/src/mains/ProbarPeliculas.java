package mains;

import clases.Pelicula;

public class ProbarPeliculas {
    public static void main(String[] args) {
        Pelicula pp1 = new Pelicula();
        pp1.setM_sTitulo("1");
        pp1.setM_nAnio(1991);
        Pelicula pp2 = new Pelicula();
        pp2.setM_sTitulo("2");
        pp2.setM_nAnio(1990);
        Pelicula pp3 = new Pelicula();
        pp3.setM_sTitulo("3");
        pp3.setM_nAnio(1998);

        Pelicula h = pp3.peliculaMasAntigua(pp1,pp2,pp3);
        System.out.println(h);

        /*
         array con 5 películas
         imprimir la película más antigua
         imprimir las que tengan el mismo director
         imprimir las que tengan el mismo director y categoría
         hashmap indexado por título de las 5 películas
         */
        Pelicula[] pelis = {new Pelicula(), new Pelicula(), new Pelicula(), new Pelicula(), new Pelicula()};
    }
}

