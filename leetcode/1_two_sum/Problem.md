### Two Sum Problem

#### [Link](https://leetcode.com/problems/two-sum/description/)

#### Solutions
**1. Java**
```java
import java.util.HashMap;
import java.util.Map;

public class TwoSum{


	public static int[] twoSum(int[] nums, int target){
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++){
		    int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
		}
        return new int[]{};
	}



    public static void TwoSum(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        if(result.length == 2){
            System.out.println("Two numbers found at indices: " + result[0] + " and " + result[1]);
        }else{
            System.out.println("No solution found");
        }

    }
		
}

```
**2. Python**
**3. C++**