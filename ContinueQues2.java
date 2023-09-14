import java.util.Scanner;
public class ContinueQues2{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for(int i =1;i<=n;i++){
                if(i%10==0){
                    continue;
                }
                System.out.println(i);
            }
        }
}

}
    
