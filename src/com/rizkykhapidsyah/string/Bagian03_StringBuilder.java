package com.rizkykhapidsyah.string;

import java.util.Scanner;

public class Bagian03_StringBuilder {
    public static void main(String[] args) {
        System.out.println("---------------------------");
        System.out.println("CONTOH 1: DASAR");
        System.out.println("---------------------------");
        String Nama = "Rizky Khapidsyah";
        StringBuilder builder = new StringBuilder(Nama);

        System.out.println("Data      = " + builder);
        System.out.println("Panjang   = " + builder.length());
        System.out.println("Kapasitas = " + builder.capacity());

        int AddressBuilder = System.identityHashCode(builder);
        System.out.println("Address   = " + Integer.toHexString(AddressBuilder));

        System.out.println("\n---------------------------");
        System.out.println("CONTOH 2: APPEND");
        System.out.println("---------------------------");
        String Nama2 = " - Dessy Puspita Sari";
        builder.append(Nama2);
        PrintData(builder);

        System.out.println("\n---------------------------");
        System.out.println("CONTOH 3: INPUT DARI USER");
        System.out.println("---------------------------");

        String A, B, C;

        C = "\nMereka adalah = ";

        Scanner InputUSer = new Scanner(System.in);
        StringBuilder Builder2;

        System.out.print("Masukkan Nama Pertama  : ");
        A = InputUSer.nextLine();
        System.out.print("Masukkan Nama Kedua    : ");
        B = InputUSer.nextLine();

        System.out.println("\nNama Pertama  = " + A);
        System.out.println("Nama Kedua    = " + B);

        Builder2 = new StringBuilder(C + A + " dan " + B);
        System.out.println(Builder2);

        System.out.println("\n---------------------------");
        System.out.println("CONTOH 4: INSERT");
        System.out.println("---------------------------");
        Builder2.insert(17, "Dua Orang, Yaitu ");
        System.out.println(Builder2);

        System.out.println("\n---------------------------");
        System.out.println("CONTOH 5: DELETE");
        System.out.println("---------------------------");
        Builder2.delete(3, 5);
        System.out.println(Builder2);

        System.out.println("\n-------------------------------------------");
        System.out.println("CONTOH 6: RUBAH KARAKTER PADA INDEX TERTENTU");
        System.out.println("-------------------------------------------");
        Builder2.setCharAt(7, 'Q');
        System.out.println(Builder2);

        System.out.println("\n----------------");
        System.out.println("CONTOH 7: REPLACE");
        System.out.println("------------------");
        Builder2.replace(14, 22, "TESTING REPLACE");
        System.out.println(Builder2);

        System.out.println("\n--------------------------------");
        System.out.println("CONTOH 8: CASTING MENJADI STRING");
        System.out.println("--------------------------------");
        String Kalimat = Builder2.toString();
        System.out.println(Kalimat);
        int AddressString = System.identityHashCode(Kalimat);
        System.out.println("Address  = " + Integer.toHexString(AddressString));
    }

    private static void PrintData(StringBuilder DataBuilder) {
        System.out.println("Data      = " + DataBuilder);
        System.out.println("Panjang   = " + DataBuilder.length());
        System.out.println("Kapasitas = " + DataBuilder.capacity());

        int AddressBuilder2 = System.identityHashCode(DataBuilder);
        System.out.println("Address   = " + Integer.toHexString(AddressBuilder2));
    }
}
