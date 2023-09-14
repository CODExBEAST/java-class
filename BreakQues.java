import java.util.Scanner;
public class BreakQues {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for(int i=1;i<=n;i++){
                if(i%10==0){
                    break;
                }
                System.out.println(i);

            }
        }
        System.out.println("multiple of 10 is found");
    }
    
}
