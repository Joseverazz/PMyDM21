package mains;

import clases.Pelicula;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProbarPeliculas {
    public static void main(String[] args) {
        Pelicula pp1 = new Pelicula();
        pp1.setM_sTitulo("1");
        pp1.setM_sDirector("Manolo");
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
        pp5.setM_sDirector("Roberto");
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

        List<Pelicula> alPeliculas = new ArrayList<>();
        alPeliculas.add(pp1);
        alPeliculas.add(pp2);
        alPeliculas.add(pp3);
        alPeliculas.add(pp4);
        alPeliculas.add(pp5);

        //System.out.println(getPeliMasAntigua(alPeliculas));
        mostrarPeliculas(getPeliMismoDirector(alPeliculas));
        //mostrarPeliculas(getPeliMismoDirectorYCategoria(alPeliculas));

        HashMap<String, Pelicula> hmPeliculas = new HashMap<String,Pelicula>();
        for (Pelicula alPelicula : alPeliculas) {
            hmPeliculas.put(alPelicula.getM_sTitulo(), alPelicula);
        }
        //System.out.println(hmPeliculas);
    }
     public static List<Pelicula> getPeliMismoDirector(List<Pelicula> peliculas){
         List<Pelicula> pAux = new ArrayList<>();
         for (int i = 0; i < peliculas.size(); i++)
         {
             for (int j = 0; j < peliculas.size(); j++) {
                 if (peliculas.get(j).getM_sDirector().equals(peliculas.get(i).getM_sDirector()) && i != j) {
                     pAux.add(peliculas.get(i));
                     break;
                 }
             }
         }
         return pAux;
     }

    public static List<Pelicula> getPeliMismoDirectorYCategoria(List<Pelicula> peliculas){
        List<Pelicula> pelis = getPeliMismoDirector(peliculas);
        List<Pelicula> pAux = new ArrayList<>();
        for (int i = 0; i < peliculas.size(); i++)
        {
            for (int j = 0; j < peliculas.size(); j++) {
                if (peliculas.get(j).getM_sDirector().equals(peliculas.get(i).getM_sDirector()) &&
                        peliculas.get(j).getM_sCategoria().equals(peliculas.get(i).getM_sCategoria()) &&
                        i != j)
                {
                    pAux.add(peliculas.get(i));
                    break;
                }
            }
        }
        return pAux;
    }

     public static void mostrarPeliculas(List<Pelicula> peliculas){
         for (Pelicula pelicula : peliculas) {
             System.out.println(pelicula);
         }
     }

    public static Pelicula getPeliMasAntigua(List<Pelicula> peliculas){
        Pelicula pAux = new Pelicula();
        pAux.setM_nAnio(Integer.MAX_VALUE);
        for (Pelicula pelis : peliculas) {
            if (pAux.getM_nAnio() > pelis.getM_nAnio())
                pAux = pelis;
        }
        return pAux;
    }
}

