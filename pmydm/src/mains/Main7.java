package mains;
import java.util.List;
import java.util.ArrayList;
public class Main7 {
    public static void main(String[] args)
    {
        // crear un arraylist e introducir los numeros impares entre 1 y 100
        List<Integer> alNumerosImpares = new ArrayList<>();

        for (int i = 1; i < 101; i +=2) {
            alNumerosImpares.add(i);
        }
        String sComma = "";
        for (Integer nuI:alNumerosImpares)
        {
            System.out.print(sComma+nuI);
            sComma = ",";
        }
    }
}
