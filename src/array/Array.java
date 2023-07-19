package array;

public class Array {
    public static void main(String[] args) {
        int [] angkaArray;
        int angkaArray2 [];

        int [] angkaArray3 = new int[5];

        angkaArray3[0] = 10;
        angkaArray3[1] = 20;
        angkaArray3[2] = 30;
        angkaArray3[3] = 40;
        angkaArray3[4] = 50;

        String [] ArrayString = {"Maulana", "Haekal", "Noval", "Akbar"};

        System.out.println(ArrayString[0]);

        System.out.println(ArrayString.length);

        int [][] matriks = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(matriks[2][2]);
    }
}
