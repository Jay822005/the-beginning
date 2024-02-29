class Student {
    private int age;
    Student() {
        System.out.println("default constructor");

    }
    void show() {
        age=10;
        System.out.println(age);
    }

}
public class Con4 {
    public static void main(String[] args) {

        Student s=new Student();
        s.show();

    }
    
}
