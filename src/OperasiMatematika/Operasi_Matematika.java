package OperasiMatematika;

public class Operasi_Matematika {
    public static void main(String[] args) {
        //Operasi Matematika
        int a = 8;
        int b = 2;

        System.out.println("\t"+"Operasi Dasar");
        // 1. Penjumlahan
        System.out.println("Hasil Penjumlahan = " + a + b);
        // 2. Pengulangan
        System.out.println("Hasil Pengurangan = " + (a - b));
        // 3. Perkalian
        System.out.println("Hasil Perkalian = " + a * b);
        // 4. Pembagian
        System.out.println("Hasil Pembagian = " + a / b);
        // 5. Modulo : Mengambil hasil dari sisa pembagian
        System.out.println("Hasil Operasi Modulo = " + a % b + "\n");

        //Contoh Penggunaan Operasi Matematika
        System.out.println("\t"+"Contoh Penggunaan Operasi Matematika");
        int perhitungan = a * a - (a + b)/2;
        System.out.println("Hasil dari variabel Perhitungan = " + perhitungan + "\n");

        //Augmented Assignments
        System.out.println("\t"+"Augmented Assignments");
        int c = 7;

        c += 10;
        System.out.println("Hasil dari 'c += 10' =" + c);
        c -= 10;
        System.out.println("Hasil dari 'c -= 10' =" + c);
        c *= 10;
        System.out.println("Hasil dari 'c *= 10' =" + c);
        c /= 10;
        System.out.println("Hasil dari 'c /= 10' =" + c);
        c %= 10;
        System.out.println("Hasil dari 'c %= 10' =" + c + "\n");

        //Unary Operator
        System.out.println("\t"+"Unary Operator");
        int d = 50;

        //Increment
        d++;
        System.out.println("Increment = " + d);

        //decrement
        d--;
        System.out.println("Decrement = " + d + "\n");

        //Membuat Akar, pangkat, dan menghitung sinus
        System.out.println("\t"+"Membuat Akar, pangkat, dan menghitung sinus");
        double angka = 16;
        double akarKuadrat = Math.sqrt(angka);
        System.out.println("Akar kuadrat dari " + angka + " adalah " + akarKuadrat);

        double hasilPangkat = Math.pow(angka, 3); // Menghitung 5 pangkat 3
        System.out.println(angka + " pangkat 3 adalah " + hasilPangkat);

        double sudutRadian = Math.PI / 4; // Sudut 45 derajat dalam radian
        double nilaiSinus = Math.sin(sudutRadian);
        System.out.println("Sinus dari sudut " + Math.toDegrees(sudutRadian) + " derajat adalah " + nilaiSinus + "\n");

        //Kesalahan umum dalam melakukan operasi matematika
        int angka1 = 4;
        double angka3 = 4.3;

        //Jangan lakukan operasi seperti dibawah
        System.out.println(0 / angka3);

    }
}
