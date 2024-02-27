import java.util.Scanner;
class farmer {
    int am;
    float td;
    static float rate =8.0f;//we can save memory using static keyword 
    float intrest;

    void data() {
    
   
    Scanner Scan=new Scanner(System.in);
    System.out.println("enter ammount");
    am=Scan.nextInt();
    System.out.println("enter time duration");
    td=Scan.nextInt();
    }

    void calc() {
    intrest=(am*rate*td)/100f;
    }
    void show() {
        System.out.println("aapko intna intrest dena padega "+intrest);
    }
}

public class Statics3 {
    public static void main(String[] args) {
        farmer f=new farmer();
        f.data();
        f.calc();
        f.show();
        farmer f1=new farmer();
        f1.data();
        f1.calc();
        f1.show();
    }
    
}
