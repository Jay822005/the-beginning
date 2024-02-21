public class Stg4 {
    public static void main(String[] args) {
        String s="shrey";
        //public char charAt(int index)
        System.out.println(s.charAt(0));
        //public String concat(String str)
        System.out.println(s.concat("mehta"));
        s+="India";
        s+="Gt";
        System.out.println(s);
        //public boolean equals(object o)
        String s1 ="shrey";
        System.out.println(s.equals(s1));
        System.out.println(s);
        //public String subString(int begin)
        System.out.println(s1.substring(1));
        //public String subString(int begin,int end)
        System.out.println(s1.substring(0,5));
        //public int lrngth()
        System.out.println(s.length());
        //public String replace(char old,char new)
        String s2="aaabbb";
        System.out.println(s2.replace('b','a'));
        //public String toLowerCase()
        String s3=" A A A ";
        System.out.println(s3.toLowerCase());
        //public String toUpperCase()
        String s4=" b b b ";
        System.out.println(s4.toUpperCase());
        //public String trim()
        System.out.println(s3.trim());
        System.out.println(s4.trim());
        //public int indexOf(char ch)
        System.out.println(s1.indexOf('h'));
        //public int lastIndexOf(char ch)
        System.out.println(s3.lastIndexOf('A'));
        
    }
    
}
