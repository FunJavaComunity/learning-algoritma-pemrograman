package ternaryOperator;

public class example {
    public static void main(String[] args) {
        // variabel = (kondisi) ? nilai_jika_benar : nilai_jika_salah;

        int angka = -5;

        // Menggunakan if-else
        if (angka > 0) {
            System.out.println("Hasil dari if else: Angka Positif");
        } else {
            System.out.println("Hasil dari if else: Bukan Angka Positif");
        }

        // Menggunakan ternary operator
        String hasilTernary = (angka > 0) ? "Angka positif" : "Bukan angka positif";
        System.out.println("Hasil ternary operator: " + hasilTernary);
    }
}
