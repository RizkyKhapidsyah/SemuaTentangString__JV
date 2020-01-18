package com.rizkykhapidsyah.string;

import java.util.Arrays;

public class Bagian01_PengenalanString {
    public static void main(String[] args) {
        System.out.println("----------------------------------");
        System.out.println("CONTOH 1: MEMBUAT DAN MENAMPILKAN");
        System.out.println("----------------------------------");

        //Membuat String
        String kataString = "Rizky Khapidsyah";
        char[] kataChar = {'R', 'i', 'z', 'k', 'y', ' ', 'K', 'h', 'a', 'p', 'i', 'd', 's', 'y', 'a', 'h'};

        //Menampilkan String
        System.out.println("=> Dari String      : " + kataString);
        System.out.println("=> Dari Array Char  : " + Arrays.toString(kataChar));
        System.out.println("=> Dari Array Char  : " + kataChar + "] <= Address dari Array");

        System.out.print("=> Dari Array Char  : ");

        for (int i = 0; i < kataChar.length; i++) {
            System.out.print(kataChar[i]);
        }
        //Perbandingan Source Code diatas adalah alasan kenapa kita membutuhkan String.


        System.out.println("\n\n------------------------------------");
        System.out.println("CONTOH 2: MENGAKSES KOMPONEN STRING");
        System.out.println("------------------------------------");

        //Mengakses Komponen Dari String
        System.out.println("Komponen Kedua Dari Char[] => " + kataChar[1]);
        System.out.println("Komponen Kedua Dari String => " + kataString.charAt(1));

        System.out.println("\n------------------------------------");
        System.out.println("CONTOH 3: MERUBAH KOMPONEN STRING");
        System.out.println("------------------------------------");

        //Merubah Komponen
        System.out.println("Awalnya : " + Arrays.toString(kataChar));
        kataChar[3] = 'p';
        System.out.println("Menjadi : " + Arrays.toString(kataChar));
        /*  NB: Merubah komponen pada String tidak dapat dilakukan,
                Karena String adalah immutable
         */

        //Merubah komponen String secara tidak langsung
        System.out.println("\n---------------------------------------------");
        System.out.println("CONTOH 4: MERUBAH STRING SECARA TIDAK LANGSUNG");
        System.out.println("-----------------------------------------------");
        System.out.println("Awalnya : " + Arrays.toString(kataChar));
        System.out.println("Menjadi : " + "G" + kataString.substring(3, 14));

        System.out.println("\n---------------------------------------------");
        System.out.println("CONTOH 5: ");
        System.out.println("-----------------------------------------------");
        System.out.print("identifyHashCode => ");
        Cetak("kataString", kataString);

        System.out.println("\n---------------------------------------------");
        System.out.println("CONTOH 6: CONTOH LAIN: MEMORY DARI STRING");
        System.out.println("-----------------------------------------------");
        String ContohString_1 = "Rizky Khapidsyah";
        String ContohString_2 = "Rizky Khapidsyahs";
        String ContohString_3 = "Testing";

        Cetak("=> Contoh String 1: ", ContohString_1);
        Cetak("=> Contoh String 2: ", ContohString_2);
        Cetak("=> Contoh String 3: ", ContohString_3);
        System.out.println("----------");
        ContohString_3 = ContohString_3.substring(0, 4);
        Cetak("=> Contoh String 3: ", ContohString_3);

        String ContohString_4 = "Callo";
        Cetak("=> Contoh String 4: ", ContohString_4);

        kataString = "Callo";
        Cetak("=> kataString     : ", kataString);

        /*  1.  String di Java bersifat Immutable,
            2.  String yang berada di string pool akan bersifat re-usable (memory nya lebih efisien)
            3.  Membuat string dengan method baru maka ia akan diletakkan di memory lain bukan di
                string pool
         */
    }

    private static void Cetak(String pNama, String pData) {
        int Address = System.identityHashCode(pData);
        System.out.println(pNama + " = " + pData + "\t" + "||" + "\tAddress = " + Integer.toHexString(Address));

    }
}
