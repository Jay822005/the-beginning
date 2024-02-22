public class Stg8 {
    public static void main(String[] args) {
        //convert pwjava to avajwp
        String str1="pwjava";
        String str2="";
        for(int i=str1.length()-1;i>=0;i--) {
            str2=str2+str1.charAt(i);
        }
        System.out.println("before reversing "+str1);
        System.out.println("after reversing "+str2);

        //convert pwskill java to java pwskill
        String str3="pwskill java";
        String str4="";
        String arr[]=str3.split(" ");
        for(int i=arr.length-1;i>=0;i--) {
            str4=str4+arr[i]+" ";
        }
        System.out.println("before reversing "+str3);
        System.out.println("after reversing "+str4);

        //convert pwskill java to avaj llikswp
        String str5="";
        for(int i=str3.length()-1;i>=0;i--) {
            str5=str5+str3.charAt(i);
        }
        System.out.println("before reversing "+str3);
        System.out.println("after reversing "+str5);

        //convert pwskill java to llikswp avaj
        String str6="";
        String arr1[]=str3.split(" ");
        for(String latter:arr1) {
            for(int i=latter.length()-1;i>=0;i--) {
                str6=str6+latter.charAt(i);
            }
            str6=str6+" ";
        }
        System.out.println("before reversing "+str3);
        System.out.println("after reversing "+str6);

    }
    
}
