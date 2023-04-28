import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int numero = 0;

        Scanner pregunta = new Scanner(System.in);

        System.out.println("Dame un numero y te dire si es multiplo de 3, 6 o 9");

        numero = pregunta.nextInt();

        while (numero != 0)
        {
            if (numero % 9 == 0)
            {
                System.out.println(numero +" es multiplo de 9");
    
                if (numero % 6 == 0)
                {
                    System.out.println(numero +" es multiplo de 6");
    
                    if (numero % 3 == 0)
                    {
                        System.out.println(numero +" es multiplo de 3");
                    }
                }
                else if (numero % 3 == 0)
                {
                    System.out.println(numero +" es multiplo de 3");
                }
            }
            else if (numero % 6 == 0)
            {
                System.out.println(numero +" es multiplo de 6");

                if (numero % 3 == 0)
                    {
                        System.out.println(numero +" es multiplo de 3");
                    }
            }
            else if (numero % 3 == 0)
            {
                System.out.println(numero +" es multiplo de 3");
            }
    
            System.out.println("Dame otro numero");

            numero = pregunta.nextInt();
        }

        
    }
}