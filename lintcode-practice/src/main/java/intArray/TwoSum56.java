package intArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum56 {

	/**
	 * 
	 * 1. sorted the array, and use pointer from start and end (nlogn) 2. use
	 * hash, taking (n)
	 * 
	 * @param numbers:
	 *            An array of Integer
	 * @param target:
	 *            target = numbers[index1] + numbers[index2]
	 * @return: [index1, index2] (index1 < index2)
	 */
	public int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		if (numbers == null || numbers.length == 0) {
			return result;
		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			int other = target - numbers[i];
			if (map.get(other) != null) {
				result[0] = map.get(other);
				result[1] = i;
				return result;
			} else {
				map.put(numbers[i], i);
			}

		}
		return result;
	}

	public static void main(String[] args) {
		int[] array = new int[]{2, 7, 11, 15};
		TwoSum56 test = new TwoSum56();
		System.out.println(Arrays.toString(test.twoSum(array, 9)));
	}

}
