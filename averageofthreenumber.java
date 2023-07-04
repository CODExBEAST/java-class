import java.util.Scanner;
public class aver {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float d = (a+b+c)/2f;
        System.out.println(d);
        sc.close();

    }
    
}
