package intArray;

public class PartitionArray31Again {

	/**
	 * @param nums:
	 *            The integer array you should partition
	 * @param k:
	 *            An integer
	 * @return: The index after partition
	 */
	private void swap(int i, int j, int[] arr) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    /**
     *@param nums: The integer array you should partition
     *@param k: As description
     *return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {

        int pl = 0;
        int pr = nums.length - 1;
        while (pl <= pr) {
            while (pl <= pr && nums[pl] < k) {
                pl++;
            }
            while (pl <= pr && nums[pr] >= k) {
                pr--;
            }
            if (pl <= pr) {
                swap(pl, pr, nums);
            }
        }
        return pl;
    }

	public static void main(String[] args) {
		int[] sample = new int[]{3, 2, 2, 1};
		PartitionArray31Again test = new PartitionArray31Again();
		System.out.println(test.partitionArray(sample, 2));
	}

}
