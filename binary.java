public class binary {
    public static void binarytodecimal(int binum){
        int mynum = binum;
        int pow = 0;
        int decnum = 0;

        while(binum >0){
            int lastdigit = binum %10;
            decnum = decnum +  (lastdigit * (int)Math.pow(2,pow));
            pow++;
            binum = binum/10;



        }
        System.out.println("decimal of "+ mynum + " = " + decnum);


    }
    public static void main(String args[]){
        binarytodecimal(101);
    }
    
}
