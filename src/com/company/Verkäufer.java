package com.company;

public class Verkäufer implements MitarbeiterInterface{ //implementiert das Interface
    @Override
    public void Name() { System.out.println("Netto-Verkäufer");}    //sagt das der Name "Netto Verkäufer"
    public void PersonalNr() { System.out.println("123456");}         //Die Personalnummer ist 123456
        public void MonatsLohn(){System.out.println("Der Verkäufer verdient: ");} // Der Monatslohn beträgt ...
    }
