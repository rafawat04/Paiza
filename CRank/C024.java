import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n1 =0,n2=0;
        int n = sc.nextInt();
      
        for(int i=0;i<=n;i++){
            String[] com = sc.nextLine().split(" ");
            if(com[0].equals("SET")){
                if(com[1].equals("1")){
                    n1=Integer.parseInt(com[2]);
                }else if(com[1].equals("2")){
                    n2=Integer.parseInt(com[2]);
                }
                continue;
            }else if(com[0].equals("ADD")){
                n2= n1+Integer.parseInt(com[1]);
                continue;
            }else if(com[0].equals("SUB")){
                n2 =n1-Integer.parseInt(com[1]);
            }
        }
        System.out.println(n1 + " "+ n2);
    }
}