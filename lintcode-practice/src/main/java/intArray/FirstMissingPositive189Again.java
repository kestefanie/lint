package intArray;

import java.util.Arrays;

public class FirstMissingPositive189Again {

	/**
	 * 
	 * Your algorithm should run in O(n) time and uses constant space.
	 * 
	 * @param A:
	 *            An array of integers
	 * @return: An integer
	 */

	// This approach requries modifying the original array
	public int firstMissingPositive(int[] A) {
		if (A == null) {
            return 1;
        }

        for (int i = 0; i < A.length; i++) {
            while (A[i] > 0 && A[i] <= A.length && A[i] != (i+1)) {
                int tmp = A[A[i]-1];
                if (tmp == A[i]) {
                    break;
                }
                A[A[i]-1] = A[i];
                A[i] = tmp;
            }
        }

        for (int i = 0; i < A.length; i ++) {
                if (A[i] != i + 1) {
                    return i + 1;
                }
        }

        return A.length + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sample1 = new int[]{1, 2, 0};
		int[] sample2 = new int[]{99, 94, 96, 11, 92, 5, 91, 89, 57, 85, 66, 63,
				84, 81, 79, 61, 74, 78, 77, 30, 64, 13, 58, 18, 70, 69, 51, 12,
				32, 34, 9, 43, 39, 8, 1, 38, 49, 27, 21, 45, 47, 44, 53, 52, 48,
				19, 50, 59, 3, 40, 31, 82, 23, 56, 37, 41, 16, 28, 22, 33, 65,
				42, 54, 20, 29, 25, 10, 26, 4, 60, 67, 83, 62, 71, 24, 35, 72,
				55, 75, 0, 2, 46, 15, 80, 6, 36, 14, 73, 76, 86, 88, 7, 17, 87,
				68, 90, 95, 93, 97, 98};
		FirstMissingPositive189Again test = new FirstMissingPositive189Again();
		System.out.println(test.firstMissingPositive(sample1));
		System.out.println(test.firstMissingPositive(sample2));

	}

}
