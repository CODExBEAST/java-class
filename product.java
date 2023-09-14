public class product {
    public static int mul(int a ,int b){
        int product = a*b;
        return product;
    }
    public static void main(String args[]){
        int a = 3;
        int b = 4;
        int prod= mul(a, b);
        System.out.println(prod);
        prod= mul(10,20);
        System.out.println(prod);
    }
    
}
