import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int numeroMes;

        boolean esMes = false;

        Scanner pregunta = new Scanner (System.in);

        System.out.println("Introduce un numero y te dire si corresponde a un mes");

        numeroMes = pregunta.nextInt();

        while (numeroMes >= 1 && numeroMes <= 12)
        {
            esMes = true;

            System.out.println(esMes);

            System.out.println("Introduce otro numero");

            numeroMes = pregunta.nextInt();
        }

        System.out.println("No corresponde a ningun mes");
    }
}