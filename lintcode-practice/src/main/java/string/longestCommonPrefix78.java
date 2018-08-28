package string;


public class longestCommonPrefix78 {

	public String longestCommonPrefix(String[] strs) {
		if(strs != null && strs.length != 0)
        {
			String result = strs[0];
			if(result.length() == 0)
			{
				return "";
			}
        		for(int i =1; i < strs.length; i++)
        		{
        			if(strs[i].length() == 0)
        			{
        				return "";
        			}
        			String tempResult = "";
        			for(int j = 0; j < strs[i].length(); j++)
        			{
        				if(j < result.length() && (result.charAt(j) == strs[i].charAt(j)))
        				{
        					tempResult += result.charAt(j);
        				} else {
        					break;
        				}
        			}
        			result = tempResult;
        		}
        		return result;
        }
		return "";
    }
	
	public static void main(String[] args) {
		longestCommonPrefix78 test = new longestCommonPrefix78();
		System.out.println(test.longestCommonPrefix(new String [] {"ABCDEFG", "ABCEFG", "ABCEFA"}));

	}

}
