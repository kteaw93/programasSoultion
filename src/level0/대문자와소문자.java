package level0;

public class 대문자와소문자 {

	public static void main(String[] args) {
		String my_string = "aaaAAA";
		String result = solution(my_string);
		System.out.println(result);
	}

	private static String solution(String my_string) {
		String[] arr = my_string.split("");
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			boolean k = Character.isUpperCase(arr[i].charAt(0));
			if (k == false) {
				arr[i].toUpperCase();
				result += arr[i].toUpperCase();
			} else {
				arr[i].toLowerCase();
				result += arr[i].toLowerCase();
			}
		}
		return result;
	}
}
