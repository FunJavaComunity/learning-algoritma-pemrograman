package forEach;

public class example {
    public static void main(String[] args) {
        /*
        * for (TipeData elemen : array) {
        *    Blok kode yang akan dijalankan untuk setiap elemen dalam array
        * }
        */
        int[] angkaArray = {1, 2, 3, 4, 5};

        for (int angka : angkaArray) {
            System.out.println("Angka: " + angka);
        }
    }
}
