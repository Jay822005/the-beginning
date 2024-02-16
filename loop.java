/*Print the sum of the first ‘n’ natural numbers using a for loop, 
where n is the inputY*/
public class loops {
    public static void main(String[] args) {
        int n=10,sum=0;
        for(int i=1;i<=n;i++) {
            sum=sum+i;
        }
        System.out.println("Ans is "+sum);

    }
}
