package com.rizkykhapidsyah.string;

import java.util.Scanner;

public class Bagian02_OperasiString {
    public static void main(String[] args) {
        String Kalimat = "Saya Suka Belajar Programming";

        Scanner InputUser_iu = new Scanner(System.in);
        int InputUser_i;

        //Mengambil Komponen Dari String
        System.out.println("-----------------------------------------");
        System.out.println("CONTOH 1: MENGAMBIL KOMPONEN DARI STRING");
        System.out.println("-----------------------------------------");
        System.out.print("Masukkan Index Karakter yang ingin ditampilan (0 sd " + (Kalimat.length() - 1) + ") :");

        try {
            InputUser_i = InputUser_iu.nextInt();
            if ((InputUser_i >= 29) || (InputUser_i < 0)) {
                System.out.println("\nKesalahan : Masukkan Index hanya dari 0 sd " + (Kalimat.length() - 1));
            } else {
                System.out.println("\n=> Karakter yang anda pilih berdasarkan index = " + Kalimat.charAt(InputUser_i));
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }

        //SubString
        System.out.println("\n--------------------");
        System.out.println("CONTOH 2: SUBSTRING");
        System.out.println("--------------------");
        System.out.println("Kalimat           = " + Kalimat);

        String Kata = Kalimat.substring(10, 17);
        System.out.println("substring(10, 17) = " + Kata);

        //Concatenation (Penggabungan String)
        System.out.println("\n---------------------------------------------");
        System.out.println("CONTOH 3: CANCATENATION / PENGGABUNGAN STRING");
        System.out.println("---------------------------------------------");

        String Kata2 = " Pemrograman";
        System.out.println("Kata Baru                   =" + Kata2);
        System.out.println("Hasil Setelah Concatenation = " + Kata + Kata2);
        Kata2 = Kata2 + " Dasar";
        System.out.println("Hasil Setelah Concatenation =" + Kata2);

        //Concatenation (Penggabungan String Dengan Non String)
        System.out.println("\n-------------------------------------------------------");
        System.out.println("CONTOH 3: CANCATENATION / PENGGABUNGAN DENGAN NON STRING");
        System.out.println("-------------------------------------------------------");

        int Angka = 91;
        String Kata3 = Kata + " " + Angka;

        System.out.println("Hasil Setelah Concatenation = " + Kata3);
        //Atau bisa juga
        System.out.println(Kata + " " + Angka);

        //Uppercase dan Lowercase
        System.out.println("\n--------------------------------");
        System.out.println("CONTOH 4: UPPERCASE dan LOWERCASE");
        System.out.println("--------------------------------");
        String Kata4 = "Ini Adalah Contoh Kalimat";
        System.out.println("Awal      = " + Kata4);
        System.out.println("Uppercase = " + Kata4.toUpperCase());
        System.out.println("Lowercase = " + Kata4.toLowerCase());

        //Replace
        System.out.println("\n--------------------------------");
        System.out.println("CONTOH 5: REPLACE");
        System.out.println("--------------------------------");
        String Kata5 = "Apakah saya menyukai Anda?";
        System.out.println("Awal    = " + Kata5);
        System.out.println("\nReplace 'saya' menjadi 'kamu' dan 'Anda' menjadi 'saya' : ");
        String Kata6 = Kata5.replace("saya", "kamu");
        String Kata7 = Kata6.replace("Anda", "saya");
        System.out.println("Akhir   = " + Kata7);
        System.out.println();

        //Equality / Persamaan (Bagian 1)
        System.out.println("\n--------------------------------------");
        System.out.println("CONTOH 6: EQUALITY / PERSAMAAN (BAGIAN 1)");
        System.out.println("--------------------------------------");

        String Kata8, Kata9, Kata10, Kata11;

        Kata8 = "Rizky";
        Kata9 = "Rizky";
        Kata10 = new String(Kata8);
        Kata11 = new String(Kata9);


        System.out.println("Kata 1 = " + Kata8);
        System.out.println("Kata 2 = " + Kata9);
        System.out.println("Kata 3 = " + Kata10);
        System.out.println("Kata 4 = " + Kata11);

        System.out.println();

        if (Kata8 == Kata9) {
            System.out.println("Kata 1 dan Kata 2 = Sama");
        } else {
            System.out.println("Kata 1 dan Kata 2 = Tidak Sama");
        }

        if (Kata8 == Kata10) {
            System.out.println("Kata 1 dan Kata 3 = Sama");
        } else {
            System.out.println("Kata 1 dan Kata 3 = Tidak Sama");
        }

        if (Kata8 == Kata11) {
            System.out.println("Kata 1 dan Kata 4 = Sama");
        } else {
            System.out.println("Kata 1 dan Kata 4 = Tidak Sama");
        }

        if (Kata10 == Kata11) {
            System.out.println("Kata 3 dan Kata 4 = Sama");
        } else {
            System.out.println("Kata 3 dan Kata 4 = Tidak Sama");
        }

        //Equality / Persamaan (Bagian 2)
        System.out.println("\n--------------------------------------");
        System.out.println("CONTOH 7: EQUALITY / PERSAMAAN (BAGIAN 2)");
        System.out.println("--------------------------------------");

        String K1, K2, Hasil;
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Masukkan Kata Pertama : ");
        K1 = UserInput.nextLine(); //Input Tidak Berada di Memory String Pool

        System.out.print("Masukkan Kata Kedua   : ");
        K2 = UserInput.nextLine(); //Input Tidak Berada di Memory String Pool

        if (K1 == K2) {
            Hasil = "Sama";
        } else {
            Hasil = "Tidak Sama";
        }

        System.out.println("Hasil                 : " + Hasil);


    }
}
