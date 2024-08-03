/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uta.pbo;

import java.util.Scanner;

/**
 *
 * @author A-21
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("     UTS 20 Mei 2024 oleh M. Azmy Rasyid NIM 23201216     ");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println();

        Scanner input = new Scanner(System.in);

        System.out.println("Silakan Input Nama Anda: ");
        String nama = input.nextLine();

        System.out.println("Jenis Kelamin:");
        System.out.println("1. Laki-laki");
        System.out.println("2. Perempuan");
        System.out.println("Entri pilihan anda (1 or 2): ");
        int gender = input.nextInt();

        String panggilan = "";

        if (gender == 1) {
            panggilan = "Mas";
        } else if (gender == 2) {
            panggilan = "Mbak";
        }

        System.out.println("Selamat Datang " + panggilan + " " + nama);

        System.out.println("\nKalkulator");

        boolean lanjutPerhitungan = true;
        float hasil = 0;
        do {
            System.out.println("Masukkan bilangan 1: ");
            float bilangan1 = input.nextInt();
            System.out.println("Masukkan bilangan 2: ");
            float bilangan2 = input.nextInt();

            boolean operatorSalah;
            do {
                operatorSalah = false;
                System.out.println("Pilih Operator (+, -, *, /): ");
                char operator = input.next().charAt(0);

                switch (operator) {
                    case '+':
                        hasil = bilangan1 + bilangan2;
                        break;
                    case '-':
                        hasil = bilangan1 - bilangan2;
                        break;
                    case '*':
                        hasil = bilangan1 * bilangan2;
                        break;
                    case '/':
                        if (bilangan2 == 0) {
                            System.out.println("Pembagian dengan 0 tidak diizinkan!");
                            System.out.println("Kembali ke pilihan operator");
                            operatorSalah = true;
                        }
                        hasil = bilangan1 / bilangan2;
                        break;
                    default:
                        System.out.println("Operator tidak valid. Pilih operator yang valid.");
                        operatorSalah = true;
                }
            } while (operatorSalah);

            System.out.println("Hasil: " + hasil);

            System.out.println("Lanjut Perhitungan (y/n)?");
            String lanjut = input.next();

            if (lanjut.equalsIgnoreCase("n")) {
                lanjutPerhitungan = false;
            } else if (lanjut.equalsIgnoreCase("y")) {
                lanjutPerhitungan = true;
            } else {
                System.out.println("Masukkan tidak valid. Harap masukkan 'y' untuk lanjut atau 'n' untuk berhenti.");
            }

        } while (lanjutPerhitungan);

        System.out.println("Terima kasih sudah menggunakan kalkulator. Sampai jumpa!");

    }
}
