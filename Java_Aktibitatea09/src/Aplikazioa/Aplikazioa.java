package Aplikazioa;
import Fecha.Fecha;

public class Aplikazioa {
    public static void main(String[] args) {

        Fecha fecha1 = new Fecha();

        int d = 25;

        System.out.println("hiruHileko: "+ fecha1.hiruHileko());
        System.out.println("lauHileko: "+ fecha1.lauHileko());
        System.out.println("seiHileko: "+ fecha1.seiHileko());
        System.out.println("hilabeteIzenaLortuGaztelaniaz: "+ fecha1.hilabeteaIzenaGaztelaniaz());
        System.out.println("hilabeteIzenaLortuEuskaraz: "+ fecha1.hilabeteaIzenaEuskaraz());
        System.out.println("hilEgunKopuruMax: "+ fecha1.hilEgunKopuruMax());
        System.out.println("bisiestoDa: "+ fecha1.bisiestoDa());
        fecha1.egunaAldatu(d);
        System.out.println("dia: "+ fecha1.dia);
        
    }
}