package mains;

public class Main4 {
    public static void main(String[] args)
    {
        // imprimir la lista de palabras de tamaño impar
        String sNombre = "arb erto fernan dez san chez";
        String sAux [] = sNombre.split(" ");
        for (int i = 0; i<sAux.length;i++)
        {
            if (sAux[i].length()%2 != 0) {
                System.out.println(sAux[i]);
            }
        }
    }
}
