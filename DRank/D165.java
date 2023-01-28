import java.util.*;

public class D165 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = sc.next();
        String[] ans = new String[4];

        for (int i = 0; i < pass.length(); i++) {
            ans[i] = pass.charAt(i) + "";
            // "" char をString にするために空文字をくっつける！

        }
        Set<String> set = new HashSet<>(Arrays.asList(ans));
        // SetにArray入れるためにArrays.asListを入れる
        if (set.size() == 4) {//
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }
}