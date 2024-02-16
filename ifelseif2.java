/*Print the maximum of 3 numbers a, b, c taken as input.*/
public class ifelseif2 {
    public static void main(String[] args) {
        int a=30,b=30,c=30;
        if(a>=b && a>=c) {
            System.out.println("Maximum number is "+a);
        }
        else if(b>=a && b>=c) {
            System.out.println("Maximum number is "+b);
        }
        else {
            System.out.println("Maximum number is "+c);
        }
    }
}
