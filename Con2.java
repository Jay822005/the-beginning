class Student {
    private int age;
    private String name;
    
   /*public Student() {

    }*/
    public Student() {
        age=100;
        name="shrey";
    }

    public Student(int age,String name) {
        this.age=age;
        this.name=name;
    }

    void show() {
        System.out.println(age+" "+name);
    }
}
public class Con2 {

    public static void main(String[] args) {
        Student s=new Student();
        s.show();

        Student s1=new Student(19,"shrey");
        s1.show();

    }
    
}
