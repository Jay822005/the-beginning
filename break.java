/*Print the first multiple of 5 which is also a multiple of 7.*/
public class breaks {
    public static void main(String[] args) {
        for(int i=1;;i++) {
            if(i%5==0 && i%7==0) {
                System.out.println("Ans is "+i);
                break;
            }
        }
    }
}
