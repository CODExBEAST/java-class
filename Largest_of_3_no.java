import java.util.Scanner;
public class Largest_of_3_no {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a>b & a>c){
                System.out.println("a is greatest");
            }
            else if(a<c && c>b){
                System.out.println("c is greatest");
            }
            else{
                System.out.println("b is greatest");
            }
        }

    }
    
}









