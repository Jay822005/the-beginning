public class Stg12 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("abcdefghijklmnop");
        System.out.println(sb.capacity());
        sb.append('q');
        System.out.println(sb.capacity());

        StringBuffer sb1=new StringBuffer(20);
        System.out.println(sb1.capacity());

        StringBuffer sb2=new StringBuffer("shrey");
        System.out.println(sb2.capacity());
    }
    
}
