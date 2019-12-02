package leetcode.problems.easy;

class AddBinary {

	public static void main(String[] args) {
		System.out.println(addBinary("1010", "1011"));
	}

	public static String addBinary(String a, String b) {
		StringBuilder binary = new StringBuilder();

		int a_len = a.length();
		int b_len = b.length();
		int i = a_len - 1;
		int j = b_len - 1;
		int carry = 0;
		while (i >= 0 || j >= 0) {
			char x = '0';
			if (i >= 0) {
				x = a.charAt(i);
			}

			char y = '0';
			if (j >= 0) {
				y = b.charAt(j);
			}
			if (x == '1' && y == '1') {
				if (carry > 0) {
					binary.insert(0,'1');
				} else {
					binary.insert(0,'0');
				}
				carry = 1;

			} else if (x == '1' || y == '1') {
				if (carry > 0) {
					binary.insert(0,'0');
					carry = 1;
				} else {
					binary.insert(0,'1');
					carry = 0;
				}
			} else if (x == '0' && y == '0') {
				if (carry > 0) {
					binary.insert(0,'1');
				} else {
					binary.insert(0,'0');
				}
				carry = 0;
			}

			i--;
			j--;

		}
		if (carry > 0) {
			binary.insert(0, '1');
		}
		return binary.toString();

	}
}