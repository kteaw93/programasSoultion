package level0;

public class 암호해독 {
	
	public static void main(String[] args) {
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
		String result = solution(cipher, code);
		System.out.println(result);
		
	}

	private static String solution(String cipher, int code) {
		String [] arr = cipher.split("");

		String result = "";
		for(int i = 1 ; i <=arr.length/code; i++) {
			result += arr[code*i-1];
			if(code*i-1 == arr.length) {
				break;
			}
		}
		return result;
	}
}
