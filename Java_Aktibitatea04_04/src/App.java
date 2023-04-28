import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String transporte;

        int pagarBicicleta = 0, precioBicicleta = 3, kilometrosBicicleta;

        double kilometros;

        double toneladas, kilometrosCamion, pagarCamion = 0;

        double precioCamion = 0.70, precioCocheMoto = 0.50, precioTonelada = 0.80; 

        double  pagarCocheMoto = 0;

        Scanner pregunta = new Scanner (System.in);

        System.out.println("¿Que medio de transporte vas a utilizar?");

        transporte = pregunta.nextLine();

        if (transporte.equals("camion"))
        {
            System.out.println("¿Cuantas Kiloemtros vas a realizar?");

            kilometrosCamion = pregunta.nextDouble();

            System.out.println("¿Cuantas toneladas llevas?");

            toneladas = pregunta.nextDouble();

            pagarCamion = ((kilometrosCamion * precioCamion) + (toneladas * precioTonelada));

            System.out.println(transporte +" tiene que pagar: "+ pagarCamion +" euros");
        }
        else if (transporte.equals("moto") || transporte.equals("coche"))
        {
            System.out.println("¿Cuantas Kilometros vas a realizar?");

            kilometros = pregunta.nextInt();

            pagarCocheMoto = kilometros * precioCocheMoto;

            System.out.println(transporte +" tiene que pagar: "+ pagarCocheMoto +" euros");
        }
        else if (transporte.equals("bicicleta"))
        {
            System.out.println("¿Cuantas Kilometros vas a realizar?");

            kilometrosBicicleta = pregunta.nextInt();

            pagarBicicleta = kilometrosBicicleta * precioBicicleta;

            System.out.println(transporte +" tiene que pagar: "+ pagarBicicleta +" euros");
        }
        else
        {
            System.out.println("No se reconoce el medio de transporte");
        }
       

    }
}