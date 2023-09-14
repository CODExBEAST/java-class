import java.util.Scanner;
public class GENreverseOfNdigit {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            while(n>0){
                int lastdigit = n%10;
                System.out.print(lastdigit);
                n = n/10;
            }
        }
        System.out.println();
    }
    
}
