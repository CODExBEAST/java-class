import java.util.Scanner;
public class Switch_case {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num){
            case 1 : System.out.println("samosa");
                        break;
            case 2 : System.out.println("patty");
                        break;
            case 3 :System.out.println("mango");
                        break;
            default :System.out.println("wake up");
                        
        }

    }
    
}
