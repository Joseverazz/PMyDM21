package mains;

public class Main2 {
    public static void main(String[] args)
    {
        // obtener el número de letras e de un texto
        String sNombre = "arbertofernandezsanchez";
        int contador = 0;
        for (int i = 0; i<sNombre.length();i++)
        {
            if (sNombre.charAt(i) == 'e') contador++;
        }
        System.out.println(contador);
    }
}
