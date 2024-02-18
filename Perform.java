public class Perform {
    public int m1(int a,int b) {
        int result = a+b;
        return result;
    }
    public int m1(int a,int b,int c) {
        int result = a+b+c;
        return result;
    }

    public static void main(String[] args) {
        Perform obj1 = new Perform();
       System.out.println("Ans1 is "+obj1.m1(1,2)+
                          "Ans2 is "+obj1.m1(1,2,3));

    }
    
}
