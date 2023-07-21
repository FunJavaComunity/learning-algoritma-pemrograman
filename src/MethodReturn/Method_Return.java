package MethodReturn;

public class Method_Return {

    //method tanpa parameter
    public static void Contoh1() {
        System.out.println("Hi!");
    }

    //method parameter
    public static void Contoh2(int nama) {
        System.out.println(nama + " buah Apel");
    }

    //method return
    public static int Contoh3(int angka1, int angka2){

        int hasil = angka1 + angka2;

        return hasil;
    }

    public static void main(String[] args) {


        Contoh1();
        Contoh2(4);
        System.out.println(Contoh3(23, 12));

    }
}
