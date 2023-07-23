package OperasiMatematika;

public class Operasi_Matematika {
    public static void main(String[] args) {

        int penjumlahan, pengurangan, perkalian, pembagian, modulo;

        penjumlahan = 2 + 3;
        pengurangan = 2 - 3;
        perkalian   = 2 * 3;
        pembagian   = 4 / 2;
        modulo      = 6 % 2;

        // 1. Penjumlahan
        System.out.println("Hasil Penjumlahan = " + penjumlahan);
        // 2. Pengulangan
        System.out.println("Hasil Pengurangan = " + pengurangan);
        // 3. Perkalian
        System.out.println("Hasil Perkalian = " + perkalian);
        // 4. Pembagian
        System.out.println("Hasil Pembagian = " +pembagian);
        // 5. Modulo : Mengambil hasil dari sisa pembagian
        System.out.println("Hasil Operasi Modulo = " + modulo);

        //Jangan lakukan operasi seperti dibawah
        System.out.println(4 / 0);

    }
}
