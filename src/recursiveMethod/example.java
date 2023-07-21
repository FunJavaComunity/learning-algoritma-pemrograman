package recursiveMethod;

public class example {
    static int hitungFaktorial(int value){
        if (value == 1){
            return 1;
        } else {
            return value * hitungFaktorial(value - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(hitungFaktorial(5));
    }
}
