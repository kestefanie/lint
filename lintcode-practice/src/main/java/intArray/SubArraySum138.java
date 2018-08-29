package intArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArraySum138 {

	/**
	 * 
	 * The idea is to iterate through the array and for every element arr[i],
	 * calculate sum of elements form 0 to i (this can simply be done as sum +=
	 * arr[i]). If the current sum has been seen before, then there is a zero
	 * sum array
	 * 
	 * @param nums:
	 *            A list of integers
	 * @return: A list of integers includes the index of the first number and
	 *          the index of the last number
	 */
	public List<Integer> subarraySum(int[] nums) {
		if (nums == null) {
			return null;
		}
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				list.add(i);
				list.add(i);
				return list;
			}
			sum = sum + nums[i];
			if (sum == 0) {
				list.add(0);
				list.add(i);
				return list;
			}
			Integer pos = map.get(sum);
			if (pos == null) {
				map.put(sum, i);
			} else {
				list.add(pos + 1);
				list.add(i);
				return list;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int[] array = new int[]{-3, 1, 2, -3, 4};
		SubArraySum138 test = new SubArraySum138();
		System.out.println(test.subarraySum(array).toString());
	}

}
