public class Stg15 {
    public static void main(String[] args) {
        String str=new String("shrey");
        str=str.concat("mehta");
        System.out.println(str);
        
       /*  final String str1=new String("shrey");
        str1=str1.concat("mehta");
        System.out.println(str1); CE */

        StringBuffer str2=new StringBuffer("shrey");
        str2.append("mehta");
        System.out.println(str2);
        str2=new StringBuffer("kheladi");

      /*   final StringBuilder str3=new StringBuilder("shrey");
        str3.append("mehta");
        System.out.println(str3);
        str3=new StringBuilder("kheladi");  CE */
        /* final keyword ke use karne se wo kabhi dusre
         object ko reffer nahi kar sakta */

    }
}
