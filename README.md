# SemuaTentangString__JV
Bahan Ajar Fundamental Pemrogaman Java - Mengenal String dan Berbagai Operasi String di Pemrograman Java.<br><br>

<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian01_1.PNG">
<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian01_2.PNG">
<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian01_3.PNG">
<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian01_4.PNG">
<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian01_5.PNG">
<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian01_6.PNG">

---

<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian02_1.PNG">
<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian02_2.PNG">
<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian02_3.PNG">
<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian02_4.PNG">
<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian02_5.PNG">
<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian02_6.PNG">
<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian02_7.PNG">

---

<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian03_1.PNG">
<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian03_2.PNG">
<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian03_3.PNG">
<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian03_4.PNG">
<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian03_5.PNG">
<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian03_6.PNG">
<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian03_7.PNG">
<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian03_8.PNG">

---

<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian04_1.PNG">
<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian04_2.PNG">
<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian04_3.PNG">
<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian04_4.PNG">
<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian04_5.PNG">
<img src="https://github.com/RizkyKhapidsyah/SemuaTentangString__JV/blob/master/results/Bagian04_6.PNG">

---

String dalam pemrograman komputer adalah sebuah deret simbol. Tipe data string adalah tipe data yang digunakan untuk menyimpan barisan karakter.

## ToUpperCase

Fungsi ini berfungsi untuk mengubah value String menjadi huruf kapital.

Syntax : <code>variable_string.toUpperCase()</code>

Contoh :

      //  Variable String
              String strA = "Saya Programmer Java";
              String strB = "Saya suka Pemrograman";

              System.out.println("strA = "+strA);
              System.out.println("strB = "+strB);

              //  Mengubah isi String menjadi huruf besar
              String besarA = strA.toUpperCase();
              String besarB = strB.toUpperCase();
              System.out.println("Mengubah isi String menjadi huruf besar");
              System.out.println("strA = "+besarA);
              System.out.println("strB = "+besarB+"\n");

## ToLowerCase

Fungsi ini berfungsi untuk mengubah value String menjadi huruf kecil.

Syntax : <code>variable_string.toLowerCase()</code>

Contoh :

      //  Variable String
              String strA = "Saya Programmer Java";
              String strB = "Saya suka Pemrograman";

              System.out.println("strA = "+strA);
              System.out.println("strB = "+strB);

      //  Mengubah nilai String menjadi huruf kecil
              String kecilA = strA.toLowerCase();
              String kecilB = strB.toLowerCase();
              System.out.println("Mengubah nilai String menjadi huruf kecil");
              System.out.println("strA = "+kecilA);
              System.out.println("strB = "+kecilB+"\n");

## Substring

Fungsi ini berguna untuk mengambil isi sebagian dari variable String atau mengambil potongan beberapa karakter dari sebuah isi String. Dimana, pada parameter pertama merupakan index awal dari String dan parameter kedua merupakan batasan index yang akan diambil. Pada contoh dibawah, substring(0, 3) berarti mengambil isi String dari index 0 sampai index 2 bukan 3 lebih tepatnya seperti ini 0 < 3. 
Syntax : variable_string.substring(0, 3)

Contoh : 

      //  Variable String
              String strA = "Saya Programmer Java";
              String strB = "Saya suka Pemrograman";

              System.out.println("strA = "+strA);
              System.out.println("strB = "+strB);

      //  Mengambil isi sebagian String
              String sub_strA = strA.substring(0, 3);     //  substring(index_awal, index_akhir)
              String sub_strB = strB.substring(0, 9);
              System.out.println("Mengambil isi sebagian String");
              System.out.println("strA = "+sub_strA);
              System.out.println("strB = "+sub_strB+"\n");

## compareTo

Fungsi ini berguna untuk membandingkan 2 buah value String dengan nilai return integer. Perbandingan disini maksudnya ialah mencari selisih antara value String pertama dengan value String kedua. Misal, yang dibandingkan ialah huruf 's' dengan huruf 't' maka, hasilnya ialah -1. Mengapa ? Karena s < t kalau kita sebut dari a sampai z. Namun, bagaimana kalau 't' dibandingkan dengan 's' ? maka, hasilnya ialah 1 karena t > s.

Syntax : <code<variable_string_pertama.compareTo(variable_string_kedua)</code>

Contoh :

      //  Membandingkan 2 buah String dengan return integer
              String karA = "s";
              String karB = "t";
              int result = karA.compareTo(karB);          //  hasil perbandingan merupakan selisih antara value karA dan karB dalam integer
              System.out.println("karA = "+karA);
              System.out.println("karB = "+karB);
              System.out.println("Hasil Perbandingan = "+result+"\n");        //  hasilnya -1 karena s < t

## indexOf

