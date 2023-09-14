import java.util.Scanner;
public class printin_numTOn {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int counter = 1;
            int n = sc.nextInt();
            while(counter<=n){
                System.out.println(counter);
                counter++;
            }
        }

        
    }
    
}

