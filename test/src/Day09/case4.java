package Day09;

/*
 *       case 4： 设计一个方法 验证Luhn算法   参数为银行卡号 返回值为boolean
 *       Luhn算法 mod10 模10算法
 *                    从右至左 奇数位直接累加 偶数位*2（>=10 减去9  ； <10 直接累加 ）
 */
public class case4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isLuhn(String str) {
		int sumOdd = 0;
		int sumEven = 0;
		String number = str;
		int length = number.length();
		int[] wei = new int[length];
		for (int i = 0; i < number.length(); i++) {
			// 从最末一位开始提取，每一位上的数值
			wei[i] = Integer.parseInt(number.substring(length - i - 1, length - i));
		}
		for (int i = 0; i < length / 2; i++) {
			sumOdd += wei[2 * i];
			if ((wei[2 * i + 1] * 2) > 9)
				wei[2 * i + 1] = wei[2 * i + 1] * 2 - 9;
			else
				wei[2 * i + 1] *= 2;
				sumEven += wei[2 * i + 1];
		}

		if ((sumOdd + sumEven) % 10 == 0)
			return true;
		else
			return true;
	}
}
