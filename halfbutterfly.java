public class halfbutterfly {
    public static void butt(int n){
        for(int i =0;i<=n;i++){
            for(int j = 0 ;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
            
        }
        
    }
    public static void but(int n){
        for(int i =0;i<=n;i++){
            for(int j = 0 ;j<=n-i;j++){
                System.out.print("*");

            }
            System.out.println();
        }       
    }
    public static void main(String args[]){
        butt(5);but(5);

    }

    
}
