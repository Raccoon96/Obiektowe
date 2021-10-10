package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Obiekty klasy Okrag
        Okrag okrag1 = new Okrag();
        Okrag okrag2 = new Okrag(5, new Punkt(2, 2));
        System.out.println(okrag1.getPowierzchnia());
        System.out.println(okrag2.getPowierzchnia());
        System.out.println(okrag1.getSrednica());
        System.out.println(okrag2.getSrednica());
        System.out.println(okrag1.getPromien());
        System.out.println(okrag2.getPromien());
        okrag1.wSrodku(new Punkt(1, 1)); // jest
        okrag2.wSrodku(new Punkt(4, 4)); // jest
        okrag1.wSrodku(new Punkt(2, 2)); // nie jest
        okrag2.wSrodku(new Punkt(6, 6)); // nie jest
        okrag1.wSrodku(new Punkt(-2, 0)); // na okregu
        okrag2.wSrodku(new Punkt(7, 2)); // na okregu
    }

}


class Okrag {

    public int promien; // promien typu calkowitego
    public Punkt punkt; // zmienna punkt typu Punkt (osobnej klasy)

    //Konstruktor pusty inicjujacy pola
    Okrag(){
        this.promien = 2;
        this.punkt = new Punkt(0, 0);
    };

    //Konstruktor okreslajacy promien i punkt
    Okrag(int r, Punkt punkt){
        this.promien = r;
        this.punkt = punkt;
    }


    public double getPowierzchnia() {
        return Math.PI * this.promien * this.promien;
    }

    public float getSrednica() {
        return 2*this.promien;
    }

    public int getPromien() {
        return this.promien;
    }

    public void wSrodku(Punkt pkt){
        if(Math.pow((pkt.a - this.punkt.a), 2) + Math.pow((pkt.b - this.punkt.b), 2) < Math.pow((this.promien), 2))
            System.out.println("Punkt znajduje sie wewnatrz okregu");
        else if(Math.pow((pkt.a - this.punkt.a), 2) + Math.pow((pkt.b - this.punkt.b), 2) == Math.pow((this.promien), 2))
            System.out.println("Punkt znajduje sie na okregu");
        else
            System.out.println("Punkt znajduje sie poza okregiem");
    }
}

class Punkt {

    int a;
    int b;

    Punkt(int a, int b){
        this.a = a;
        this.b = b;
    }
}
