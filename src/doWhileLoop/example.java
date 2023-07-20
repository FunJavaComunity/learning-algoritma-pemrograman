package doWhileLoop;

public class example {
    public static void main(String[] args) {
/*
        do {
            // Blok kode yang akan dijalankan
        } while (kondisi);
*/

        int count = 5;

        do {
            System.out.println("Perulangan ke-" + count);
            count++;
        } while (count <= 5);

        System.out.println("Selesai");
    }
}
