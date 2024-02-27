
class show {
    static void per() {
        System.out.println("static");
    }
    void per2() {
        System.out.println("non static");
    }
}
public class Statics {
    static int age;

    static{
        age=18;
        System.out.println("static block");
        System.out.println(age);
    }

    static void disp() {
        System.out.println("after main block");
    }
    
    public static void main(String[] args) {
        System.out.println("main block");
        disp();
        show.per();
        show s=new show();
        s.per2();
    }
}
