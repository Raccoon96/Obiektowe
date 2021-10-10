package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //zad 7
        System.out.println("Podaj liczbe: ");
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        System.out.println(Kwadrat(x));

        //zad 8 (testowe do sprawdzenia poprawnosci funkcji czyTrojkat - liczby wybierane przez uzytkownika)
        System.out.println("Podaj trzy liczby: ");
        Scanner in2 = new Scanner(System.in);
        double a = in2.nextDouble();
        double b = in2.nextDouble();
        double c = in2.nextDouble();
        System.out.println(czyTrojkat(a, b, c));

        //zad 8 (losowane z przedzialu podanego przez uzytkownika uzytkownika)
        System.out.println("Podaj dwie liczby: ");
        Scanner in3 = new Scanner(System.in);
        int first = in3.nextInt();
        int last = in3.nextInt();
        if(first>last)
        {
            int box = first;
            first = last;
            last = box;
        }
        Random rand = new Random();
        a = rand.nextInt(last-first+1)+first;
        b = rand.nextInt(last-first+1)+first;
        c = rand.nextInt(last-first+1)+first;
        System.out.println(a + " " + b + " " + c);
        System.out.println(czyTrojkat(a, b, c));
    }

    public static double Kwadrat(double a) {
        return Math.sqrt(a);
    }

    public static boolean czyTrojkat(double a, double b, double c) {
        double max = c;
        if(a<1 || b<1 || c<1)
            return false;
        else if(a>b && a>c){
            max = a;
            a = c;
        }
        else if(b>c) {
            max = b;
            b = c;
        }
        if(a*a+b*b==max*max)
            return true;
        else
            return false;
    }
}
