package mains;

import java.util.ArrayList;
import java.util.HashMap;

public class Main9 {
    public static void main(String[] args) {
        HashMap <String, String> hmjugadores = new HashMap<String,String>();
        HashMap <String, String> jugadorNacionalidad = new HashMap<String,String>();
        hmjugadores.put("moran","Barcelona");
        hmjugadores.put("vera","Pozuelo");
        hmjugadores.put("recio","retamar");
        hmjugadores.put("Maset","Madrid");
        hmjugadores.put("Vinicius","Madrid");
        hmjugadores.put("ramos","psg");
        jugadorNacionalidad.put("moran","ES");
        jugadorNacionalidad.put("vera","Fr");
        jugadorNacionalidad.put("recio","Po");
        jugadorNacionalidad.put("Maset","ES");
        jugadorNacionalidad.put("Vinicius","Fr");
        jugadorNacionalidad.put("ramos","PO");
        System.out.println(hmjugadores);
        System.out.println(jugadorNacionalidad);

        System.out.println("el equipo de recio es:"+ hmjugadores.get("recio"));
        //escribir los jugadores del madrid
        System.out.println(getKeysFromValues("Madrid", hmjugadores ));
        System.out.println(JugadoresPaises( "Madrid","ES",hmjugadores, jugadorNacionalidad));
        //utilizando un metodo que devuelve las claves de un valor
    }

    private static ArrayList<String> getKeysFromValues(String sValue, HashMap<String, String> hMap) {
        ArrayList<String> resultado = new ArrayList<>();
        for (String i : hMap.keySet()) {
            if(hMap.get(i).equals(sValue)) {
                //System.out.println(i);
                resultado.add(i);
            }
        }
        //System.out.println(getKeysFromValues("Madrid", hmjugadores ));
        return resultado;
    }
    //saca el numero de jugadores que tienen el equipo y la nacionalidad que tu le pongas
    private static int JugadoresPaises(String equipo, String Nacionalidad,
                                       HashMap<String, String> hMap,
                                       HashMap<String, String> hMap1)
    {
        ArrayList<String> alJugadores = getKeysFromValues(equipo, hMap);
        int cont = 0;
        for (String jugador : alJugadores) {
            if(hMap1.get(jugador).equals(Nacionalidad)) {
                cont++;
            }
        }

        return cont;
    }
}