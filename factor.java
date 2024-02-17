/*Print all factors of the number in the input. */
import java.util.Scanner;
public class factors {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter number");
        int num =Scan.nextInt();
        for(int i=1;i<=num;i++) {
            if(num%i==0) {
                System.out.print(i+" ");
            }
        }
    }
}
