import java.util.*;

public class C055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        String password = sc.next();
        int count = 0;

        for (int i = 0; i < times; i++) {
            String words = sc.next();

            if (words.contains(password)) {
                System.out.println(words);
            } else {
                count++;
            }
            if (count == times) {
                System.out.println("None");
            }

        }

    }
}