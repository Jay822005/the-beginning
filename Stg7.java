public class Stg7 {
    public static void main(String[] args) {
        //example 1 using + operator
        String s1="shrey";
        String s2="mehta";
        String s3=s1+" "+s2;
        System.out.println(s3);

        //example 2 using the concate method
        String a1="shrey";
        String a2="mehta";
        String a3=a1.concat(" ").concat(a2);
        System.out.println(a3);

        //example 3
        String b1=new String("shrey");
        b1.concat("mehta");
        b1=b1.concat("mehta");
        System.out.println(b1);
        b1="hero";
        System.out.println(b1);

        //example 4
        String c1=new String("hello");
        c1.concat("world");
        c1+="hi";
        System.out.println(c1);
        String c2=c1.concat("moj");
        System.out.println(c2);

    }
    
}
