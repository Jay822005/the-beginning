//concatenation
public class Stg6 {
    public static void main(String[] args) {
        String s1=new String("shrey");
        String s2=s1.concat("mehta");
        System.out.println(s2);
        System.out.println(s1);
        s1=s1.concat("mehta");
        System.out.println(s1);

        String a1="pw java";
        String a2=a1.concat("skill");
        String a3=new String("pw java");
        a3=a3.concat("skill");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        String b1="pw";
        String b2="pw"+"java";
        String b3="pw"+"java"+"skill";
        String b4=b1+b2;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        String str = "pw"+100+99;
        System.out.println(str);
    }
    
}