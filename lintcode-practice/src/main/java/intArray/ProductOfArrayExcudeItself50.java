package intArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfArrayExcudeItself50 {

	/*
	 * @param nums: Given an integers array A
	 * 
	 * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... *
	 * A[n-1]
	 */
	public List<Long> productExcludeItself(List<Integer> nums) {
		if (nums == null || nums.size() == 0) {
			return null;
		} else {
			int size = nums.size();
			Long[] result = new Long[size];
			Long[] backwardMultiply = new Long[size];
			long backwardSum = 1;
			for (int i = size - 1; i >= 0; i--) {
				backwardSum *= nums.get(i);
				backwardMultiply[i] = backwardSum;
			}
			long forwardSum = 1;
			for (int i = 0; i < size; i++) {
				if (i + 1 < size) {
					result[i] = forwardSum * backwardMultiply[i + 1];
				} else {
					result[i] = forwardSum;
				}
				forwardSum *= nums.get(i);
			}

			return Arrays.asList(result);
		}
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		ProductOfArrayExcudeItself50 test = new ProductOfArrayExcudeItself50();
		System.out.println(test.productExcludeItself(list).toString());
	}

}
