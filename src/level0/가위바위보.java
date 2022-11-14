package level0;

public class 가위바위보 {

	public static void main(String[] args) {
		String rsp = "205";
		String[] result = solution(rsp);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	private static String[] solution(String rsp) {
		String result = rsp.replace("2", "0").replace("0", "5").replace("5", "2");

		String[] rspresult = rsp;
		for (int i = 0; i < rsp.length(); i++) {
			if (rsp[i].equals("2")) {
				rsp[i] = "0";
			} else if (arr[i].equals("0")) {
				arr[i] = "5";
			} else {
				arr[i] = "2";
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		return arr;
	}
}
