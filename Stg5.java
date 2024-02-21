public class Stg5 {
    public static void main(String[] args) {
        //example 1
        String s ="shrey";
        String s1=s.toUpperCase();
        String s2=s.toLowerCase();
        System.out.println(s==s1);
        System.out.println(s==s2);
        //example 2
        String s3=s.toString();
        System.out.println(s==s3);
        //example 3
        String a1=new String("shrey");
        String a2=a1.toString();
        String a3=a1.toUpperCase();
        String a4=a1.toLowerCase();
        String a5=a1.toUpperCase();
        String a6=a1.toLowerCase();

        System.out.println(a1==a6);
        System.out.println(a3==a5);

    }
}
