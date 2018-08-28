package string;

public class ValidAnagram158 {
	/**
	 * @param s:
	 *            The first string
	 * @param t:
	 *            The second string
	 * @return: true or false
	 */
	public boolean anagram(String s, String t) {
		if(s == null || t == null)
		{
			return false;
		}
		int[] counts = new int[26];
		for(char c: s.toCharArray())
		{
			int temp = c - 'a';
			// check it's valid - ignore white space etc...
			if(temp >= 0 && temp <= 25) {
				counts[temp] = counts[temp] + 1;
			}
			
		}
		for(char c: t.toCharArray())
		{
			int temp = c - 'a';
			// check it's valid - ignore white space e tc...
			if(temp >= 0 && temp <= 25) {
				if(counts[temp] == 0) {
					return false;
				} else {
					counts[temp] = counts[temp] - 1;
				}
			}
			
		}
		for(int i = 0; i < counts.length; i++)
		{
			if(counts[i] != 0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		ValidAnagram158 validator = new ValidAnagram158();
		System.out.println(validator.anagram("abcds", "abcd"));
		System.out.println(validator.anagram("abcdfed", "edfdcba"));
		
	}
}