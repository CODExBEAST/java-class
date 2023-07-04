import java.util.Scanner;
public class calculate_Gst {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float pencil= sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = (pen + pencil + eraser);
        float bill = (18*total)/100 + total;
        System.out.println(bill);
        sc.close();

    }
    
}
