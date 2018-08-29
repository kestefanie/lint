package intArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum57Again {

	/**
	 * @param numbers:
	 *            Give an array numbers of n integer
	 * @return: Find all unique triplets in the array which gives the sum of
	 *          zero.
	 */
	public List<List<Integer>> threeSum(int[] numbers) {
		List<List<Integer>> result = new ArrayList<>();
		if (numbers == null || numbers.length < 3) {
			return result;
		}
		Arrays.sort(numbers);
		int length = numbers.length;
		for (int i = 0; i < length; i++) {
			int value = numbers[i];
			int front = i + 1;
			int end = length - 1;
			while (front < length - 1 && end > front) {
				int sum = value + numbers[front] + numbers[end];
				if(sum == 0)
				{
					List<Integer> list = new ArrayList<>();
					list.add(value);
					list.add(numbers[front]);
					list.add(numbers[end]);
					result.add(list);
					
				} else {
					if(sum > 0)
					{
						int prevValue = numbers[end];
						end = end - 1;
//						while(temp > front)
//						{
//							if(numbers[temp] == prevValue)
//							{
//								temp = end--;
//							}
//						}
					} else 
					{
						int nextValue = numbers[front];
						front = front + 1;
//						while(temp < end)
//						{
//							if(numbers[temp] == nextValue)
//							{
//								temp = front++;
//							}
//						}
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int [] sample = new int [] {-1, 0, 1, 2, -1, -4};
		ThreeSum57Again test = new ThreeSum57Again();
		List<List<Integer>> lists = test.threeSum(sample);
		for(List<Integer> list: lists)
		{
			System.out.println(list.toString());
		}

	}

}
