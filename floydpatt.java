public class floydpatt {

    public static void flyd(int n){
        int counter = 1;
        for(int i=0;i<=n;i++){
            for(int j =0;j<=i;j++){

                System.out.print(counter);
                counter++;
                
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        flyd(6);

    }
}
