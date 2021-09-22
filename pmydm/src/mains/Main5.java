package mains;

import java.util.*;
public class Main5 {
    public static void main(String[] args)
    {
        // imprimir numero de palabras iguales
        String sNombre = "alb erto erto erto al7 sds fvd fer alf al7 dez dez alb alb alb san chez";
        String[] aPalabras = sNombre.split(" ");
        List alIguales = new ArrayList();
        for (int i = 0; i<aPalabras.length;i++)
        {
            for (int j = 0; j<aPalabras.length;j++)
            {
                if(aPalabras[i].equals(aPalabras[j]) && i != j && !alIguales.contains(aPalabras[i])){
                    alIguales.add(aPalabras[i]);
                }
            }
        }
        System.out.println("Se repiten "+alIguales.size()+" palabras en esta frase");


        String[] sAux = sNombre.split(" ");
        boolean[] bAux = new boolean[sAux.length];
        int cont = 0;
        for (int i = 0; i<sAux.length;i++)
        {
            for (int j = 0; j<sAux.length;j++)
            {
                if(sAux[i].equals(sAux[j]) && i != j && !bAux[i] && !bAux[j]){
                    cont++;
                    for (int z = 0; z<sAux.length;z++){
                        if (sAux[i].equals(sAux[z])) bAux[z] = true;
                    }
                }
            }
        }
        System.out.println("Se repiten "+cont+" palabras en esta frase");

    }
}
