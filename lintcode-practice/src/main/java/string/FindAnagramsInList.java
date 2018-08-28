package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FindAnagramsInList {

	/*
	 * brute-force apporach is to sort the char [], and compare one by one
	 */

	/**
	 * @param strs:
	 *            A list of strings
	 * @return: A list of strings
	 * 
	 *          this is to use prime number property: a natural numebr greater than
	 *          1 that can't be formed by multiplying two smaller natural number
	 */
	public List<String> anagrams(String[] strs) {
		List<String> result = new ArrayList<String>();
		int[] prime = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
				103 };
		Map<Integer, List<Integer>> map = new LinkedHashMap<Integer, List<Integer>>();
		if (strs != null) {
			for (int index = 0; index < strs.length; index++) {
				char[] chars = strs[index].toCharArray();
				int multiply = 1;
				for (char c : chars) {
					int i = c - 'a';
					multiply = multiply * prime[i];
				}
				List<Integer> list = map.get(multiply);
				if (list == null) {
					list = new ArrayList<Integer>();
					map.put(multiply, list);
				}
				list.add(index);
			}
			for (List<Integer> list : map.values()) {
				if (list.size() > 1) {
					list.forEach(item -> result.add(strs[item]));
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		FindAnagramsInList t = new FindAnagramsInList();
		String[] test = { "lint", "intl", "inlt", "code" };
		System.out.println(Arrays.toString(t.anagrams(test).toArray()));
	}

}
