class Student {
    private int age;
    private String name;

    void setData() {
        age=19;
        name="shrey";
    }
    void show() {
        System.out.println(age+" "+name);
    }
}
public class En5 {
    public static void main(String[] args) {
        Student s=new Student();
        Student s1=new Student();
        s.setData();
        s1.setData();
        s.show();
        s1.show();

    }
    
}
