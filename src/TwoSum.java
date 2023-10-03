import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  static class Solution {
    public int[] twoSum(int[] nums, int target) {

      Map<Integer, Integer> hash = new HashMap<>();

      for(int i=0;i<nums.length;i++){
        int missingNumberToTarget = target - nums[i];
        if(hash.containsKey(missingNumberToTarget)){
          return new int[]{hash.get(missingNumberToTarget), i};
        }
        hash.put(nums[i],i);
      }
      return null;
    }
  }
}
