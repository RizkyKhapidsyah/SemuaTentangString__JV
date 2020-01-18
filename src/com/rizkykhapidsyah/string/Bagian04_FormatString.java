package com.rizkykhapidsyah.string;

import java.util.Formatter;
import java.util.Scanner;

public class Bagian04_FormatString {
    static String K = "\n";

    public static void main(String[] args) {
        String Nama;
        int Umur;
        int A1, A2, A3, Hasil;
        double HasilKoma;

        Scanner InputUser = new Scanner(System.in);

        System.out.println("-----------------------------------");
        System.out.println("CONTOH 1: DASAR-DASAR FORMAT STRING");
        System.out.println("-----------------------------------");

        System.out.print("Masukkan Nama   : ");
        Nama = InputUser.nextLine();
        System.out.print("Masukkan Umur   : ");
        Umur = InputUser.nextInt();

        System.out.printf("\nNama : %s, Umur %d tahun.\n", Nama, Umur);

        System.out.println("\n---------------------------");
        System.out.println("CONTOH 2: OPERASI ARITMATIKA");
        System.out.println("----------------------------");
        System.out.print("Masukkan Angka Pertama : ");
        A1 = InputUser.nextInt();
        System.out.print("Masukkan Angka Kedua   : ");
        A2 = InputUser.nextInt();
        System.out.print("Masukkan Angka Ketiga  : ");
        A3 = InputUser.nextInt();

        NL("");

        Hasil = A1 + A2 + A3;
        System.out.printf("=> Hasilnya Penjumlahan   = %d\n", Hasil);
        Hasil = A1 - A2 - A3;
        System.out.printf("=> Hasilnya Pengurangan   = %d\n", Hasil);
        Hasil = A1 * A2 * A3;
        System.out.printf("=> Hasilnya Perkalian     = %d\n", Hasil);
        HasilKoma = ((double) A1) / ((double) A2) / ((double) A3);
        System.out.printf("=> Hasilnya Pembagian     = %f\n", HasilKoma);

        System.out.println("\n--------------");
        System.out.println("CONTOH 3: FLAG");
        System.out.println("--------------");
        int Angka1 = 9;
        int Angka2 = 10;
        int Hasil2;

        Hasil2 = Angka2 - Angka1;
        System.out.printf("%d - %d = %+d\n", Angka2, Angka1, Hasil2);

        System.out.println("\n--------------");
        System.out.println("CONTOH 4: WIDTH");
        System.out.println("--------------");

        int int3 = 1000;
        System.out.println("INTEGER");
        System.out.printf("%d\n", int3);
        System.out.printf("%5d\n", int3);
        System.out.printf("%-5d\n", int3); // flags = "-", artinya rata kiri
        System.out.printf("%+5d\n", int3); // flags akan mengambil slot di dalam format
        System.out.printf("%+-6d\n", int3); // flags bisa digabungkan
        System.out.printf("%10d\n", int3);
        System.out.printf("% 10d\n", int3);
        System.out.printf("%010d\n", int3); // flags = "0", kita tambahkan leading "0" didepan
        System.out.printf("%+010d\n", int3);

        int int4 = 1000000000;
        System.out.printf("%-,15d\n", int4); // flags = ",", menandakan delimeter per seribu

        System.out.println("\n------------------------");
        System.out.println("CONTOH 4: FLOATING POINT");
        System.out.println("\n----------------------");

        float float1 = 1.543f;

        System.out.printf("%f\n", float1);
        System.out.printf("%+9f\n", float1); // floating point akan mengambil width dengan 6 decimal

        // [.precision]
        System.out.println("\n[.precision]");
        float float2 = 15.678f;
        System.out.printf("%f\n", float2);
        System.out.printf("%.1f\n", float2);
        System.out.printf("%.2f\n", float2);
        System.out.printf("%8.2f\n", float2); // gabungkan dengna width
        System.out.printf("%+08.2f\n", float2); // gabungkan dengna width dan flag

        // contoh

        String nama2 = "Rizky Khapidsyah";
        float IPK = 3.185123567653f;

        // struktur format = %[argumen_index$][flags][width][.precision]conversion

        System.out.printf("\nIPK %1$s Berapa?,\n%1$s: saya dapat %2$+5.2f\n", nama2, IPK);

        System.out.println("\n---------------------------------------------------");
        System.out.println("CONTOH 5: MENYIMPAN FORMAT KE DALAM VARIABEL STRING");
        System.out.println("---------------------------------------------------");
        // save format ini kedalam variabel string
        String info_biasa = "nama: " + nama2 + ", IPK = " + IPK;
        System.out.println("biasa -> " + info_biasa);

        String info_format = String.format("nama: %s, IPK = %2$+5.2f", nama2, IPK);
        System.out.println("string format -> " + info_format);

        // save format ini kedalam string builder
        StringBuilder builder_info = new StringBuilder();
        Formatter formatBuilder = new Formatter(builder_info);

        formatBuilder.format("nama: %s, IPK = %2$+5.2f", nama2, IPK);
        System.out.println("string builder format -> " + builder_info);

    }

    private static void NL(String Kparam) {
        System.out.println(K);
    }
}
