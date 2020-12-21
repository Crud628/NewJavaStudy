package Day9;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ababcdabac";
		String str2 = "mcavcabcdmz";
		System.out.println(getCommonStrLength(str1, str2));
		System.out.println(lcst(str1,str2));
	}
	/**
	 * 动态规划   最长公共子串
	 * @param str1
	 * @param str2
	 * @return   最长子串
	 */
	public static String getCommonStrLength(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int index = 0;
        int max = 0;
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                if (dp[i][j] > max) {
                    max = dp[i][j];
                    index = j;
                }
            }
        }
        return str2.substring(index - max,index); 
    }
	
	
	/**
	 *   压缩空间
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static String lcst(String str1, String str2) {
		if (str1 == null || str2 == null || str1.equals("") || str2.equals("")) {
			return "";
		}
		char[] chs1 = str1.toCharArray();
		char[] chs2 = str2.toCharArray();
		int row = 0; //斜线开始位置的行数
		int col = chs2.length - 1; //斜线开始位置的列
		int max = 0; //t通道的全局最大值
		int end = 0; 
		while (row < chs1.length) {
			int i = row;
			int j = col;
			int len = 0;
			while (i < chs1.length && j < chs2.length) {
				if (chs1[i] != chs2[j]) {
					len = 0;
				} else {
					len++;
				}
				if (len > max) {
					end = i;
					max = len;
				}
				i++;
				j++;
			}
			if (col > 0) { 
				col--;
			} else { 
				row++;
			}
		}
		return str1.substring(end - max + 1, end + 1);
	}

}
