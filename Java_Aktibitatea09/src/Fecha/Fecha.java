package Fecha;

public class Fecha {

    public int dia;
    public int mes;
    public int año;


    public Fecha()
    {
        dia = 2;
        mes = 7;
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

    public boolean berdinakDira(Fecha a)
    {
        if ((a.dia == dia) && (a.mes == mes) && (a.año == año))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String konparatu(Fecha a)
    {
        if (año > a.año)
        {
            return "La fecha1 es mayor que la fecha2";
        }
        else if (año < a.año)
        {
            return "La fecha2 es mayor que la fecha1";
        }
        else if (año == a.año)
        {
            if (mes > a.mes)
            {
                return "La fecha1 es mayor que la fecha2";
            }
            else if (mes < a.mes)
            {
                return "La fecha2 es mayor que la fecha1";
            }
            else
            {
                if (dia > a.dia)
                {
                    return "La fecha1 es mayor que la fecha2";
                }
                else if (dia < a.dia)
                {
                    return "La fecha2 es mayor que la fecha1";
                }
                else
                {
                    return "Las fechas son iguales";
                }
            }
        }
        else
        {
            return "Fechas incorrectas";
        }
    }

    public int urteHasietatikZenbatEgun()
    {
        int sumaDias = 0;
        int diasMes = 0;

        for (int i = 1; i <= mes; i++)
        {
            if (año % 4 == 0)
            {
                if (i == 2)
                {
                    diasMes += 29;
                }
                else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i ==12)
                {
                    diasMes += 31;
                }
                else if (i == 4 || i == 6 || i == 9 || i == 11)
                {
                    diasMes += 30;
                }
            }
            else
            {
                if (i == 2)
                {
                    diasMes += 28;
                }
                else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i ==12)
                {
                    diasMes += 31;
                }
                else if (i == 4 || i == 6 || i == 9 || i == 11)
                {
                    diasMes += 30;
                }
            }
        }

        sumaDias = dia + diasMes;

        return sumaDias;
    }

    public int urteBukaerarainoZenbategun()
    {
        int sumaDias = 0;
        int diasMes = 0;
        int diasFinal;

        for (int i = 1; i <= mes; i++)
        {
            if (año % 4 == 0)
            {
                if (i == 2)
                {
                    diasMes += 29;
                }
                else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i ==12)
                {
                    diasMes += 31;
                }
                else if (i == 4 || i == 6 || i == 9 || i == 11)
                {
                    diasMes += 30;
                }
            }
            else
            {
                if (i == 2)
                {
                    diasMes += 28;
                }
                else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i ==12)
                {
                    diasMes += 31;
                }
                else if (i == 4 || i == 6 || i == 9 || i == 11)
                {
                    diasMes += 30;
                }
            }
        }

        sumaDias = dia + diasMes;
        diasFinal = 365 - sumaDias;

        return diasFinal;
    }

    public int egunFaltaDira(Fecha a)
    {
        //Pasar la fecha a comparar a dias
        int diasFecha1;
        int diasFecha2;
        int diasMes1 = 0;
        int diasMes2 = 0;
        int diasAño1 = 0;
        int diasAño2 = 0;
        int resultado;

        //FECHA1
        for (int i = 1; i <= mes; i++)
        {
            if (año % 4 == 0)
            {
                if (i == 2)
                {
                    diasMes1 += 29;
                }
                else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i ==12)
                {
                    diasMes1 += 31;
                }
                else if (i == 4 || i == 6 || i == 9 || i == 11)
                {
                    diasMes1 += 30;
                }
            }
            else
            {
                if (i == 2)
                {
                    diasMes1 += 28;
                }
                else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i ==12)
                {
                    diasMes1 += 31;
                }
                else if (i == 4 || i == 6 || i == 9 || i == 11)
                {
                    diasMes1 += 30;
                }
            }
        }

        for (int i = 1; i <= año; i++)
        {
            diasAño1 += 365;
        }

        //FECHA2
        for (int i = 1; i <= a.mes; i++)
        {
            if (año % 4 == 0)
            {
                if (i == 2)
                {
                    diasMes2 += 29;
                }
                else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i ==12)
                {
                    diasMes2 += 31;
                }
                else if (i == 4 || i == 6 || i == 9 || i == 11)
                {
                    diasMes2 += 30;
                }
            }
            else
            {
                if (i == 2)
                {
                    diasMes2 += 28;
                }
                else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i ==12)
                {
                    diasMes2 += 31;
                }
                else if (i == 4 || i == 6 || i == 9 || i == 11)
                {
                    diasMes2 += 30;
                }
            }
        }

        for (int i = 1; i <= a.año; i++)
        {
            diasAño2 += 365;
        }

        diasFecha1 = dia + diasAño1 + diasMes1;
        diasFecha2 = a.dia + diasAño2 + diasMes2;

        if (diasFecha1 > diasFecha2)
        {
            resultado = diasFecha1 - diasFecha2;
        }
        else
        {
            resultado = diasFecha2 - diasFecha1;
        }
        
        return resultado;
    }

    public int adinaKalkulatu()
    {
        
    }
}
