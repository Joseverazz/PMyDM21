package mains;

public class Main3 {
    public static void main(String[] args)
    {
        // imprimir la lista de palabras de un texto
        String sNombre = "arb erto fernan dez san chez";
        int a = -1;
        for (int i = 0; i<sNombre.length();i++)
        {
            if (sNombre.charAt(i) == ' ') {
                System.out.println(sNombre.substring(a+1,i));
                a = i;
            }
        }
        System.out.println(sNombre.substring(a+1));

        String sNombre2 ="";
        for (int i = 0; i<sNombre.length();i++) {
            if (sNombre.charAt(i) == ' ')
            {
                System.out.println(sNombre2);
                sNombre2="";
            }
            else
            {
                sNombre2=sNombre2+sNombre.charAt(i);
            }
        }


    }
}
