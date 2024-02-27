class Student {
    private int age;
    private String name;
    
    public void setData() {
        age=19;
        name="shrey";
    }

    public void show() {
        System.out.println(age+" "+name);
    }
}
class En3 {
    public static void main(String[] args) {
        Student s=new Student();
        //s.age=19;CE private member are not accesible for different class
        s.setData();
        s.show();

    }
    
}
