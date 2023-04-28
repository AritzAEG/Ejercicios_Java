import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        //PARA GUARDAR EL NUMERO QUE NOS DE EL USUARIO
        int zenbakia1, zenbakia2;
        //PARA GUARDAR EL RESTO DE LA DIVISION ENTRE LOS DOS NUMEROS
        int resto;
        //PARA SABER SI ES MULTIPLO UN NUMERO DE OTRO
        boolean multiploa = false;
        //METODO PARA PEDIR AL USUARIO UN NUMERO
        Scanner galdera = new Scanner (System.in);
        //PEDIR AL USUARIO UN NUMERO
        System.out.println("Sartu zenbaki bat");
        zenbakia1 = galdera.nextInt();
        //PEDIR AL USUARIO OTRO NUMERO
        System.out.println("Sartu zenbaki bat");
        zenbakia2 = galdera.nextInt();

        resto = zenbakia1 % zenbakia2;

        if (resto == 0)
        {
            multiploa = true;
        } 
        
        if (multiploa == true)
        {
            System.out.println("El numero "+ zenbakia1 +" es multiplo del numero "+ zenbakia2);
        }
        else
        {
            System.out.println("El numero "+ zenbakia1 +" NO es multiplo del numero "+ zenbakia2);
        }
    }
}
