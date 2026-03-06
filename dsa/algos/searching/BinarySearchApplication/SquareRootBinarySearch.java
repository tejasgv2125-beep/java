package dsa.algos.searching.BinarySearchApplication;
public class SquareRootBinarySearch {
    public static int sqrt_bs(int n){
        int s=0;
        int e = n;
        int ans =-1;
        while (s<=e){
            int mid = (s+e)/2;
            int square=mid*mid;
            if(square==n){
                return mid;
            } else if (square>n) {
                e=mid-1;//go to the left hand side of the array
            }else{
                //store the ans and move to the right
                ans=mid;//The mid value will be stored in the ans
                s=mid+1;//we move to the right to find accurate ans
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sqrt_bs(36   ));
        System.out.println(sqrt_bs(37));
    }
}
