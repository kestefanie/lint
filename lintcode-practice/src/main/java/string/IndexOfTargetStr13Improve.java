
package string;

public class IndexOfTargetStr13Improve {

	// this is brute-force appraoch
	// takes n^2 times
	public int strStr(String source, String target) {
		if (source == null || target == null) {
			return -1;
		}
		if (source.length() == target.length() && source.length() == 0) {
			return 0;
		}
		if (target.length() == 0) {
			return 0;
		}
		if (source.length() < target.length()) {
			return -1;
		}
		int length = target.length();
		for (int current = 0; current < source.length(); current++) {
			for (int i = 0; i < length; i++) {
				if ((current + i) < source.length()) {
					if (source.charAt(current + i) == target.charAt(i)) {
						if (i == length - 1) {
							return current;
						}
					}
				} else {
					return -1;
				}
			}
		}
		return -1;
	}
	
	// Knuth–Morris–Pratt string-searching algorithm
	// takes O(n) times
	public int strStrKMP(String source, String target) {
		
		return -1;
	}

	public static void main(String[] args) {
		IndexOfTargetStr13Improve test = new IndexOfTargetStr13Improve();
		System.out.println(test.strStr("source", "target"));
		System.out.println(test.strStr("abcdabcdefg", "bcd"));
	}

}
