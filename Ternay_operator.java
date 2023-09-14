import java.util.Scanner;
public class Ternay_operator {
    public static void main(String args[]){
    try (Scanner sc = new Scanner(System.in)) {
        int num = sc.nextInt();
        String type = (num>=33) ? "pass":"fail";
        System.out.println(type);
    }

    }
    
    
    
}
