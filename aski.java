import java.util.Scanner;
public class aski{
    public static int sum(int a , int b){
        return a+b;

    }
    public static float sum(float a, float b){
        return a+b;
    }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    float c = sc.nextFloat();
    float d = sc.nextFloat();
    System.out.println(sum(a,b));
    System.out.println((float)sum(c,d));
}
    
}
