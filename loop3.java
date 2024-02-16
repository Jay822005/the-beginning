/*Print the sum of the first 10 natural odd numbers using do while loop. */
public class loop3 {
    public static void main(String[] args) {
        int i=1,sum=0;
        do{
            if(i%2==1){
                sum=sum+i;
            }
            i++;
        }while(i<=10);
        System.out.println("Ans is "+ i);
    }

}
