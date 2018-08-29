package intArray;

public class RemoveDuplicateFromSorted100 {

	/*
	 * @param nums: An ineger array
	 * 
	 * @return: An integer
	 */
	public int removeDuplicates(int[] nums) {
		int duplicate = 0;
		if (nums != null && nums.length > 1) {
			for (int i = 1; i < nums.length; i++) {
				if (nums[i] != nums[i - 1]) {
					nums[i - duplicate] = nums[i];
				} else {
					duplicate++;
				}
			}
			return nums.length - duplicate;
		}
		return nums.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] { 1, 1, 2 };
		RemoveDuplicateFromSorted100 duplicateFromSorted100 = new RemoveDuplicateFromSorted100();
		System.out.println(duplicateFromSorted100.removeDuplicates(array));
	}

}
