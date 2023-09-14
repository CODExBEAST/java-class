import java.util.Scanner;
public class qsnss {
    public static void average(float a , float b , float c){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number ");
        a = sc.nextFloat();
        System.out.println("enter second number ");
        b = sc.nextFloat();
        System.out.println("enter third number ");
        c = sc.nextFloat();

        float sum = (a + b + c )/3;
        System.out.println(sum);

    }
    public static void main(String arg[]){
        average(0, 0, 0);
        
    }
    
}
