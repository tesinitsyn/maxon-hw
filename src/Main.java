import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input N: ");
        Scanner N = new Scanner(System.in);
        int num = N.nextInt();
        ArrayList<Object> perfectNumbers = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            if (TestOnPerfect.perfectFounder(i)) perfectNumbers.add(i);
        }
        System.out.println(perfectNumbers);
    }
}