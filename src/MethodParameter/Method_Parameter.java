package MethodParameter;

public class Method_Parameter {

    //method tanpa parameter
    public static void hai() {
        System.out.println("Hi!");
    }

    //method parameter
    public static void penjumlahan(int angka) {
        System.out.println(2 * angka + angka);
    }
    /** Bentuk matematika
     *  F(a)= 2 x a + a
     *  F(3)= 2 x 3 + 3
     *  F(3)= 9
     */

    public static void sapa(String nama) {
        System.out.println("Hi! nama Saya, " + nama );
    }

    //psvm merupakan tempat eksekusi method
    public static void main(String[] args) {

        //Menampilkan output method dengan parameter
        sapa("Juna");
        sapa("Ali");

        //penjumlahan(3);

    }
}
