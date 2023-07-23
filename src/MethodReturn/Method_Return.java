package MethodReturn;

public class Method_Return {

    // void method
    public static void Contoh1(int angka1, int angka2){
        int hasil;
        hasil = angka1 + angka2;
        System.out.println(hasil);
    }

    // return method
    public static int Contoh2(int angka1, int angka2){
        int hasil;
        hasil = angka1 + angka2;
        return hasil;
    }

    public static void main(String[] args) {
        Contoh1(23, 12);//pemanggilan void method
        System.out.println(Contoh2(23, 12));//pemanggilan return method
    }
}
