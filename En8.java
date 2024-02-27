class Student {
    private int age;
    private String name;

    void setAge(int age) {
        this.age=age;
    } 
    int getAge() {
        return age;
    }

    void setName(String name) {
        this.name=name;
    }
    String getName() {
        return name;
    }

    void show() {
        System.out.println(age+" "+name);
    }
}
public class En8 {
    public static void main(String[] args) {
        Student s=new Student();
        Student s1=new Student();

        s.setAge(19);
        s1.setAge(100);
        s.setName("shrey");
        s1.setName("hello");
        int stu1age=s.getAge();
        String stu1name=s.getName();
        int stu2age=s1.getAge();
        String stu2name=s1.getName();

        System.out.println(stu1age+" "+stu1name);
        System.out.println(stu2age+" "+stu2name);



    }
    
}
