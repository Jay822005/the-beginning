public class Stg3 {
    public static void main(String[] args) {
        String s1 = "shrey";
        String s2 = "shrey";
        String s7 = "sHrey";
        System.out.println(s1==s2);
        System.out.println(s1==s7);

        String s3 = "Hello";
        String s4 = new String("Hello");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

        String s5 = new String("mehta");
        String s6 = new String("mehta");
        System.out.println(s5==s6);
    }
    
}
