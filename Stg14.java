public class Stg14 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("shreypareshbhaimehta");
        sb.delete(5, 15);
        System.out.println(sb);
        sb.deleteCharAt(6);
        System.out.println(sb);

        StringBuffer sb1=new StringBuffer("shrey");
        sb1.reverse();
        System.out.println(sb1);

        sb.setLength(5);
        System.out.println(sb);

        StringBuffer sb2=new StringBuffer(1000);
        System.out.println(sb2.capacity());
        sb2.append("shrey");
        System.out.println(sb2.capacity());
        sb2.trimToSize();
        System.out.println(sb2.capacity());

        StringBuffer sb3=new StringBuffer();
        System.out.println(sb3.capacity());
        sb3.ensureCapacity(100);
        System.out.println(sb3.capacity());

        StringBuffer sb4=new StringBuffer();
        sb4.append("shrey").insert(5,"mehta").
        reverse().append("IND").delete(0, 4).reverse();
        System.out.println(sb4);
    }
}