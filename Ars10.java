class Calc {

    int add(int arr[]) {
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum +=arr[i];
        }
        return sum;
    }
}
public class Ars10 {
    public static void main(String[] args) {
        Calc C = new Calc();
        int nums[]={3,7,9,1};
        int sum=C.add(nums);
        System.out.println("Ans is "+sum);
    }
    
}