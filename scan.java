/*Write a program to accept 2 integer input from the user and perform 
addition operation? */
import java.util.Scanner;
public class scanning {
    public static void main(String[] args){
    Scanner Scan = new Scanner(System.in);
    System.out.println("Enter first integer");
    int first = Scan.nextInt();
    System.out.println("Enter second integer");
    int second= Scan.nextInt();
    System.out.println("Sum = "+(first+second));
    }
}
