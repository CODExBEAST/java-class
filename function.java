import java.util.*;
public class function {
    public static void calsum(int a, int b){
        int sum = a+b;
        System.out.println("sum is : "+ sum);

    }
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calsum(a,b);
    }
}
 