/*Print all values between 1 and 100, except if it’s a multiple of 3*/
public class continues {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++) {
            if(i%3==0) {
                continue;
            }
            else{
                System.out.println(i);
            }
            System.out.println();
        }
    }
}
