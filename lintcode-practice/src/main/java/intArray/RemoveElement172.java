package intArray;

import java.util.Arrays;

public class RemoveElement172 {
	/*
	 * @param A: A list of integers
	 * 
	 * @param elem: An integer
	 * 
	 * @return: The new length after remove
	 */
	public int removeElement(int[] A, int elem) {
		if (A != null) {
			int result = A.length;
			int count = 0;
			for (int i = 0; i < A.length; i++) {
				if (A[i] == elem) {
					count++;
					result--;
				} else {
					if (count != 0) {
						A[i - count] = A[i];
					}
				}
			}
			return result;
		}
		// write your code here
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] example = new int[]{0, 4, 4, 0, 0, 2, 4, 4};
		RemoveElement172 test = new RemoveElement172();
		System.out.println(test.removeElement(example, 4));
		System.out.println((Arrays.toString(example)));
	}
}
