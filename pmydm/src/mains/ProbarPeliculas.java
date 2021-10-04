package mains;

import clases.Pelicula;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProbarPeliculas {
    public static void main(String[] args) {
        Pelicula pp1 = new Pelicula();
        pp1.setM_sTitulo("1");
        pp1.setM_nAnio(1991);
        Pelicula pp2 = new Pelicula();
        pp2.setM_sTitulo("2");
        pp2.setM_sDirector("Manolo");
        pp2.setM_nAnio(1990);
        Pelicula pp3 = new Pelicula();
        pp3.setM_sTitulo("3");
        pp3.setM_nAnio(1990);
        pp3.setM_sCategoria("Humor");
        Pelicula pp4 = new Pelicula();
        pp4.setM_sTitulo("4");
        pp4.setM_nAnio(1998);
        Pelicula pp5 = new Pelicula();
        pp5.setM_sTitulo("5");
        pp5.setM_nAnio(1998);

        Pelicula h = pp3.peliculaMasAntigua(pp1,pp2,pp3);
        //System.out.println(h);

        /*
         array con 5 películas
         imprimir la película más antigua
         imprimir las que tengan el mismo director
         imprimir las que tengan el mismo director y categoría
         hashmap indexado por título de las 5 películas
         */
        Pelicula[] pelis = {pp1,pp2,pp3,pp4,pp5};
        System.out.println(pp1.peliculaMasAntigua(pelis));
        //mostrarPeliculas(mismoDirector(pelis,"Director"));
        //mostrarPeliculas(mismoDirectorYCategoria(pelis,"Director","Categoria"));
        HashMap<String, Pelicula> hmPeliculas = new HashMap<String,Pelicula>();
        for (int i = 0; i < pelis.length; i++) {
            hmPeliculas.put(pelis[i].getM_sTitulo(),pelis[i]);
        }
        System.out.println(hmPeliculas);
    }
     public static Pelicula[] mismoDirector(Pelicula[] peliculas,String director){
         ArrayList<Pelicula> pAux = new ArrayList<>();
         for (int i = 0; i < peliculas.length; i++) {
             if (peliculas[i].getM_sDirector().equals(director)) {
                 pAux.add(peliculas[i]);
             }
         }
         Pelicula[] arr = new Pelicula[pAux.size()];

         for (int i = 0; i < pAux.size(); i++)
             arr[i] = pAux.get(i);
         return arr;
     }

    public static Pelicula[] mismoDirectorYCategoria(Pelicula[] peliculas, String director, String categoria){
        Pelicula[] pelis = mismoDirector(peliculas,director);
        ArrayList<Pelicula> pAux = new ArrayList<>();
        for (int i = 0; i < pelis.length; i++) {
            if (pelis[i].getM_sCategoria().equals(categoria)) {
                pAux.add(pelis[i]);
            }
        }
        Pelicula[] arr = new Pelicula[pAux.size()];

        for (int i = 0; i < pAux.size(); i++)
            arr[i] = pAux.get(i);
        return arr;
    }

     public static void mostrarPeliculas(Pelicula[] peliculas){
         for (Pelicula pelicula : peliculas) {
             System.out.println(pelicula);
         }
     }
}

