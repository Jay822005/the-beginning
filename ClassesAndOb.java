class Calc {
    int a=10;
    public void m1(int x,int y) {
        int add = x+y;
        System.out.println("Ans is "+add);
    }
}
public class ClassesAndOb {
    
    
    public static void main(String[] args) {
        Calc obj1 = new Calc();
        System.out.println(obj1.a);
        obj1.m1(5,50);
    }
    
}
