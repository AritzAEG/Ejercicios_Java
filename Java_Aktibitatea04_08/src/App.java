import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //A eta B balioak elkarren artean trukatzeko programa idatzi.
        String A, B, C;

        Scanner pregunta = new Scanner (System.in);

        System.out.println("Introduce una palabra");

        A = pregunta.nextLine();

        System.out.println("Introduce otra palabra");

        B = pregunta.nextLine();

        C = A;

        A = B;

        B = C;

        System.out.println("A: "+ A);

        System.out.println("B: "+ B);

    }
}