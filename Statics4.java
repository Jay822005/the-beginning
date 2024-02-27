class Student {
    int age=5;
    static String school;

    static{
        school="pw";
    }
    void show() {
        System.out.println(age+" "+school);
    }
    static void study() {
        System.out.println("studying");
    }
    void show1() {
        System.out.println(age+" "+school);
    }


}
class Statics4 {
    static{
        System.out.println("in static block");
    }
    public static void main(String[] args) {
        System.out.println("in main block");

        Student obj=new Student();
        Student.study();
        obj.age=19;
        obj.school="pwskills";

        Student obj1=new Student();
        System.out.println(obj1.school);

        obj.show();
        obj1.show();
        obj1.school="umta";

        obj.show1();
        obj1.show1();

        
    }
}