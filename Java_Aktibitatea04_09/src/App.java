import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int numeroMes;

        String mes = "";

        Scanner pregunta = new Scanner (System.in);

        System.out.println("Introduce un numero y te dire al mes que corresponde");

        numeroMes = pregunta.nextInt();

        while (numeroMes >= 1 && numeroMes <= 12)
        {
            switch (numeroMes) {
                case 1:
                    mes = "Enero";
                    break;
                case 2:
                    mes = "Febrero";
                    break;
                case 3:
                    mes = "Marzo";
                    break;
                case 4:
                    mes = "Abril";
                    break;
                case 5:
                    mes = "Mayo";
                    break;
                case 6:
                    mes = "Junio";
                    break;
                case 7:
                    mes = "Julio";
                    break;
                case 8:
                    mes = "Agosto";
                    break;
                case 9:
                    mes = "Septiembre";
                    break;
                case 10:
                    mes = "Octubre";
                    break;
                case 11:
                    mes = "Noviembre";
                    break;
                case 12:
                    mes = "Diciembre";
                    break;
            }
    
            System.out.println(mes);

            System.out.println("Introduce otro numero");

            numeroMes = pregunta.nextInt();
        }

        System.out.println("Numero de mes incorrecto");
    }
}