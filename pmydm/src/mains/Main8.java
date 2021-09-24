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

        int nAleatorio;
        int nCartones = 20000;
        int nAux;
        List<String> bingo;
        List<List> cartones = new ArrayList<>(3);
        boolean comprobante = false;
        while (cartones.size() != nCartones){
            bingo = new ArrayList<>();
            while(bingo.size()  != 5){
                nAleatorio = lib.aleatorio(0,5); //(int) (Math.random()*9);
                if (!bingo.contains(marcas.get(nAleatorio))){
                    bingo.add(marcas.get(nAleatorio));
                }
            }
            if (cartones.size()!=0)nAux = cartones.size();
            else nAux = 1;
            for (int i = 0; i < nAux; i++) {
                boolean b = false;
                if (cartones.size()!=0) {
                    b = cartones.get(i).contains(bingo.get(0)) &&
                            cartones.get(i).contains(bingo.get(1)) &&
                            cartones.get(i).contains(bingo.get(2)) &&
                            cartones.get(i).contains(bingo.get(3)) &&
                            cartones.get(i).contains(bingo.get(4));
                }
                if (!b) {
                    comprobante = true;


                }
            }
            if (comprobante){
                comprobante = false;
                cartones.add(bingo);
            }
        }

        for (List carton:cartones) {
            String sComma = "";
            for (Object cart : carton)
            {
                System.out.print(sComma+ cart);
                sComma = ",";
            }
            System.out.println();

        }
    }
}
