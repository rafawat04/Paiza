import java.util.*;


public class C019 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String[] result = new String[A];
        
        for(int i=0;i<A;i++){
            int num = sc.nextInt();
            int calc = isPerfectNum(num);
            if(calc == 0){
                result[i] = "perfect";
            }else if (calc == 1 || calc == -1){
                result[i] = "nearly";
            }else{
                result[i] = "neither";
            }
        }
        for(int i=0;i<A;i++){
            System.out.println(result[i]);
        }
        
    }
    
    public static int isPerfectNum(int num){
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num % i ==0){
                sum += i;
            }
        }
        return num -sum;
    }
}
