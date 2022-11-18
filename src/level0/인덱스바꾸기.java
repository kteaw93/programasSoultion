package level0;

public class 인덱스바꾸기 {

	public static void main(String[] args) {
		String my_string = "I love you";
		int num1 = 3;
		int num2 = 6;

		String result = solution(my_string, num1, num2);
		System.out.println(result);
	}

	private static String solution(String my_string, int num1, int num2) {
		
		String arr[] = my_string.split("");
		String result = "";
		for(int i = 0; i <arr.length; i++) {
			if( i == num1) {
				result += arr[num2];
			}else if(i == num2) {
				result += arr[num1];
			}else {
				result +=arr[i];
			}
		}
		return result;
	}
}
