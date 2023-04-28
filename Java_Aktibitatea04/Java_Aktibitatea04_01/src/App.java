import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        //PARA GUARDAR EL NUMERO QUE NOS DE EL USUARIO
        int zenbakia;
        //PARA GUARDAR SI ES NEGATIVO O POSITIVO EL NUMERO QUE NOS DA EL USUARIO
        boolean positiboa;
        //METODO PARA PEDIR AL USUARIO UN NUMERO
        Scanner galdera = new Scanner (System.in);
        //PEDIR AL USUARIO UN NUMERO
        System.out.println("Sartu zenbaki bat");
        zenbakia = galdera.nextInt();

        if (zenbakia >= 0) 
        {
            positiboa = true;
        }
        else
        {
            positiboa = false;
        }

        if (positiboa == true)
        {
            System.out.println("Zenbakia Positiboa da.");
        }
        else
        {
            System.out.println("Zenbakia Negativoa da.");
        }
    }
}
