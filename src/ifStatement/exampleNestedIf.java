package ifStatement;

public class exampleNestedIf {
    public static void main(String[] args) {
        int skor = 70;

        if (skor >= 60) {
            System.out.println("Anda lulus.");

            if (skor >= 90) {
                System.out.println("Anda mendapatkan nilai A");
            } else if (skor >= 80) {
                System.out.println("Anda mendapatkan nilai B");
            } else if (skor >= 70) {
                System.out.println("Anda mendapatkan nilai C");
            } else if (skor >= 60) {
                System.out.println("Anda mendapatkan nilai D");
            } else {
                System.out.println("Anda mendapatkan nilai E");
            }

        } else {
            System.out.println("Anda tidak lulus.");
        }

        System.out.println("Selesai");
    }
}
