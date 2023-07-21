package WhileLoop;

import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {

        //Penggunaan sederhana while
        int a = 0;

        while(a <= 50 ){
            System.out.println("Looping - " + a);
            a+=10;
        }

        //Contoh 2
        while(true){

            Scanner scan = new Scanner(System.in);
            System.out.println("Apakah anda ingin berhenti?");
            System.out.print("(y/t) ");

            String input = scan.nextLine();

            if(input.equalsIgnoreCase("y")){
                break;
            }

        }

    }
}
