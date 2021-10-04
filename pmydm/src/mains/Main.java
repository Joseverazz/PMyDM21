package mains;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean bOk = true;
        boolean bOk2 = false;

        char cCar1 = 'e';
        String cCar2 = "e";

        boolean bb1;
        Boolean bb2;

        bb1 = true;
        //bb2 = new Boolean(true);

        String sStr1 = "ju ju ju";
        String sStr2 = new String("ju ju ju");

        String sP = "HOLA MUNDO";

        //pasar a otro string pero en minúscula
        String sP2 = sP.toLowerCase();
        System.out.println(sP2);

        //imprimir el número de caracteres del String
        System.out.println(sP.length());

        //imprimir lo que hay después del espacio
        System.out.println(sP.substring(sP.indexOf(" ")+1));
        /*
        for (int i = 0; i < 10; i++){
            System.out.println("NO ME . . . .");
        }
        */
        // que me escriba del 1 al 15
        /*
        for (int i = 1; i < 16; i++){
            System.out.println(i);
        }
        //que lo escriba en orden inverso
        for (int i = 15; i > 0; i--){
            System.out.println(i);
        }*/

        //imprimir los pares entre 1 y 200
        for (int i = 2; i < 201; i = i+2){
            System.out.println(i);
        }
    }
}