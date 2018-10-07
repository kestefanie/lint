package binarySearch;

public class FindMinInRotatedSortedArray159 {

	/**
	 * @param nums:
	 *            a rotated sorted array
	 * @return: the minimum number in the array
	 * 
	 * process: 
	 * 
	 */
	public int findMin(int[] nums) {
		int result = -1;
		if (nums != null && nums.length != 0) {
			int start = 0;
			int end = nums.length - 1;
			// check if the array is rotated
			if(nums[end] >= nums[start])
			{
				return nums[start];
			}
			while (end >= start) {
				int middle = (start + end) / 2;
				int value = nums[middle];
				//System.out.println("start=" + start + " middle=" + middle + " end=" + end);
				if (value >= nums[start]) {
					start = middle + 1;
					// this is important!!!!
					if(nums[start] < value)
					{
						return nums[start];
					}
				} else {
					if(middle !=0 && value < nums[middle-1])
					{
						return value;
					}
					end = middle - 1;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		FindMinInRotatedSortedArray159 test = new FindMinInRotatedSortedArray159();
		int[] sample = new int[]{4, 5, 6, 7, 0, 1, 2};
		System.out.println(test.findMin(sample) == 0);
	}

}
