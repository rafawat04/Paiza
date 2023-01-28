import java.util.*;

public class D004 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] words = new String[num];
        for (int i = 0; i < num; i++) {
            words[i] = sc.next();
        }

        System.out.print("Hello ");

        for (int i = 0; i < words.length; i++) {
            if (i == num - 1) {
                System.out.print(words[i] + ".");
            } else {
                System.out.print(words[i] + ",");
            }
        }

    }
}