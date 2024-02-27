//shadowing problem
class Student {
    private int age;
    private String name;

    void setData(int age) {
        //age=age;
        this.age=age;
    }
    void setData1() {
        name="shrey";
    }
    void show() {
        System.out.println(age+" "+name);
    }
}
public class En7 {
    public static void main(String[] args) {
        Student s=new Student();
        Student s1=new Student();

        s.setData(19);
        s1.setData(100);
        s.show();
        s1.show();
    }
    
}
