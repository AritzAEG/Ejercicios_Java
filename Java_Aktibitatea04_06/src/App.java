import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        double nota1, nota2, nota3, nota4, media = 0;

        Scanner pregunta = new Scanner (System.in);

        System.out.println("Dame cuatro notas");

        nota1 = pregunta.nextDouble();
        nota2 = pregunta.nextDouble();
        nota3 = pregunta.nextDouble();
        nota4 = pregunta.nextDouble();

        media = ((nota1 + nota2 + nota3 + nota4) / 4);

        System.out.println("La media entre las cuatro notas es: "+ media);
    }
}