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
        //mostrarPeliculas(getPeliMismoDirector(alPeliculas));
        //mostrarPeliculas(getPeliMismoDirectorYCategoria(alPeliculas));

        HashMap<String, Pelicula> hmPeliculas = new HashMap<String,Pelicula>();
        for (Pelicula alPelicula : alPeliculas) {
            hmPeliculas.put(alPelicula.getM_sTitulo(), alPelicula);
        }
        //System.out.println(hmPeliculas);
        mostrarPeliculas(generarListaDePeliculasPorDirector(hmPeliculas,"Manolo"));

        Pelicula  ppp = generarNuevaPelicula(hmPeliculas,"2","5");
    }

    private static Pelicula generarNuevaPelicula(HashMap<String, Pelicula> hmPeliculas, String titulo1, String titulo2) {
        Pelicula pAux = new Pelicula();
        Pelicula p1 = hmPeliculas.get(titulo1);
        Pelicula p2 = hmPeliculas.get(titulo2);

        if (p1.getM_sTitulo().equalsIgnoreCase(p2.getM_sTitulo()))
            pAux.setM_sTitulo(p1.getM_sTitulo());

        if (p1.getM_sCategoria().equalsIgnoreCase(p2.getM_sCategoria()))
            pAux.setM_sCategoria(p1.getM_sCategoria());

        if (p1.getM_sDirector().equalsIgnoreCase(p2.getM_sDirector()))
            pAux.setM_sDirector(p1.getM_sDirector());

        if (p1.getM_nAnio() == p2.getM_nAnio())
            pAux.setM_nAnio(p1.getM_nAnio());

        if (p1.getM_nDuracion() == p2.getM_nDuracion())
            pAux.setM_nDuracion(p1.getM_nDuracion());

        return pAux;
    }

    private static List<Pelicula> generarListaDePeliculasPorDirector(HashMap<String, Pelicula> hmPeliculas, String director) {
        List<Pelicula> pAux = new ArrayList<>();

        for (String i : hmPeliculas.keySet()) {
            if (hmPeliculas.get(i).getM_sDirector().equals(director )) {
                pAux.add(hmPeliculas.get(i));
            }
        }
        return pAux;
    }

    public static List<Pelicula> getPeliMismoDirector(List<Pelicula> peliculas){
         List<Pelicula> pAux = new ArrayList<>();
         /*
         for (int i = 0; i < peliculas.size(); i++)
         {
             for (int j = 0; j < peliculas.size(); j++) {
                 if (peliculas.get(j).getM_sDirector().equals(peliculas.get(i).getM_sDirector()) && i != j) {
                     pAux.add(peliculas.get(i));
                     break;
                 }
             }
         }
         */
         for (int i = 0; i < peliculas.size(); i++) {
             int nNumOcu = nOcurrenciasMismoDirector(peliculas.get(i),peliculas);

             if (nNumOcu > 1)
                 pAux.add(peliculas.get(i));
         }
         return pAux;
     }

    private static int nOcurrenciasMismoDirector(Pelicula pelicula, List<Pelicula> peliculas) {
        int nContOcu = 0;
        for (Pelicula value : peliculas) {
            if (pelicula.getM_sDirector().equalsIgnoreCase(value.getM_sDirector()))
                nContOcu++;
        }
        return nContOcu;
    }

    public static List<Pelicula> getPeliMismoDirectorYCategoria(List<Pelicula> peliculas){
        List<Pelicula> pAux = new ArrayList<>();
        /*
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
         */

        for (int i = 0; i < peliculas.size(); i++) {
            int nNumOcu = nOcurrenciasMismoDirectorYCategoria(peliculas.get(i),peliculas);

            if (nNumOcu > 1)
                pAux.add(peliculas.get(i));
        }

        return pAux;
    }

    private static int nOcurrenciasMismoDirectorYCategoria(Pelicula pelicula, List<Pelicula> peliculas) {
        int nContOcu = 0;
        for (Pelicula value : peliculas) {
            if (pelicula.getM_sDirector().equalsIgnoreCase(value.getM_sDirector()) &&
                    pelicula.getM_sCategoria().equalsIgnoreCase(value.getM_sCategoria()))
                nContOcu++;
        }
        return nContOcu;
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

