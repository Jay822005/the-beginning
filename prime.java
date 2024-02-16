/*Tell if the number in the input is prime or not. */
public class prime {
    public static void main(String[] args) {
        int n=7,m=n/2,flag=0;
        for(int i=2;i<m;i++) {
            if(n%i==0) {
                flag++;
                break;
        }
    }
        if(flag==0)
        {
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
