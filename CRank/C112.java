import java.util.*;

public class C112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] answer = new int[N];

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int a = A + B;
            int b = 24 - C;
            answer[i] = a + b;

        }
        Arrays.sort(answer);
        System.out.println(answer[0]);
        System.out.println(answer[answer.length - 1]);

    }
