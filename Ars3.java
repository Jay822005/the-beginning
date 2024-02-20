//2d array
public class Ars3 {
    public static void main(String[] args) {
        int nums[][] = new int[2][2];
        nums[0][0]=3;
        nums[0][1]=1;
        nums[1][0]=8;
        nums[1][1]=0;
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }
}
