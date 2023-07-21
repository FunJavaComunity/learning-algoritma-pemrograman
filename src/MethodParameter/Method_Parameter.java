package MethodParameter;

public class Method_Parameter {

    //method tanpa parameter
    public static void hai() {
        System.out.println("Hi!");
    }

    //method parameter
    public static void sapa(String nama) {
        System.out.println("Hi! nama Saya, " + nama );
    }

    public static void pesan(int porsi, String makanan) {
        System.out.println("Saya pesan, " + porsi + " porsi " + makanan);
    }

    //psvm merupakan tempat eksekusi method
    public static void main(String[] args) {

        //Menampilkan method tanpa parameter
        hai();

        //Menampilkan output method dengan parameter
        sapa("Juna");
        sapa("Ali");
        sapa("Yanto");

        pesan(2, "Nasi Goreng");
    }
}
