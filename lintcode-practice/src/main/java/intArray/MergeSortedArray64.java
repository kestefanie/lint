package intArray;

import java.util.Arrays;

public class MergeSortedArray64 {

	/*
	 * 
	 * remember to sort rearrange from the last
	 * 
	 * @param A: sorted integer array A which has m elements, but size of A is m+n
	 * 
	 * @param m: An integer
	 * 
	 * @param B: sorted integer array B which has n elements
	 * 
	 * @param n: An integer
	 * 
	 * @return: nothing
	 */
	public void mergeSortedArray(int[] A, int m, int[] B, int n) {
		int index = m + n - 1;
		int posA = m - 1;
		int posB = n - 1;
		while(posA >= 0 && posB >= 0)
		{
			int valueA = A[posA];
			int valueB = B[posB];
			if(valueA >= valueB)
			{
				A[index] = valueA;
				posA--;
			} else {
				A[index] = valueB;
				posB--;
			}
			index--;
		}
		while(posB >= 0)
		{
			A[index] = B[posB];
			index--;
			posB--;
		}
	}

	public static void main(String[] args) {
		int[] A = new int[] { 1, 2, 3, 0, 0 };
		int[] B = new int[] { 4, 5 };
		MergeSortedArray64 test = new MergeSortedArray64();
		test.mergeSortedArray(A, 3, B, 2);
		System.out.println(Arrays.toString(A));

	}

}
