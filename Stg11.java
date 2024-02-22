public class Stg11 {
    public static void main(String[] args) {
        boolean flag = false;
        String str="THE QUICK BROWN FOX JUMPS OVER LAZY DOG";

        str=str.replace(" ","");

        char ar1[]=str.toCharArray();
        int ar2[]=new int[26];
        
        for(int i=0;i<ar1.length;i++) {
            ar2[ar1[i]-65]++;
        }

        for(int i=0;i<ar2.length;i++) {
            if(ar2[i]==0) {
                System.out.println("It is not pangram");
                flag=true;
            }
        }

        if(flag==false) {
            System.out.println("It is an pangram");
        }
    }
    
}
