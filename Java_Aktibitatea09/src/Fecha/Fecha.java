package Fecha;

public class Fecha {

    public int dia;
    public int mes;
    public int año;


    public Fecha()
    {
        dia = 2;
        mes = 2;
        año = 2004;
    }

    public Fecha(int d, int m, int a)
    {
        this.dia = d;
        this.mes = m;
        this.año = a;
    }

    public int hiruHileko()
    {
        if (mes >= 0 && mes <= 3)
        {
            return 1;
        }
        else if (mes > 3 && mes <= 6)
        {
            return 2;
        }
        else if (mes > 6 && mes <= 9)
        {
            return 3;
        }
        else if (mes > 9 && mes <= 12)
        {
            return 4;
        }
        else 
        {
            return 0;
        }
    }

    public int lauHileko()
    {
        if (mes >= 1 && mes <= 4)
        {
            return 1;
        }
        else if (mes > 4 && mes <= 8)
        {
            return 2;
        }
        else if (mes > 8 && mes <= 12)
        {
            return 3;
        }
        else 
        {
            return 0;
        }
    }

    public int seiHileko()
    {
        if (mes >= 1 && mes <= 6)
        {
            return 1;
        }
        else if (mes > 6 && mes <= 12)
        {
            return 2;
        }
        else 
        {
            return 0;
        }
    }

    public String hilabeteaIzenaGaztelaniaz()
    {
        switch (mes) {
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

    public String hilabeteaIzenaEuskaraz()
    {
        switch (mes) {
            case 1:
                return "Urtarrila";
            case 2:
                return "Otsaila";
            case 3:
                return "Martxoa";
            case 4:
                return "Apirila";
            case 5:
                return "Maiatza";
            case 6:
                return "Ekaina";
            case 7:
                return "Uztaila";
            case 8:
                return "Abuztua";
            case 9:
                return "Iraila";
            case 10:
                return "Urria";
            case 11:
                return "Azaroa";
            case 12:
                return "Abendua";
            default:
                return "Hilabete baliogabea";
        }
    }

    public int hilEgunKopuruMax()
    {
        //Si es bisiesto
        if (año % 4 == 0)
        {
            switch (mes) {
                case 1, 3, 5, 7, 8, 10, 12:
                    return 31;
                case 4, 6, 9, 11:
                    return 30;
                case 2:
                    return 28;
                default:
                    return 30;
            }
        }
        //No es bisiesto
        else 
        {
            switch (mes) {
                case 1, 3, 5, 7, 8, 10, 12:
                    return 31;
                case 4, 6, 9, 11:
                    return 30;
                case 2:
                    return 29;
                default:
                    return 30;
            }
        }   
    }

    public boolean bisiestoDa()
    {
        if (año % 4 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void egunaAldatu(int d)
    {
        if (año % 4 == 0)
        {
            switch (mes) {
                case 1, 3, 5, 7, 8, 10, 12:
                    if (dia >= 0 && dia <= 31)
                    {
                        dia = d;
                    }
                case 4, 6, 9, 11:
                    if (dia >= 0 && dia <= 30)
                    {
                        dia = d;
                    }
                case 2:
                if (dia >= 0 && dia <= 28)
                    {
                        dia = d;
                    }
            }
        }
        else
        {
            switch (mes) {
                case 1, 3, 5, 7, 8, 10, 12:
                    if (dia >= 0 && dia <= 31)
                    {
                        dia = d;
                    }
                case 4, 6, 9, 11:
                    if (dia >= 0 && dia <= 30)
                    {
                        dia = d;
                    }
                case 2:
                if (dia >= 0 && dia <= 29)
                    {
                        dia = d;
                    }
            }
        }
    }
}
