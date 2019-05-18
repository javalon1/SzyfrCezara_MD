package com.sda.algorytmy;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int kluczSZ = 3;
        final int kluczDESZ = -3;


        System.out.println("Podaj tekst do zaszyfrowania:");
        String txtSzyfrowany = scanner.nextLine();
        char[] txtWejscie = txtSzyfrowany.toCharArray();
        //int[] txtINT = new int[txtWejscie.length];
        char[] txtCHAR = new char[txtWejscie.length];

        // Duze - 65 - 90
        // Male - 97 - 122
        // Cyfry - 48 - 57

        //SZYFROWANIE
        for (int i = 0; i < txtWejscie.length; i++) {
            int n = txtWejscie[i];
            int C = 0;
            if (n >= 65 && n <= 90) {
                C = (n + kluczSZ) % 90;
            } else if (n >= 97 && n <= 122) {
                C = (n + kluczSZ) % 122;
            } else if (n >= 48 && n <= 57) {
                C = (n + kluczSZ) % 57;

            }
            txtCHAR[i] = (char) C;
            System.out.print(txtCHAR[i] + " ");

            //D o j r u b w p b
            //A l g o r y t m y


        }


        /*//DE SZYFROWANIE
        for(int i = 0; i < txtWejscie.length; i++){
            int n = txtINT[i];
            System.out.println(n);
            C = (n - kluczDESZ) % 26;
            txtCHAR[i] = (char) C;
            System.out.println(txtCHAR[i]);
        }*/


        //C = (n + k) mod 26
        // k jest kluczem szyfrowania
        // n jest numerem litery, którą szyfrujemy
        // C jest numerem litery po zaszyfrowaniu


    }
}

// Wzor na szyfrowanie   C = (n + k) mod 26
// Wzor na de - szyfrowanie   C = (n - k) mod 26
