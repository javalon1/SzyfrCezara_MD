package com.sda.algorytmy;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int klucz = 3;

        System.out.println("Podaj tekst do zaszyfrowania:");
        String txtSzyfrowany = scanner.nextLine();
        char[] txtWejscie = txtSzyfrowany.toCharArray();
        char[] txtCHAR = new char[txtWejscie.length];

        //SZYFROWANIE
        for (int i = 0; i < txtWejscie.length; i++) {
            int n = txtWejscie[i];
            int C = 0;
            if (n >= 65 && n <= 90) {
                if (n + klucz > 90){
                    n -= 26;
                }
                C = n + klucz;
            } else if (n >= 97 && n <= 122) {
                if (n + klucz > 122){
                    n -= 26;
                }
                C = n + klucz;
            } else if (n >= 48 && n <= 57) {
                if (n + klucz > 57) {
                    n -= 10;
                }
                C = n + klucz;
            } else if (n < 47){
                C = n;
            }
            txtCHAR[i] = (char) C;
            System.out.print(txtCHAR[i]);
        }
        System.out.println();

        //DE-SZYFROWANIE
        for (int i = 0; i < txtWejscie.length; i++) {
            int n = txtCHAR[i];
            int C = 0;
            if (n >= 65 && n <= 90) {
                if (n - klucz < 65) {
                    n += 26;
                }
                C = n - klucz;
            } else if (n >= 97 && n <= 122) {
                if (n - klucz < 97) {
                    n += 26;
                }
                C = n - klucz;
            } else if (n >= 48 && n <= 57) {
                if (n - klucz < 48) {
                    n += 10;
                }
                C = n - klucz;
            } else if (n < 48){
                C = n;
            }
            txtCHAR[i] = (char) C;
            System.out.print(txtCHAR[i]);
        }
    }
}