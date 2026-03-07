package dsa.algos.backTracking;
import java.util.*;
public class Solution {
    private void solve(int[] nums, List<Integer> output,int index,List<List<Integer>> ans){
        //List<List<Integer>> list inside the list

        //💠Base case
        if(index>=nums.length){
            ans.add(new ArrayList<>(output));//Add a copy of the subset
            return;
        }
        //💠Exclude case
        solve(nums,output,index+1,ans);

        //💠Include case
        output.add(nums[index]);//Store that value and move to the next index
        solve(nums,output,index+1,ans);
        //BackTrack& remove the last answer from the ouput to go to next
        output.remove(output.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums,output,index,ans);
        return ans;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums={1,2,3};
    List<List<Integer>> ans = solution.subsets(nums);
    for(List<Integer> list:ans){
    System.out.println(list);
    }
    }
}

