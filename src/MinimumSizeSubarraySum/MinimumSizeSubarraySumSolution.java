package MinimumSizeSubarraySum;

public class MinimumSizeSubarraySumSolution {
	public int minSubArrayLen(int s, int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int current = 0;
		int length = nums.length;
		int start = 0;
		boolean flag = false;
		for (int i = 0; i < nums.length; i++) {
			current = current + nums[i];
			while (current - nums[start] >= s) {
				current = current - nums[start];
				start++;
			}
			if (current >= s && i - start + 1 < length) {
				length = i - start + 1;
				flag = true;
			}

		}
		return flag ? length : 0;
	}
}
