class Student {
    int age;
    String name;

    void show() {
        System.out.println(age+" "+name);
    }
}
public class En2 {
    public static void main(String[] args) {
        Student s=new Student();
        s.age=19;
        s.name="shrey";
        s.show();
    }
    
}
