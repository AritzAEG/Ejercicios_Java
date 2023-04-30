package Aplikazioa;
import Fecha.Fecha;

public class Aplikazioa {
    public static void main(String[] args) {

        int d = 4;
        int m = 8;
        int a = 2006;
        Fecha fecha1 = new Fecha();
        Fecha fecha2 = new Fecha(d, m, a);

        System.out.println("hiruHileko: "+ fecha1.hiruHileko());
        System.out.println("lauHileko: "+ fecha1.lauHileko());
        System.out.println("seiHileko: "+ fecha1.seiHileko());
        System.out.println("hilabeteIzenaLortuGaztelaniaz: "+ fecha1.hilabeteaIzenaGaztelaniaz());
        System.out.println("hilabeteIzenaLortuEuskaraz: "+ fecha1.hilabeteaIzenaEuskaraz());
        System.out.println("hilEgunKopuruMax: "+ fecha1.hilEgunKopuruMax());
        System.out.println("bisiestoDa: "+ fecha1.bisiestoDa());
        System.out.println("dia: "+ fecha1.dia);
        System.out.println("berdinakDira: "+ fecha2.berdinakDira(fecha1));
        System.out.println("konparatu: "+ fecha1.konparatu(fecha2));
        System.out.println("urteHasieratikZenbatEgun: "+ fecha1.urteHasietatikZenbatEgun());
        System.out.println("UrteBukaerarainoZenbatEgun: "+ fecha1.urteBukaerarainoZenbategun());
        System.out.println("egunFaltaDira: "+ fecha1.egunFaltaDira(fecha2));

    }
}