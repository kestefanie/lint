package binarySearch;

import static junit.framework.Assert.assertTrue;


public class Sqrt141 {

	/**
	 * @param x:
	 *            An integer
	 * @return: The sqrt of x
	 */
	public int sqrt(int x) {
		// write your code here
		long result = 0;
		if (x > 0) {
			long difference = x;
			long start = 0;
			long end = x;
			while (end >= start) {
				long middle = (start + end) / 2;
				long temp = middle * middle;
				System.out.println(temp);
				if(temp > Integer.MAX_VALUE)
				{
					end = middle - 1;
					continue;
				}
				if (temp == x) {
					return (int) middle;
				} else {
					if (temp > x) {
						end = middle - 1;
					} else {
						start = middle + 1;
						if ((x - temp) < difference) {
							difference = x - (int) temp;
							result = middle;
						}
					}
				}
			}
		}
		return (int) result;
	}

	public static void main(String[] args) {
		Sqrt141 test = new Sqrt141();
		System.out.println(test.sqrt(3) == 1);
		System.out.println(test.sqrt(4) == 2);
		System.out.println(test.sqrt(5) == 2);
		System.out.println(test.sqrt(10) == 3);
		System.out.println(test.sqrt(999999999) == 31622);
	}
}
