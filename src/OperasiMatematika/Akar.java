package OperasiMatematika;

public class Akar {
    public static void main(String[] args) {
        //Membuat Akar, pangkat, dan menghitung sinus

        double angka = 16;

        //Math.sqrt(angka)
        double akarKuadrat = Math.sqrt(angka);
        System.out.println("Akar kuadrat dari " + angka + " adalah " + akarKuadrat);

        //Math.pow(angka, pangkat)
        double hasilPangkat = Math.pow(angka, 2); // Menghitung 16 pangkat 2
        System.out.println(angka + " pangkat 2 adalah " + hasilPangkat);

        //Math.PI = phi
        //Math.sin(sudutRadian);
        double sudutRadian = Math.PI / 4; // Sudut 45 derajat dalam radian
        double nilaiSinus = Math.sin(sudutRadian);
        System.out.println("Sinus dari sudut " + Math.toDegrees(sudutRadian) + " derajat adalah " + nilaiSinus);
    }
}
