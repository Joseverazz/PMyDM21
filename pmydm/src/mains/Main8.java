package mains;

import fsg.lib;

import java.util.ArrayList;
import java.util.List;

public class Main8 {
    public static void main(String[] args) {
        // crear un arraylist e introducir los números impares entre 1 y 100
        List<String> marcas = new ArrayList<>();

        marcas.add("Seat");
        marcas.add("Fiat");
        marcas.add("Ford");
        marcas.add("Audi");
        marcas.add("Citroen");
        marcas.add("Bmw");
        marcas.add("Mercedes");
        marcas.add("Opel");
        marcas.add("Porche");
        marcas.add("Lamborghini");
        marcas.add("Porche");

        List<List<String>> cartones = new ArrayList<>(3);
        int nCartones = 20;
        for (int i = 0; i < nCartones;) {
            ArrayList<String> bingo = generarCarton(marcas);
            if (!esRepetido(cartones, bingo))
            {
                cartones.add(bingo);
                i++;
            }
        }

        for (List carton:cartones) {
            imprimirCarton(carton);
            System.out.println();
        }


    }

    private static boolean esRepetido(List<List<String>> cartones, List<String> bingo) {
        boolean b = false;
        for (List<String> carton : cartones) {
            b = esRepetidoCarton(bingo, carton);
            if (b) break;
        }
        return b;
    }

    private static boolean esRepetidoCarton(List<String> bingo, List<String> carton) {
        for (String s : bingo) {
            if (!carton.contains(s))
                return false;
        }
        return true;
    }

    private static void imprimirCarton(List carton) {
        String sComma = "";
        for (Object cart : carton)
        {
            System.out.print(sComma+ cart);
            sComma = ",";
        }
    }

    private static ArrayList<String> generarCarton(List<String> marcas){
        int nAleatorio;
        ArrayList<String> bingoAux = new ArrayList<>();
        while(bingoAux.size()  != 5){
            nAleatorio = lib.aleatorio(0,6); //(int) (Math.random()*9);
            if (!bingoAux.contains(marcas.get(nAleatorio))){
                bingoAux.add(marcas.get(nAleatorio));
            }
        }
        return bingoAux;
    }
}
