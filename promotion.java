import java.util.Scanner;
public class promotion {
    public void m1(double a) {
        System.out.println("double "+a);
    }
    public void m1(float a) {
        System.out.println("float "+a);
    }
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter a");
        int a = Scan.nextInt();
        promotion p = new promotion();
        p.m1(a);

    }
    
}
