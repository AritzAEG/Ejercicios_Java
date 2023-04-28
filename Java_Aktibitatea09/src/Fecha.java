public class Fecha {

    int dia;
    int mes;
    int año;

    Fecha (int d, int m, int a)
    {
        this();
        this.dia = d;
        this.mes = m;
        this.año = a;
    }

    public Fecha()
    {
        dia = 0;
        mes = 0;
        año = 0;
    }

    public String obtenerMes(int m)
    {
        switch (m) {
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
                return "Diciembre";
            default:
                return "Número de mes inválido";
        }
    }

    public static void main(String[] args) {

        int d = 2;
        int m = 5;
        int a = 2000;

        Fecha fecha2 = new Fecha (d, m, a);

        System.out.println(fecha2.obtenerMes(m));

    }
}