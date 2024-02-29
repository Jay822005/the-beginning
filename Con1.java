class Student {
    private int age;
    private String name;

    public Student(int age,String name) {
        this.age=age;
        this.name=name;
    }
    int getAge() {
        return age;
    }
    String getName() {
        return name;
    }
}
public class Con1 {
    public static void main(String[] args) {
        Student s=new Student(19,"shrey");
        int stu1age=s.getAge();
        String stu1name=s.getName();
        System.out.println(stu1age+" "+stu1name);
    }
    
}
