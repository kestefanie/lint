package intArray;

import java.util.Arrays;

public class FirstMissingPositive189 {

	 /**
     * 
     * Your algorithm should run in O(n) time and uses constant space.
     * 
     * @param A: An array of integers
     * @return: An integer
     */
	
	// This approach requries modifying the original array
    public int firstMissingPositive(int[] A) {
    	if(A == null || A.length == 0)
    	{
    		return 0;
    	}
    	int size = A.length;
    	for(int i = 0 ; i < size; i++)
    	{
    		
    	}
    	return 0;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] sample1 = new int [] {1, 2, 0};
		int [] sample2 = new int [] {3, 4, -1, 1};
		FirstMissingPositive189 test = new FirstMissingPositive189();
		System.out.println(test.firstMissingPositive(sample1));
		System.out.println(test.firstMissingPositive(sample2));

	}

}
