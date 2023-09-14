import java.util.Scanner;
public class sds {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =2;i<=n-1;i++){
            if(n%i==0){
                break;
            }
            System.out.println("N is not a prime number");
        }
        


        
    }
}
