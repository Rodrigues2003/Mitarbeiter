package com.company;

public class Main {

    public static void main(String[] args) {
        Verkäufer verkäufer=new Verkäufer();
            verkäufer.Name();
            verkäufer.PersonalNr();
            verkäufer.MonatsLohn();

        int fixgehalt=300;             //rechnen
        int umsatz = 1000;
        int provision = 100;
        int ergebnis; //Zwischenergebnis
        int ergebnis1; //Endergebnis
        ergebnis=fixgehalt+umsatz*provision;
        ergebnis1=ergebnis/100;
        System.out.println(ergebnis1+"$");

    }
}