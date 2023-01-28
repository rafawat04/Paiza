import java.util.*;

public class D203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String letter = sc.next();
        int num = sc.nextInt();
        num--;

        String[] ans = new String[word.length()];
        for (int i = 0; i < word.length(); i++) {
            ans[i] = "" + word.charAt(i);

        }
        if (ans[num].matches(letter)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
