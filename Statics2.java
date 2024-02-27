class show {
    static int a;
    static int b;

    int m;
    int n;

    static {
        a=10;
        b=20;
        System.out.println("control in static block");
    }

    {
        m=100;
        n=200;
        System.out.println("control in non static block");
    }

    static void disp() {
        System.out.println("value of a is "+a);
        System.out.println("value of b is "+b);
       /*  System.out.println("value of m is "+m); CE case 2 non static
       variable we can not using directly kyoki uske liye ob banana padega
       then variable ko memory milegi*/
    }
    void disp1() {
        System.out.println("value of m is "+m);
        System.out.println("value of n is "+n);
       /* System.out.println("value of a is "+a);case 1 non static method
       also use static variable without any ob creation kyoki usko memory
       loading ke douran mil gai hain..*/
    }
}
public class Statics2 {
    public static void main(String[] args) {
        show.disp();
        show s=new show();
        s.disp1();

    }
    
}
