class Student {
    private int age;
    private String name;

    public Student() {
        this("navin", 19);
        System.out.println("default constocter");
        age=19;
        name="shrey";
    }

    public Student(String name) {
        this();
        this.name=name;
        age=190;
    }

    public Student(String name,int age) {
        this.name=name;
        this.age=age;
    }

    void show() {
        System.out.println("age is "+age);
        System.out.println("name is "+name);
    }


}
public class Con3 {
    public static void main(String[] args) {
        Student s=new Student();
        s.show();

        Student s1=new Student("shreys");
        s1.show();

    }
    
}
