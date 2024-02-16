/*Write a program to identify people as “Child” (age < 12), “Teenager” 
(12 <= age < 18) or “Adult” (age >= 18).*/
public class ifelseif {
    public static void main(String[] args) {
        int age=18;
        if(age<12) {
            System.out.println("Child");
        }
        else if(12<=age && age<18) {
            System.out.println("Teenager");
        }
        else {
            System.out.println("Aduld");
        }
    }
}