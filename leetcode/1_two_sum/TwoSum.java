import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i){
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[]{};	
    }
}


public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        Solution a = new Solution();
        int[] ans = a.twoSum(nums, 9);
        if (ans.length == 2) {
            System.out.println(ans[0]  + " " + ans[1]);
        } else {
            System.out.println("No answer");
        }

    }
}