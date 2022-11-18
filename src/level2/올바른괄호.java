package level2;

public class 올바른괄호 {
	public static void main(String[] args) {
		String s = "(())()";
		boolean answer = solution(s);
		System.out.println(answer);
	}

	private static boolean countS(String[] arr) {
		int cnt1 = 0;
		int cnt2 = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("(")) {
				cnt1++;
			} else {
				cnt2++;
				
			}
		}
		if (cnt1 == cnt2) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean solution(String s) {
		String arr[] = s.split("");
		boolean cut = false;
		if (arr[0].equals("(") && arr.length % 2 == 0) {
			cut = countS(arr);
			return cut;
		}
		return cut;
	}

}
