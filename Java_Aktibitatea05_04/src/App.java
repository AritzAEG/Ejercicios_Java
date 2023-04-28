import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int [] numeros = new int [5];

        int numero;

        boolean esMultiplo = false;

        Scanner pregunta = new Scanner(System.in);

        for (int i = 0; i < 5; i++) 
        {
            numero = pregunta.nextInt();

            numeros[i] = numero;
        }

        for (int i = 0; i < numeros.length; i++)
        {
            if (numeros[i] % 3 == 0)
            {
                esMultiplo = true;
            }
        }

        System.out.println(esMultiplo);
    }
}