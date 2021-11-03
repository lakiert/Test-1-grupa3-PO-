package com.company;
import java.util.Scanner;
import java.util.Random;
import java.*;



public class Main {


    // zad1

    public static void showPrimes(int[] list)
    {

        int[] wynik = new int[list.length];

        for(int i=0; i<list.length; i++)
        {
            int licznik =0;
            int x = list[i];
            for(int j=2; j<x; j++)
            {
                if(x%j == 0) licznik += 1;
                else if (x%j != 0) licznik += 0;
            }
            if(licznik == 0) wynik[i] = x;

        }


        for(int i=0; i<wynik.length; i++)
        {
            if(wynik[i] != 0) System.out.println(wynik[i]);
        }

    }




    // zad2

    public static void randomowe(int n)
    {

        Random r = new Random();
        int ran = r.nextInt();
        int[] tab = new int[n];
        int minimalna = -50;
        int maksymalna = 50;

        for(int i=0; i<n; i++)
        {
            ran = r.nextInt(maksymalna - minimalna) + minimalna;
            tab[i] = ran;
        }

        System.out.println(" ");

        for(int i=0; i<n; i++)
        {
            System.out.println(tab[i]);
        }

        System.out.println(" ");

        int najwiekszy = tab[0];
        for(int i=0; i<n; i++)
        {
            if(tab[i] > najwiekszy) najwiekszy = tab[i];
        }

        System.out.println("element najwiekszy: " + najwiekszy);

        int ile=0;
        for(int i=0; i<n; i++)
        {
            if(tab[i] == najwiekszy) ile++;
        }

        System.out.println("wystepuje w tablicy " + ile + " razy");

    }





    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



        // zad1

//        System.out.println("podaj ilosc liczb: ");
//        int n = in.nextInt();
//        int liczba;
//        int[] lista = new int[n];
//
//        for(int i=0 ; i<n; i++)
//        {
//            System.out.println("podaj liczbe: ");
//            liczba = in.nextInt();
//            lista[i] = liczba;
//        }
//
//        System.out.println(" ");
//        System.out.println("liczby pierwsze: ");
//
//        showPrimes(lista);



        // zad2

        System.out.println("podaj ilosc liczb: ");
        int n = in.nextInt();

        randomowe(n);


    }
}
