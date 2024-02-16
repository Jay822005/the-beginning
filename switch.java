/*Write a program to print the day name based upon the day number.
1 - Monday, 2 - Tuesday, etc. */
public class switches {
    public static void main(String[] args) {
        int Daynum=4;
        switch(Daynum) {
            case 1 : 
            System.out.println("Monday");
            break;
            case 2 :
            System.out.println("Tuesday");
            break;
            case 3 :
            System.out.println("Wednesday");
            break;
            case 4 :
            System.out.println("Thursday");
            break;
            case 5 :
            System.out.println("Friday");
            break;
            case 6 :
            System.out.println("Saturday");
            break;
            case 7 :
            System.out.println("Sunday");
            break;

            default : System.out.println("Diffent number");
        }

    }
}
