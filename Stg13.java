public class Stg13 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("shreypareshbhaimehta");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(10));

        StringBuilder sb1=new StringBuilder("shrey");
        sb1.setCharAt(1,'H');
        System.out.println(sb1);

        StringBuffer sb2=new StringBuffer();
        sb2.append("PI value is : ");
        sb2.append("3.1414");
        sb2.append(" This is exectly");
        sb2.append(" true");
        System.out.println(sb2);

        StringBuffer sb3=new StringBuffer("shreyehta");
        sb3.insert(5,'m');
        System.out.println(sb3);
    }
    
}