Fungsi ini berguna untuk mencari nilai index dari sebuah karakter. Misal, pada sebuah String dengan nilai “saya” Anda mau tahu kira – kira huruf 'y' berada di index ke berapa. Maka, Anda bisa gunakan fungsi ini untuk mencari tahu posisi index nya.

Syntax : <code>variable_string.indexOf(karakter_yang_dicari)</code>

Contoh : 

      //  Variable String
              String strA = "Saya Programmer Java";

      //  untuk mencari posisi dari karakter yang dicari
              int i_cariA = strA.indexOf("J");    
              System.out.println("karakter J berada di index = "+i_cariA);

## contains

Fungsi ini hampir sama seperti compareTo namun, pada fungsi contains akan menghasilkan return boolean. Misal, Anda ingin membandingkan String dengan value “saya” dengan “dia” maka, hasilnya false namun, bagaimana bila yang dibandingkan adalah “saya” dengan “saya” maka hasilnya adalah true.

Syntax : <code>variable_string_pertama.contains(variable_string_kedua)</code>

Contoh :

      //  Membandingkan 2 buah String dengan return boolean
              String kar1 = "saya";
              String kar2 = "saya";
              String kar3 = "dia";
              System.out.println("kar1 = "+kar1);
              System.out.println("kar2 = "+kar2);
              System.out.println("kar3 = "+kar3);
              System.out.println("Perbandingan kar1 dengan kar2 = "+kar1.contains(kar2));
              System.out.println("Perbandingan kar1 dengan kar3 = "+kar1.contains(kar3)+"\n");

## concat

Fungsi ini untuk menggabungkan 2 buah String. Misal, String pertama bernilai “saya” dan String kedua bernilai “dan dia”. Maka, setelah digabungkan dengan concat akan menghasilkan “saya dan dia”.

Syntax : <code>variable_string1.concat(variable_string2)</code>

Contoh :

      String kar1 = "saya";
      //  Menggabungkan 2 buah String
              String gabung = kar1.concat(" dan dia");
              System.out.println("Hasil penggabungan = "+gabung+"\n");

## endsWith

Fungsi ini berguna untuk melakukan pengecekan apakah isi String diakhiri dengan karakter tertentu. Misal, ada sebuah String dengan nilai “saya”. Kemudian, Anda mau tahu apakah isi String tersebut diakhiri dengan huruf “a”. Maka, Anda bisa menggunakan fungsi endsWith dimana, hasil dari fungsi ini akan menghasilkan nilai return boolean. Untuk contoh di atas, akan menghasilkan true karena “saya” memang diakhiri dengan huruf “a”.

Syntax : </code<variable_string1.endsWith(variable_string2)</code>

Contoh :

      String kar1 = "saya";
      //  Mengecek apakah isi String kar1 diakhiri dengan huruf s
              System.out.println("Apakah kata '"+kar1+"' diakhiri dengan huruf 's'? : "+kar1.endsWith("s")+"\n");

## startsWith

Fungsi ini merupakan kebalikan dari fungsi endsWith dimana, startsWith akan melakukan pengecekan pada karakter pertama atau karakter awal pada sebuah String.

Syntax : <code>variable_string1.startsWith(variable_string2)</code>

Contoh :

      String kar1 = "saya";
      //  Mengecek apakah isi String kar1 diawali dengan karakter s
              System.out.println("Apakah kata '"+kar1+"' diawali dengan huruf 's'? : "+kar1.startsWith("s")+"\n");

## <code>length</code>

Fungsi ini berguna untuk mengetahui jumlah atau panjang karakter dari isi sebuah String. Misal, sebuah string dengan nilai “saya” dan Anda ingin mengetahui panjang karakter dari isi String tersebut. Maka, Anda bisa gunakan fungsi ini.

Syntax : <code>variable_string.length()</code>

Contoh :

      String kar1 = "saya";
      //  Mengetahui jumlah karakter dari variable String kar1
              int panjang = kar1.length();
              System.out.println("Panjang karakter '"+kar1+"' = "+panjang);



-----
Referensi Artikel : <a href="http://jagocoding.com">JagoCoding</a>, <a href="https://id.wikipedia.org">Wikipedia</a>. Thanks to : <a href="http://jagocoding.com">JagoCoding</a>, <a href="https://id.wikipedia.org">Wikipedia</a><br>
Referensi Source Code : <a href="https://www.youtube.com/user/faqihzamukhlish"> Kelas Terbuka </a> dan <a href="https://github.com/kelasterbuka"> Kelas Terbuka (Repository)</a>. Created by <a href="https://github.com/faqihza">Faqihza Mukhlish.</a> Thanks To: <a href="https://www.youtube.com/channel/UCRGHjysoCemh4y7tCJQs30w/about">Faqihza Mukhlish.</a><br>

-----
All Source Code is Modified.
