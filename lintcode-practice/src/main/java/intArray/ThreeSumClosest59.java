package intArray;

import java.awt.Font;
import java.util.Arrays;

import javax.naming.spi.DirStateFactory.Result;

import org.w3c.dom.css.ElementCSSInlineStyle;

public class ThreeSumClosest59 {

	/**
	 * 
	 * similiar to 2sum, using two pointer
	 * 
	 * but this time, make one fix, and another two pointers...
	 * 
	 * @param numbers:
	 *            Give an array numbers of n integer
	 * @param target:
	 *            An integer
	 * @return: return the sum of the three integers, the sum closest target.
	 */
	public int threeSumClosest(int[] numbers, int target) {
		int length = numbers.length;
		if (numbers == null || length == 0) {
			return 0;
		}
		int result = 0;
		if(length < 3)
		{
			for(int value: numbers)
			{
				result += value;
			}
			return result;
		} else {
			result = numbers[0] + numbers[1] + numbers[2];
		}
		Arrays.sort(numbers);
		for (int i = 0; i < length; i++) {
			int value = numbers[i];
			int front = i + 1;
			int end = length - 1;
			while (front < length - 1 && end > front) {
				int temp = value + numbers[front] + numbers[end];
				if (temp == target) {
					return temp;
				}
				if (Math.abs(target - temp) < Math.abs(target - result)) {
					result = temp;
				}
				if (temp > target) {
					end--;
				} else {
					front++;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		ThreeSumClosest59 test = new ThreeSumClosest59();
		int[] sample = new int[]{-1, 2, 1, -4};
		System.out.println(test.threeSumClosest(sample, 1));
	}

}
