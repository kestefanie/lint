package binarySearch;

public class FirstPositionOfTarget14 {

	/**
	 * 
	 * @param nums:
	 *            The integer array.
	 * @param target:
	 *            Target to find.
	 * @return: The first position of target. Position starts from 0.
	 * 
	 *          process: keep doing the binary search, remember the first
	 *          position found, and then doing the binary search on left
	 * 
	 */
	public int binarySearch(int[] nums, int target) {
		int result = -1;
		if(nums != null && nums.length != 0)
		{
			int start = 0;
			int end = nums.length - 1;
			while(end >= start)
			{
				int middle = (end + start) / 2;
				int value = nums[middle];
				if(value == target)
				{
					result = middle;
					end = middle - 1;
				}
				if(value > target)
				{
					end = middle - 1;
				}
				if(value < target)
				{
					start = middle + 1;
				}
			}
			
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstPositionOfTarget14 test = new FirstPositionOfTarget14();
		int[] sample = new int[]{1, 2, 3, 3, 4, 5, 10};
		System.out.println(test.binarySearch(sample, 3) == 2);
	}

}
