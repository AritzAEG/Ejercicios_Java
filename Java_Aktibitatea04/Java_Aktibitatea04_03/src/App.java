import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        //PARA GUARDAR EL NUMERO QUE NOS DE EL USUARIO
        int zenbakia1, zenbakia2;
        //METODO PARA PEDIR AL USUARIO UN NUMERO
        Scanner galdera = new Scanner (System.in);
        //PEDIR AL USUARIO UN NUMERO
        System.out.println("Sartu zenbaki bat");
        zenbakia1 = galdera.nextInt();
        //PEDIR AL USUARIO OTRO NUMERO
        System.out.println("Sartu zenbaki bat");
        zenbakia2 = galdera.nextInt();

        if (zenbakia1 > zenbakia2)
        {
            System.out.println("El numero "+ zenbakia1 +" es mayor que el numero "+ zenbakia2);
        }
        else if (zenbakia2 > zenbakia1)
        {
            System.out.println("El numero "+ zenbakia1 +" es menor que el numero "+ zenbakia2);
        }
        else
        {
            System.out.println("El numero "+ zenbakia1 +" es igual que el numero "+ zenbakia2);
        }
    }
}
