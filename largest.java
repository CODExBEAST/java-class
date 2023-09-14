public class largest {

    public static int getlar(int numb[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numb.length;i++){
            if (largest < numb[i]){
                largest = numb[i];
            }
        }
        return largest;
    }
    public static void main(String args[])
    {
        int numb[]= {1,2,3,4,5};
        System.out.println("largest value is "+getlar(numb));
    }
    
}
