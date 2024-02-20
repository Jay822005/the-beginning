class Calc {
    void add(int num[]) {
        int sum=0;
        for(int n:num) {
            sum+=n;
        }
        System.out.println("Ans is "+sum);
    }
}
public class Ars11 {
    public static void main(String[] args) {
        Calc C =new Calc();
        C.add(new int []{22,5,34,7});
    }
}