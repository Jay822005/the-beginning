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
public class En4 {
    public static void main(String[] args) {
        Student s=new Student();
        s.setData();
        s.show();
        Student s1=new Student();
        //s1.setData();
        s1.show();

    }
    
}
