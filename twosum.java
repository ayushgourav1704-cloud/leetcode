/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
import java.util.*;

class twosum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int remaining = target - nums[i];

            if(map.containsKey(remaining)){
                return new int[]{map.get(remaining),i};
            }

            map.put(nums[i],i);
        }

        return new int[]{};
    }

    public static void main(String[] args){

        twosum obj = new twosum();

        int nums[] = {2,7,11,15};
        int target = 9;

        int result[] = obj.twoSum(nums,target);

        System.out.println(result[0] + " " + result[1]);
    }
}// @lc code=end

