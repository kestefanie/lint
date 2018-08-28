package string;

public class AcontainsB55 {

	public boolean compareStrings(String A, String B) {
		if (A == null || B == null) {
			return false;
		}
		int[] counts = new int[26];
		for (char c : A.toCharArray()) {
			int position = c - 'A';
			if (position >= 0 && position <= 25) {
				counts[position] = counts[position] + 1;
			}
		}
		for (char c : B.toCharArray()) {
			int position = c - 'A';
			if (position >= 0 && position <= 25) {
				if (counts[position] == 0) {
					return false;
				} else {
					counts[position] = counts[position] - 1;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		AcontainsB55 test = new AcontainsB55();
		System.out.println(test.compareStrings("ABCD", "ABC"));
		System.out.println(test.compareStrings("ABCD", "AABC"));

	}

}
