package string;


public class LongestCommonString79Improve {

	// Brute-Force
	// compare like a zipper
	public int longestCommonSubstring(String A, String B) {
		int result = 0;
		if (A != null && B != null) {
			if (A.length() < B.length()) {
				String temp = A;
				A = B;
				B = temp;
			}
			int tempCount = 0;
			for (int i = 0; i < A.length(); i++) {
				tempCount = 0;
				for (int j = 0; j < B.length(); j++) {
					if ((i + j) < A.length()) {
						// System.out.println(i + " " + j);
						if (A.charAt(i + j) == B.charAt(j)) {
							tempCount++;
						} else {
							if (tempCount > result) {
								result = tempCount;
							}
							tempCount = 0;
						}
					} else {
						if (tempCount > result) {
							result = tempCount;
						}
						tempCount = 0;
						break;
					}
				}
				if (tempCount > result) {
					result = tempCount;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		LongestCommonString79Improve test = new LongestCommonString79Improve();
		System.out.println(test.longestCommonSubstring(
				"ja;jfadflakjdfa;djfadfdnvadbfkbH:DADHFLDSHfakldhflakdf;adfasdhfaufhakdbalbgaldbalkdfafhalkdsfhalsdufhakldbakladshfuojfanjoiehflakshf",
				"adfanbajfasdjfaodjfaldfnasldfjao"));
	}

}
