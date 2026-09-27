import java.util.*;
public class MinSizeSubArraySum{
  public static void main(String[] args) {
  int[]nums={2,3,1,2,4,3};
  int target=7;
  minSubArrayLen(target,nums);
  }
public static void minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int count = Integer.MAX_VALUE;
        for (int right = 0;right<nums.length;right++) {
            sum += nums[right];
            while (sum >= target) {
                count = Math.min(count, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        System.out.println(count==Integer.MAX_VALUE ? 0 : count);
    }
  }