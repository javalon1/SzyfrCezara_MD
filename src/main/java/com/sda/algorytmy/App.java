package com.sda.algorytmy;


import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        final int kluczSZ = 3;
        final int kluczDESZ = -3;
        int C;

        System.out.println("Podaj tekst do zaszyfrowania:");
        String txtSzyfrowany = scanner.nextLine();
        char[] txtSz = txtSzyfrowany.toCharArray();

        for(int i = 0; i < txtSz.length; i++){
            int n = txtSz[i];

            //System.out.println(txtSz[i]);
            //System.out.println(n);

            C = (n + kluczSZ) % 26;
            //System.out.println(C);
            txtSz[i] = (char) C;
            System.out.println(txtSz[i]);
        }

        //C = (n + k) mod 26
        // k jest kluczem szyfrowania
        // n jest numerem litery, którą szyfrujemy
        // C jest numerem litery po zaszyfrowaniu




    }
}

// Wzor na szyfrowanie   C = (n + k) mod 26
// Wzor na de - szyfrowanie   C = (n - k) mod 26
