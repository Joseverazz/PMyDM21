package mains;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main9 {
    public static void main(String[] args) {
        HashMap<String,String> hmJugadores = new HashMap<>();
        hmJugadores.put("Moran","Barcelona");
        hmJugadores.put("Vera","Pozuelo");
        hmJugadores.put("Recio","Retamar");
        hmJugadores.put("Maset","Madrid");
        hmJugadores.put("Vinicius","Madrid");
        hmJugadores.put("Ramos","Madrid");
        System.out.println(hmJugadores);

        System.out.println("El equipo de recio es: "+hmJugadores.get("Recio"));

        //Escribir los jugadores del madrid
        System.out.print("Los jugadores del madrid son: "+getKeysFromValue("Madrid",hmJugadores));

    }
    private static List<String> getKeysFromValue(String sValue, HashMap<String, String> hMap){
        List<String> resultado = new ArrayList<>();
        for(String i: hMap.keySet()) {
            if (hMap.get(i).equals(sValue)) resultado.add(i);
        }
        return resultado;
    }
}
