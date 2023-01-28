import java.util.*;

public class D062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        char letter = 'A';

        for (int i = 0; i < a; i++) {
            System.out.print(letter++);
        }
        System.out.println();
        for (int j = 0; j < b; j++) {
            System.out.print(letter++);
        }
        System.out.println();
        for (int k = 0; k < c; k++) {
            System.out.print(letter++);
        }
    }
}