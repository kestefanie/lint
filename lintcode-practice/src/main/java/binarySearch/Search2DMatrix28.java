package binarySearch;


public class Search2DMatrix28 {

	/**
	 * @param matrix:
	 *            matrix, a list of lists of integers
	 * @param target:
	 *            An integer
	 * @return: a boolean, indicate whether matrix contains target
	 */
	public boolean searchMatrix(int[][] matrix, int target) {
		// write your code here
		boolean result;
		if(matrix != null && matrix.length != 0 && matrix[0].length != 0)
		{
			int width = matrix.length;
			int length = matrix[0].length;
			// find in which row
			int start = 0, end = width - 1;
			int position = 0;
			
			while(end >= start)
			{
				int middle = (end + start) / 2;
				if(matrix[middle][0] == target)
				{
					return true;
				}
				if(matrix[middle][0] > target)
				{
					end = middle - 1;
					// how to set position is important
					position = end;
				} else {
					start = middle + 1;
					// how to set position is important
					position = middle;
				}
				
			}
			if(position < 0) {
				return false;
			}
			// do a binary search on the row
			start = 0;
			end = length - 1;
			while(end >= start)
			{
				int middle = (end + start) / 2;
				if(matrix[position][middle] == target)
				{
					return true;
				}
				if(matrix[position][middle] > target)
				{
					end = middle - 1;
				} else {
					start = middle + 1;
				}
			}
			// return false if nothing found
			return false;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Search2DMatrix28 test = new Search2DMatrix28();
		int[][] sample = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20},
				{23, 30, 34, 50}};
		System.out.println(test.searchMatrix(sample, 3) == true);
	}
}
