import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        int score =0;
        String answer, solution;
        
        for(int i=0;i<num;i++){
            String problem = sc.nextLine();
            answer = problem.split(" ")[0];
            solution = problem.split(" ")[1];
            if(answer.equals(solution)){
                score+=2;
            }else if(answer.length()== solution.length()){
                int difference = 0;
                for(int j=0;j<answer.length();j++){
                    if(answer.charAt(j) != solution.charAt(j))
                    difference++;
                }
                if(difference ==1){
                    score+=1;
                }
            }
        }
        System.out.println(score);
    }
}
```
