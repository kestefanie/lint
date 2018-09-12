package binarySearch;

public class SearchInsertPosition60 {

	/**
	 * @param A:
	 *            an integer sorted array
	 * @param target:
	 *            an integer to be inserted
	 * @return: An integer
	 */
	public int searchInsert(int[] A, int target) {
		// write your code here
		int result = 0;
		if(A != null && A.length != 0)
		{
			int start = 0;
			int end = A.length - 1;
			while(end >= start)
			{
				int middle = (start + end) / 2;
				if(A[middle] >= target)
				{
					end = middle - 1;
				} else {
					result = middle;
					start = middle + 1;
				}
			}
		} else {
			return 0;
		}
		if(result == 0 && A[0] >= target)
		{
			return 0;
		}
		return result + 1;
	}

	public static void main(String[] args) {
		SearchInsertPosition60 test = new SearchInsertPosition60();
		System.out.println(test.searchInsert(new int [] {1,3,5,6}, 5) == 2);
		System.out.println(test.searchInsert(new int [] {1,3,5,6}, 2) == 1);
		System.out.println(test.searchInsert(new int [] {1,3,5,6}, 7) == 4);
		System.out.println(test.searchInsert(new int [] {1,3,5,6}, 0) == 0);
	}

}
