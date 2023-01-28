import java.util.*;

public class D082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        char[] aArr = new char[A.length()];
        char[] bArr = new char[B.length()];

        for (int i = 0; i < A.length(); i++) {
            aArr[i] = A.charAt(i);

        }
        for (int j = 0; j < B.length(); j++) {
            bArr[j] = B.charAt(j);
        }
        if (aArr[aArr.length - 1] == bArr[0] && bArr[bArr.length - 1] != 'n') {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }

    }
}