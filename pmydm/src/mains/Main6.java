package mains;

public class Main6 {
    public static void main(String[] args)
    {
        // sustituir las vocales por un 2 de las palabras que empiecen por "el"
        String sNombre = "alb erto fer alf al7 dez dez alb san chez";
        String[] sAux = sNombre.split(" ");
        for (int i = 0; i<sAux.length;i++)
        {
            if (sAux[i].charAt(0) == 'a' && sAux[i].charAt(1) == 'l')
            {
                sAux[i] = sAux[i].replace('a','2');
                sAux[i] = sAux[i].replace('e','2');
                sAux[i] = sAux[i].replace('i','2');
                sAux[i] = sAux[i].replace('o','2');
                sAux[i] = sAux[i].replace('u','2');
            }
            System.out.println(sAux[i]);
        }
    }
}