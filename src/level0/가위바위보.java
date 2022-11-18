package level0;

public class 가위바위보 {

	public static void main(String[] args) {
		String rsp = "205";
		String result = solution(rsp);
		System.out.println(result);
	}

	private static String solution(String rsp) {
		//String result = rsp.replace("2", "0").replace("0", "5").replace("5", "2");

		String[] arr = rsp.split("");
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("2")) {
				arr[i] = "0";
			} else if (arr[i].equals("0")) {
				arr[i] = "5";
			} else {
				arr[i] = "2";
			}
			result+=arr[i];
		}

		return result;
	}
}
