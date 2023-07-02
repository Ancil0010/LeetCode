import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            if (map.containsKey(target - nums[index])) {
                indices[1] = index;
                indices[0] = map.get(target - nums[index]);
                return indices;
            }
            map.put(nums[index], index);
        }
        return indices;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        System.out.println("Input nums: " + Arrays.toString(nums));
        System.out.println("Target: " + target);
        System.out.println("Indices: " + Arrays.toString(result));
    }
}